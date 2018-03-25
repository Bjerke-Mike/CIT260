/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
import oregontrail.exceptions.ShoppingControlException;
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
        double result = 0.0;
        String errorText = "No error.";
        String inventoryItem = "Food";
        
        // Define expected results
        double expResult = 0.70;
        System.out.println(result + ", " + expResult + ", " + errorText);
        
        //call the control
        ShoppingControl instance = new ShoppingControl();
        try {
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        System.out.println(result + ", " + expResult + ", " + errorText);
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("No error."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 1 - passed!\n");

        // **************************************************
        
        // Test Matrix 2
        System.out.println("\tTest Matrix 2");
        
        // Define Variables
        position = 6;
        inventoryItem = "Food";
        errorText = "No error.";
        result = 0.0;
        
        // Define expected results
        expResult = 0.0;
        
        try {
            //call the control
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("Location is too high."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 2 - passed!\n");

        // **************************************************
        
        // Test Matrix 3
        System.out.println("\tTest Matrix 3");
        
        // Define Variables
        position = -1;
        inventoryItem = "Food";
        errorText = "No error.";
        result = 0.0;
        
        // Define expected results
        expResult = 0.0;
        
        try {
            //call the control
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("Location is too low."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 3 - passed!\n");
    
        // **************************************************
        
        // Test Matrix 4
        System.out.println("\tTest Matrix 4");
        
        // Define Variables
        position = 4;
        inventoryItem = "Mystery";
        errorText = "No error.";
        result = 0.0;
        
        // Define expected results
        expResult = 0.0;
        
        try {
            //call the control
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("Inventory Item is invalid."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 4 - passed!\n");
        
        // **************************************************
        
        // Test Matrix 5
        System.out.println("\tTest Matrix 5");
        
        // Define Variables
        position = 0;
        inventoryItem = "food";
        errorText = "No error.";
        result = 0.0;
        
        // Define expected results
        expResult = .40;
        
        try {
            //call the control
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("No error."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 5 - passed!\n");
        
        // **************************************************
        
        // Test Matrix 6
        System.out.println("\tTest Matrix 6");
        
        // Define Variables
        position = 5;
        inventoryItem = "food";
        errorText = "No error.";
        result = 0.0;
        
        // Define expected results
        expResult = 0.90;
        
        try {
            //call the control
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("No error."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 6 - passed!\n");
       
        // **************************************************
        
        // Test Matrix 7
        System.out.println("\tTest Matrix 7");
        
        // Define Variables
        position = 5;
        inventoryItem = "misc";
        errorText = "No error.";
        result = 0.0;
        
        // Define expected results
        expResult = 1.70;
        
        try {
            //call the control
            result = instance.calculatePrice(position, inventoryItem);
        } catch (ShoppingControlException e) {
            errorText = e.getMessage();
        }
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        assertTrue(errorText.equals("No error."));
        
        // Output Test passed
        System.out.println("\tTest Matrix 7 - passed!\n");
    }
    
}
