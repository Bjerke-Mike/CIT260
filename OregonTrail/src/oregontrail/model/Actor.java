/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

/**
 *
 * @author Mike
 */
public enum Actor {
    
    CoyoteAttack("Coyotes attacks your wagon.", "They get away with some of your food.", "Food", -5, -25),
    FindExtraFood("You find an abandoned wagon.", "It contains some extra food.", "Food", 5, 25);
    
    private final String name;
    private final String description;
    private final String itemAffected;
    private final int minimum;
    private final int maximum;

    Actor(String name, String description, String itemAffected, int minimum, int maximum) {
        this.name = name;
        this.description = description;
        this.itemAffected = itemAffected;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getItemAffected() {
        return itemAffected;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", itemAffected=" + itemAffected + ", minimum=" + minimum + ", maximum=" + maximum + '}';
    }
    
    
}
