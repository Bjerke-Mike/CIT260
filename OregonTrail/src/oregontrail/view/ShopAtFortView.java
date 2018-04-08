/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.OregonTrail;
import oregontrail.control.ShoppingControl;
import oregontrail.model.Supplies;

/**
 *
 * @author Mike
 */
public class ShopAtFortView extends View {

    ShopAtFortView(String locationMenu) {
                super(locationMenu);
    }
    
    @Override
    public boolean doAction(String value) {
        if (value == "E")
            return true;
        int intValue;
        try {
            intValue = Integer.parseInt(value);
        } catch(NumberFormatException e) {
            console.println("You must enter a number.");
            return false;
        }
        ShoppingControl shopping = new ShoppingControl();
        Supplies supplies;
        supplies = OregonTrail.getCurrentGame().getSupplies();
        int locationNum = OregonTrail.getLocationNum();
        if (intValue < 1 || intValue > shopping.getItemNames().length)
            console.println("You must enter a number between 1 and " + 
                    shopping.getItemNames().length + "or E to exit.");
        return false;
    }
}
