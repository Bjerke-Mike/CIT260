/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.OregonTrail;
import oregontrail.control.ShoppingControl;

/**
 *
 * @author Mike
 */
public class ChangeFort extends View {

    ChangeFort(String locationMenu) {
                super(locationMenu);

    }

    @Override
    public boolean doAction(String value) {
        int newFortNum;
        try {
            newFortNum = Integer.parseInt(value);
        } catch(NumberFormatException e) {
            console.println("You must enter a number.");
            return false;
        }
        ShoppingControl shopping = new ShoppingControl();
        int maxNum = shopping.getLocationName().length;
        if (newFortNum < 1 || newFortNum > maxNum) {
            console.println("You must enter a number between 1 and " + maxNum);
            return false;
        }
        OregonTrail.setLocationNum(newFortNum - 1);
        //this.console.println("doAction() in Change Fort " + newFortNum + "called.");
        return true;
    }
    
}
