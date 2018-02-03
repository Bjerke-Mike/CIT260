/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

/**
 *
 * @author mellissah.
 */
public enum RegularScene {
    
    start("Trade", "Please select items to trade and negotiate with the trader."),
    desert("Desert", "You are in the desert. Food is scarce"),
    mountian("Mountians", "You are in the mountians. Travel is slow."),
    river("You are at a river.", "Crossing can be dangerous."),
    valley("Valley", "You are in a valley. Food and grass are plentiful.");
    
    private final String name;
    private final String description;

    RegularScene(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static RegularScene getStart() {
        return start;
    }

    public static RegularScene getDesert() {
        return desert;
    }

    public static RegularScene getMountian() {
        return mountian;
    }

    public static RegularScene getRiver() {
        return river;
    }

    public static RegularScene getValley() {
        return valley;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "name=" + name + ", description=" + description + '}';
    }
  
}
