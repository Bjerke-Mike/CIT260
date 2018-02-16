/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mike
 */
public class ShoppingControlTest {
    
    public ShoppingControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculatePrice method, of class ShoppingControl.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        int position = 0;
        String inventoryItem = "";
        ShoppingControl instance = new ShoppingControl();
        double expResult = 0.0;
        double result = instance.calculatePrice(position, inventoryItem);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
