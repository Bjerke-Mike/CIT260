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
 * @author mellissah.
 */
public class ShoppingControlView extends View {
    ShoppingControl shopping = new ShoppingControl();
    
    public ShoppingControlView(String location) throws ShoppingControlException {
        super(  "\n"
              + "\n\t-----------------------------------------"
              + "\n\t  Shopping at " + location
              + "\n\t-----------------------------------------"
              //+ "\n\t  C - Change location"
              + "\n\t  P - Purchase Supplies"
              + "\n\t  R - Report the prices to a file"
              + "\n\t  H - Get help on this menu"
              + "\n\t  E - Exit this menu."
              + "\n\t-----------------------------------------");
    }
        
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert all uppercase
        char inputChar; 
        boolean endView = false;
        
        inputChar = getInputChar(value);
        
        switch (inputChar) {
            /*case 'C':
                try {
                    this.changeLocation();
                } catch (ShoppingControlException e) {
                    ErrorView.display(this.getClass().getName(),
                    "Shopping Control Error: " + e);
                }
               break;*/
            case 'P':
                this.shopping();
                break;
            case 'R':
                this.savePrices();
                break;
            case 'H':
                getShoppingHelp();
                break;
            case 'E':
                return true;
            default: 
                this.console.println("Invalid menu item.");
        }
        return false; 
    }

    private void changeLocation() throws ShoppingControlException {
        boolean exitChangeFort = false;
        int locationNum;
        while(!exitChangeFort) {
            String locationMenu = "Select one of the following locations:\n" +
                                  "--------------------------------------\n";
            locationNum = OregonTrail.getLocationNum();
            for (int i = 0; i< shopping.getLocationName().length; i++ ) {
                if (i == locationNum) {
                    locationMenu += (i + 1) + " - * " + shopping.getLocationName(i) + "\n";
                    locationMenu += "    * Current location";
                }
                else {
                    locationMenu += (i + 1) + " -   " + shopping.getLocationName(i);
                }
                if (i != (shopping.getLocationName().length - 1))
                    locationMenu += "\n";
            }
            ChangeFort changeFort = new ChangeFort(locationMenu);
            exitChangeFort = changeFort.display();
        }
    }

    private void shopping() {
        if (!OregonTrail.isAtFort()){
            
        }
        ShoppingControl shopping = new ShoppingControl();
        String menu = "\n";
        Supplies supplies;
        supplies = OregonTrail.getCurrentGame().getSupplies();
        int locationNum = OregonTrail.getLocationNum();
        for (int i = 0; i < shopping.getItemNames().length; i++){
            String itemName =  shopping.getItemNames(locationNum);
            int nameLength = itemName.length();
            if (itemName.length() < 10) {
                for (int k = 0; k <(10 - nameLength); k++);
                    itemName += " ";
            }
            menu += (i + 1) + " - " + itemName + 
                    " $" + shopping.getPrices(i, locationNum) + "\n";
        }
        menu += "E          - Exit Shopping\n\t\tYou have $"
                + ((double) supplies.getMoney() / 100.00)
                + "\n";
        this.console.println(menu);
        //this.console.println("shopping() in Shopping Control View called.");
    }

    private void savePrices() {
        SaveShoppingReport doReport = new SaveShoppingReport();
        doReport.display();
        //this.console.println("savePrices() in Shopping Control View called.");
    }

    private void getShoppingHelp() {
        this.console.println("getShoppingHelp() in Shopping Control View called.");
    }

}
