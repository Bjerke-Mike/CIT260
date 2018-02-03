/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import oregontrail.model.Actor;
import oregontrail.model.Locations;
import oregontrail.model.Player;
import oregontrail.model.RegularScene;
import oregontrail.model.ResourceScene;

/**
 *
 * @author Mike Bjerke & Melissa Holland
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Missy");
        
        System.out.println(playerOne.toString());
        System.out.println(Actor.CoyoteAttack.getName());
        System.out.println(Actor.CoyoteAttack.getDescription());
        System.out.println(playerOne.games.toString());
        System.out.println(RegularScene.desert.getName());
        System.out.println(RegularScene.desert.getDescription());
        System.out.println(ResourceScene.fort.getName());
        System.out.println(ResourceScene.fort.getDescription());
        System.out.println(Locations.Independence.getDescription());
        System.out.println(Locations.Independence.getDirections());
        System.out.println(playerOne.games.map.toString());
        
    }
    
}
