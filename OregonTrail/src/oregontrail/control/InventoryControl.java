/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

/**
 *
 * @author mellissah.
 */
public class InventoryControl {
   
    public double addToIventory(String inventoryItem, int amount) {
       
        if (amount > 300) {
            return -1.0; }
        if (amount < 1) {
            return -2.0; }
        if ( !(inventoryItem == "food" || inventoryItem == "ammo"
                || inventoryItem == "clothing" || inventoryItem == "misc")) {
            return -3.0; }
    
        double itemUnits = 50;
        if (inventoryItem == "food") {
           itemUnits = 150; }
        if (inventoryItem == "ammo") {
           itemUnits = 50; }
        if (inventoryItem == "clothing") {
           itemUnits = 50; }
        if (inventoryItem == "misc") {
           itemUnits = 50; }
        double totalInventory = (itemUnits * amount);
        return totalInventory; }
    
}
