/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;
import oregontrail.control.ShoppingControl;
import oregontrail.exceptions.ShoppingControlException;
import oregontrail.model.Supplies;

/**
 *
 * @author Mike
 */
public class ShopAtFortView extends View {
    private int locationNum;
    private ShoppingControl shopping;
    private Supplies supplies;

    ShopAtFortView(String locationMenu) {
        super(locationMenu);
        locationNum = OregonTrail.getLocationNum();
        shopping = new ShoppingControl();
        supplies = OregonTrail.getCurrentGame().getSupplies();
    }
    
    @Override
    public boolean doAction(String value) {
        char inputChar = getInputChar(value.toUpperCase());
        if (inputChar == 'E') {
            OregonTrail.setSupplies(supplies);
            return true;
        }
        int intValue = 0;
        try {
            intValue = Integer.parseInt(value);
        } catch(NumberFormatException e) {
            console.println("You must enter a number.");
            return false;
        }
        if (intValue < 1 || intValue > shopping.getItemNames().length) {
            console.println("You must enter a number between 1 and " + 
                    shopping.getItemNames().length + "or E to exit.");
            return false;
        }
        int amount;
        try {
            amount = shoppingFor(intValue);
        } catch (ShoppingControlException ex) {
            console.println(ex);
            return true;
        }
        try {
            supplies.setSupplies(intValue, supplies.getSupplies(intValue) + amount);
        } catch (ShoppingControlException ex) {
            console.println("Error in adding to supplies in ShopAtFortView doAction()");
            return true;
        }
        supplies.setMoney(supplies.getMoney() - shopping.getPrices(locationNum, intValue - 1) * amount);
        OregonTrail.setSupplies(supplies);
        return true;
    }
    
    private int shoppingFor(int value) throws ShoppingControlException{
        int maxItem = shopping.getMaxCapacity(value - 1);
        int currentNum;
        String itemName = shopping.getItemNames(value - 1);
        try {
            currentNum = supplies.getSupplies(value);
        } catch (ShoppingControlException ex) {
            throw new ShoppingControlException(ex + " called from ShopAtFortView shoppingFor()");
        }
        String shoppingMenu = "Shopping for " + itemName + " costing $";
        int dollarValue = shopping.getPrices(locationNum, value - 1) / 100;
        int centValue = shopping.getPrices(locationNum, value - 1) %100;
        shoppingMenu += dollarValue + "." + centValue;
        if (centValue == 0)
            shoppingMenu += "0";
        shoppingMenu += "\nYou have " + currentNum + " of them.";
        int maxPurchase = supplies.getMoney() / shopping.getPrices(locationNum, value - 1);
        if (maxPurchase > (maxItem - currentNum))
            maxPurchase = maxItem - currentNum;
        shoppingMenu += "\nYou can purchase a maximum of " + maxPurchase + "."
                + "\nEnter the number to buy or a zero for none.";
        console.println(shoppingMenu);
        boolean valid = false;
        int intValue = -1;
        while (!valid) {
            String inputValue = this.getInputNoDisplay();
            try {
                intValue = Integer.parseInt(inputValue);
            } catch(NumberFormatException e) {
                intValue = -1;
            }
            if (intValue < 0 || intValue > maxPurchase){
                console.println("You must enter a number from 0 to "
                    + maxPurchase + ".");
            } else {
                valid = true;
            }
        }
        return intValue;
    }
}
