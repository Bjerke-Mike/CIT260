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
        
        double basePrice = 0.40;
        if (inventoryItem == "ammo") {
            basePrice = 0.80; }
        
        if (inventoryItem == "clothing") {
            basePrice = 1.20; }
        
        if (inventoryItem == "misc") {
            basePrice = 1.00; }
        
        double totalPrice = position * 0.10 + basePrice;
        return totalPrice;
    }
}
