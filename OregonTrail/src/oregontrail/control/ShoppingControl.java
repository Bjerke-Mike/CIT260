/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.exceptions.ShoppingControlException;

/**
 *
 * @author Mellisa Holland & Mike Bjerke.
 */
public class ShoppingControl {
        
    String[] itemNames = { "food", "ammo", "clothing", "misc" };
    double[][] prices = {
        { 0.40, 0.50, 0.60, 0.70, 0.80, 0.90},  // Food prices
        { 0.75, 0.80, 0.85, 0.90, 1.00, 1.20},  // Ammo Prices
        { 1.20, 1.30, 1.50, 1.40, 1.50, 1.30},  // Clothing Prices
        { 1.00, 1.20, 1.40, 1.50, 1.60, 1.70}   // Misc Supplies prices
    };

    public String[] getItemNames() {
        return itemNames;
    }

    public void setItemNames(String[] itemNames) {
        this.itemNames = itemNames;
    }

    public double[][] getPrices() {
        return prices;
    }

    public void setPrices(double[][] prices) {
        this.prices = prices;
    }
    
    public double calculatePrice(int position, String inventoryItem) throws ShoppingControlException {
        if (position > 5) {
            throw new ShoppingControlException("The position must be greater than 5."); }
        if (position < 0) {
            throw new ShoppingControlException("Invalid position."); }
        int itemCheck = -1;
        inventoryItem = inventoryItem.toLowerCase();
        for (int i = 0; i < itemNames.length; i++){
            if (inventoryItem.equals(itemNames[i]))
                itemCheck = i;
        }
        if (itemCheck < 0)
            throw new ShoppingControlException("The price cannot be negative.");
        double itemPrice = prices[itemCheck][position];
        
        return itemPrice;
    }
   
}
