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
              + "\n\t  C - Change location"
              + "\n\t  P - Show prices"
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
                this.showPrices();
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

    private void showPrices() {
        this.console.println("showPrices() in Shopping Control View called.");
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
