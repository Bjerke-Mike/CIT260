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
public enum ResourceScene {
    
    trade("Here you have the option to trade.", "Please select items to trade and negotiate with the trader."),
    fort("Fort", "You have found a fort to take shelter in for the night."),
    desert("Desert", "You are in the desert. Food is scarce"),
    mountian("Mountians", "You are in the mountians. Travel is slow."),
    river("You are at a river.", "Crossing can be dangerous."),
    valley("Valley", "You are in a valley. Food and grass are plentiful.");
    
    private final String name;
    private final String description;

    ResourceScene(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static ResourceScene getTrade() {
        return trade;
    }

    public static ResourceScene getFort() {
        return fort;
    }

    public static ResourceScene getDessert() {
        return desert;
    }

    public static ResourceScene getMountian() {
        return mountian;
    }

    public static ResourceScene getRiver() {
        return river;
    }

    public static ResourceScene getValley() {
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
        return "ResourceScene{" + "name=" + name + ", description=" + description + '}';
    }
    
}