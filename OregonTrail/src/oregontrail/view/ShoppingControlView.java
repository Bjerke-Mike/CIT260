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
            case 'C':
                try {
                    this.changeLocation();
                } catch (ShoppingControlException e) {
                    ErrorView.display(this.getClass().getName(),
                    "Shopping Control Error: " + e);
                }
               break;
            case 'P':
        {
            try {
                this.shopping();
            } catch (ShoppingControlException e) {
                    ErrorView.display(this.getClass().getName(),
                    "Shopping Control Error: " + e);
            }
        }
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

    private void shopping()  throws ShoppingControlException {
        if (!OregonTrail.isAtFort()){
            
        }
        ShoppingControl shopping = new ShoppingControl();
        Supplies supplies;
        supplies = OregonTrail.getCurrentGame().getSupplies();
        int locationNum = OregonTrail.getLocationNum();
        String locationName = shopping.getLocationName(locationNum);
        String menu = "\nShopping at: " + locationName + 
                      "\nSelect one of the following:\n" +
                        "--------------------------------------\n";
        
        for (int i = 0; i < shopping.getItemNames().length; i++){
            String itemName =  shopping.getItemNames(i);
            //int nameLength = itemName.length();
            int price = shopping.getPrices(locationNum, i);
            menu += (i + 1) + " - " + itemName;
            for (int k = 10; k > itemName.length(); k--)
                menu += " ";

            menu += " $" + price / 100 + "." + price % 100;
            if (price % 100 == 0)
                menu += "0";
            menu += "\n";
        }
        menu += "E - Exit Shopping\n\tYou have $"
                + ((double) supplies.getMoney() / 100.00);
            if ((supplies.getMoney() %10) == 0)
                menu += "0";
            menu += "\n";
        
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
