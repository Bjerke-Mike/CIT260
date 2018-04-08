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
       
        inventoryItem = inventoryItem.toLowerCase();
        if (amount > 300) {
            return 0; }
        if (amount < 1) {
            return -10; }
        if (inventoryItem != "food" && inventoryItem != "ammo"
                && inventoryItem != "clothing" && inventoryItem != "misc"){
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
    
    public double inventoryWeight(int food, int ammo, int clothing,
                                  int miscSupplies) {
        double totalWeight = 0.0;
        if (food < 0 || food > 2000){
            return -1.0;
        }
        totalWeight += (double) food;
        if (ammo < 0 || ammo > 200){
            return -1.0;
        }
        totalWeight += (double) ammo * 0.2;
        if (clothing < 0 || clothing > 10){
            return -1.0;
        }
        totalWeight += (double) clothing * 7.5;
        if (miscSupplies < 0 || miscSupplies > 100){
            return -1.0;
        }
        totalWeight += (double) miscSupplies * 5.0;
        return totalWeight;
    }
}
