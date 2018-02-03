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
public enum Locations implements Serializable {
   
    Independence("This is the starting point.", "You are given supplies, oxen, ammo, and food to start your journey. Use these wisely"),
    FortOne("This is a supply fort in the dessert.", "Trade or buy needed supplies here."),
    FortTwo("This is a supply fort in the mountains.", "Trade or buy needed supplies here."),
    FortThree("This is a supply fort near a river crossing.", "Trade or buy needed supplies here."),
    FortFour("This is a supply fort in the valley.", "Trade or buy needed supplies here.");
    
    private String description;
    private String directions;
  
    Locations(String description, String directions) {
        this.description = description;
        this.directions = directions;
    }

    public static Locations getIndependence() {
        return Independence;
    }

    public static Locations getFortOne() {
        return FortOne;
    }

    public static Locations getFortTwo() {
        return FortTwo;
    }

    public static Locations getFortThree() {
        return FortThree;
    }

    public static Locations getFortFour() {
        return FortFour;
    }

    public String getDescription() {
        return description;
    }

    public String getDirections() {
        return directions;
    }

    @Override
    public String toString() {
        return "Locations{" + "description=" + description + ", directions=" + directions + '}';
    }
    
    
}
