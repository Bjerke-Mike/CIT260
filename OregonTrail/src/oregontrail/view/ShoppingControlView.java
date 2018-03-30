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

    public ShoppingControlView() {
        super("\n\tEnter a position and inventory item.");
    }
        
    @Override
    public boolean doAction(String value) {
        return true;
    }

}
