/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mellissah.
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of addToIventory method, of class InventoryControl.
     */
    @Test
    public void testAddToIventory() {
        System.out.println("addToIventory");
        
        //Test Matrix 1
        System.out.println("/tTest Matrix 1");
        
        //Define Variables
        String inventoryItem = "food";
        int amount = 30;
        
         //Call the control
        InventoryControl instance = new InventoryControl();
        
        //Define expected results
        double expResult = 300;
        double result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 1 - passed!\n");
        
        //*********************************************************
        
        //Test Matrix 2
        System.out.println("/tTest Matrix 2");
        
        //Define Variables
        inventoryItem = "food";
        amount = 2;
        
        //Define expected results
        expResult = 20;
        result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 2 - passed!\n");
    }
    
}
