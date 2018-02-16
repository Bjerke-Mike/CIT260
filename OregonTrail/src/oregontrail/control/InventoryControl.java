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
            return 0; }
        if (amount < 1) {
            return -10; }
        if ( !(inventoryItem == "food" || inventoryItem == "ammo"
                || inventoryItem == "clothing" || inventoryItem == "misc")) {
            return -20; }
    
        double itemUnits = 50;
        if (inventoryItem == "food") {
           itemUnits = 10; }
        if (inventoryItem == "ammo") {
           itemUnits = 5; }
        if (inventoryItem == "clothing") {
           itemUnits = 7; }
        if (inventoryItem == "misc") {
           itemUnits = 1; }
        double totalInventory = (itemUnits * amount);
        return totalInventory; }
    
}