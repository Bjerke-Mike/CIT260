/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import oregontrail.OregonTrail;
import oregontrail.exceptions.ShoppingControlException;
import oregontrail.view.ErrorView;

/**
 *
 * @author Mellisa Holland & Mike Bjerke.
 */
public class ShoppingControl {
        
    private String[] locationName = { "Independence", "Fort Kearney", "Laramie",
             "Fort Bridger", "Fort Hall", "Fort Boise", "Fort Walla Walla"};
    private String[] itemNames = { "Food", "Ammo", "Clothing", "Misc" };
    private int[][] prices = {  // Prices is in cents
        { 40, 50, 60, 70, 80, 90, 80},  // Food prices
        { 75, 80, 85, 90, 100, 120, 110},  // Ammo Prices
        { 120, 130, 150, 140, 150, 130, 140},  // Clothing Prices
        { 100, 120, 140, 150, 160, 170, 150}   // Misc Supplies prices
    };
    // Maximum for Food, Ammo, Clothing, and Misc.
    private int[] maxCapacity = {1000, 200, 10, 100};
    public String[] getLocationName() {
        return locationName;
    }

    public String getLocationName(int locationNumber)
                                  throws ShoppingControlException {
        if (locationNumber < 0 || locationNumber >= locationName.length)
            throw new ShoppingControlException("Location number is invalid.");
        return locationName[locationNumber];
    }
    
    public void setLocationName(String[] locationName) {
        this.locationName = locationName;
    }

    public String[] getItemNames() {
        return itemNames;
    }

    public String getItemNames(int itemNumber) {
        return itemNames[itemNumber];
    }

    public void setItemNames(String[] itemNames) {
        this.itemNames = itemNames;
    }

    public int[][] getPrices() {
        return prices;
    }
    public int getPrices(int itemNum, int locationNum) {
        return prices[locationNum][itemNum];
    }
    
    public void setPrices(int[][] prices) {
        this.prices = prices;
    }
    
    public double calculatePrice(int position, String inventoryItem)
                                 throws ShoppingControlException {
        if (position > 5) {
            throw new ShoppingControlException("Location is too high.");
            //return -1.0; 
        }
        if (position < 0) {
            throw new ShoppingControlException("Location is too low.");
            //return -2.0;
        }
        int itemCheck = -1;
        inventoryItem = inventoryItem.toLowerCase();
        for (int i = 0; i < itemNames.length; i++){
            if (inventoryItem.equals(itemNames[i].toLowerCase()))
                itemCheck = i;
        }
        if (itemCheck < 0) {
            throw new ShoppingControlException("Inventory Item is invalid.");
            //return -3.0;
        }
        double itemPrice = prices[itemCheck][position];
        
        return itemPrice;
    }

    public int getMaxCapacity( int itemNum) {
        return maxCapacity[itemNum];
    }
    
    public static void saveReport(String filePath)
                    throws ShoppingControlException, IOException {
        if (filePath == null || filePath.length()<1)
            throw new ShoppingControlException("Can't save: Invalid File Name");
        ShoppingControl doShopping = new ShoppingControl();
        int locationNum = OregonTrail.getLocationNum();
        String currentLocation = doShopping.getLocationName(locationNum);
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.printf("%n%21s", "Shopping Report");
            out.printf("%n%21s", currentLocation);
            out.printf("%n%-14s%7s", "Item Name", "Price" );
            out.printf("%n%-14s%7s", "---------", "-----" );
            for (int i = 0; i < doShopping.getItemNames().length; i++){
                out.printf("%n%-14s%7.2f", doShopping.getItemNames(i),
                           doShopping.getPrices(locationNum, i));
            }
            GameControl.console.println("saveGame() in GameControl class");
        }   catch (IOException e) {
                    ErrorView.display(doShopping.getClass().getName(),
                    "I/O Error: " + e);
        }
        
    }
}
