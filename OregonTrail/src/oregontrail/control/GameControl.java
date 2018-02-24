/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.OregonTrail;
import oregontrail.model.Player;

/**
 *
 * @author mellissah.
 */
public class GameControl {
    
    public static Player savePlayer(String name) {
        
        if (name == null | name.length() < 1) {
            return null;
        }
        
        Player player = new Player();  // player = new Player object
        player.setName(name);  //save the name in the player object
        OregonTrail.setPlayer(player);  //save the player in the main class of the project
                
        return player; 
    }
}
