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
        
        //**********************************************************
        
        //Test Matrix 3
        System.out.println("/tTest Matrix 3");
        
        //Define Variables
        inventoryItem = "food";
        amount = 10;
        
        //Define expected results
        expResult = 100;
        result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 3 - passed!\n");
        
        //***********************************************************
        
        //Test Matrix 4
        System.out.println("/tTest Matrix 4");
        
        //Define Variables
        inventoryItem = "mystery";
        amount = 50;
        
        //Define expected results
        expResult = -20;
        result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 4 - passed!\n");
        
        //*************************************************************
        
        //Test Matrix 5
        System.out.println("/tTest Matrix 5");
        
        //Define Variables
        inventoryItem = "food";
        amount = 1;
        
        //Define expected results
        expResult = 10;
        result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 5 - passed!\n");
        
        //*****************************************************
        
        //Test Matrix 6
        System.out.println("/tTest Matrix 6");
        
        //Define Variables
        inventoryItem = "clothing";
        amount = 7;
        
        //Define expected results
        expResult = 49;
        result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 6 - passed!\n");
        
        //*******************************************************
        
        //Test Matrix 7
        System.out.println("/tTest Matrix 7");
        
        //Define Variables
        inventoryItem = "clothing";
        amount = 30;
        
        //Define expected results
        expResult = 210;
        result = instance.addToIventory(inventoryItem, amount);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println("\tTest Matrix 7 - passed!\n");
        
        System.out.println("\n\ninventoryWeight");
        
        //Test Matrix 1
        System.out.println("/tTest Matrix 1");
        
        //Define Variables
        int food = 500;
        int ammo = 15;
        int clothing = 3;
        int misc = 20;
        
        //Define expected results
        expResult = 625.5;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 1 - passed!\n");
        
        //*********************************************************

        //Test Matrix 2
        System.out.println("/tTest Matrix 2");
        
        //Define Variables
        food = -1;
        ammo = 20;
        clothing = 5;
        misc = 8;
        
        //Define expected results
        expResult = -1.0;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 2 - passed!\n");
        
        //*********************************************************

        //Test Matrix 3
        System.out.println("/tTest Matrix 3");
        
        //Define Variables
        food = 1000;
        ammo = 225;
        clothing = 4;
        misc = 25;
        
        //Define expected results
        expResult = -1.0;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 3 - passed!\n");
        
        //*********************************************************

        //Test Matrix 4
        System.out.println("/tTest Matrix 4");
        
        //Define Variables
        food = 750;
        ammo = 50;
        clothing = 11;
        misc = 50;
        
        //Define expected results
        expResult = -1.0;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 4 - passed!\n");
        
        //*********************************************************

        //Test Matrix 5
        System.out.println("/tTest Matrix 5");
        
        //Define Variables
        food = 600;
        ammo = 75;
        clothing = 2;
        misc = -1;
        
        //Define expected results
        expResult = -1.0;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 5 - passed!\n");
        
        //*********************************************************

        //Test Matrix 6
        System.out.println("/tTest Matrix 6");
        
        //Define Variables
        food = 0;
        ammo = 0;
        clothing = 0;
        misc = 0;
        
        //Define expected results
        expResult = 0.0;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 6 - passed!\n");
        
        //*********************************************************

        //Test Matrix 7
        System.out.println("/tTest Matrix 7");
        
        //Define Variables
        food = 2000;
        ammo = 200;
        clothing = 10;
        misc = 100;
        
        //Define expected results
        expResult = 2615.0;
        result = instance.inventoryWeight(food, ammo, clothing, misc);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.001);
        
        // Output Test passed
        System.out.println(result + "\tTest Matrix 7 - passed!\n");
        
        //*********************************************************

    }
    
}
