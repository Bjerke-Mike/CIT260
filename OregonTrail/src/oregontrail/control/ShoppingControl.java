/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

/**
 *
 * @author Mellisa Holland & Mike Bjerke.
 */
public class ShoppingControl {
    
    static public double calculatePrice(int position, String inventoryItem) {
        if (position > 5) {
            return -1.0; }
        if (position < 1) {
            return -2.0; }
        if ( !(inventoryItem == "food" || inventoryItem == "ammo"
                || inventoryItem == "clothing" || inventoryItem == "misc")) {
            return -3.0; }
        /*
        basePrice = 0.40
        IF (inventoryItem = “ammo”) THEN
            basePrice = 0.80
        IF (inventoryItem = “clothing”) THEN
            basePrice = 1.20
        IF (inventoryItem = “misc”) THEN
            basePrice = 1.00
        totalPrice = position * 0.10 + basePrice
        RETURN totalPrice
        */
        return 0.0;
        
        
    }
}
