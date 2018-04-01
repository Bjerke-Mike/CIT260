/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

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
        this.console.println("changeLocation() in Shopping Control View called.");
        return true;
    }
    
}
