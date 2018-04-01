/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import oregontrail.control.ShoppingControl;
import oregontrail.exceptions.ShoppingControlException;

/**
 *
 * @author Mike
 */
public class SaveShoppingReport extends View {

    public SaveShoppingReport() {
        super("\n\tEnter the path of the file for the report:");
    }

    @Override
    public boolean doAction(String value) {
        ShoppingControl shopping = new ShoppingControl();
        try {
            shopping.saveReport(value);
        } catch (ShoppingControlException e) {
            this.console.println(e.getMessage());
            return false;
        } catch (IOException e) {
            this.console.println("I/O Error: " + e.getMessage());
            return false;
        }
        this.console.println("Report successfully saved");
        return true;

    }

    
}
