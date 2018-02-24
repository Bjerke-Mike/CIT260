/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.model.Player;

/**
 *
 * @author mellissah.
 */
public class GameControl {
    
    public static Player savePlayer(String name) {
        System.out.println("--- savePlayer() called ***");
        return new Player();
    }
}
