/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

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
              + "\n\t  S - Save prices to a file"
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
               this.changeLocation();
               break;
            case 'P':
                this.showPrices();
                break;
            case 'S':
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

    private void changeLocation() {
        this.console.println("changeLocation() in Shopping Control View called.");
    }

    private void showPrices() {
        this.console.println("showPrices() in Shopping Control View called.");
    }

    private void savePrices() {
        this.console.println("savePrices() in Shopping Control View called.");
    }

    private void getShoppingHelp() {
        this.console.println("getShoppingHelp() in Shopping Control View called.");
    }

}
