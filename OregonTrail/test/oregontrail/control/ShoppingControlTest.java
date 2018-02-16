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
 * @author Mike
 */
public class ShoppingControlTest {
    
    public ShoppingControlTest() {
    }

    /**
     * Test of calculatePrice method, of class ShoppingControl.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        
        // Test Matrix 1
        System.out.println("\tTest Matrix 1");
        
        // Define Variables
        int position = 3;
        String inventoryItem = "food";
        
        // Define expected results
        double expResult = 0.70;
        
        //call the control
        ShoppingControl instance = new ShoppingControl();
        double result = instance.calculatePrice(position, inventoryItem);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 1 - passed!\n");
    }
    
}
