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
import oregontrail.view.StartProgramView;

/**
 *
 * @author Mike Bjerke & Melissa Holland
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
        /*
        Player playerOne = new Player();
        playerOne.setName("Missy");
        
        System.out.println(Actor.CoyoteAttack.getName() + " " + Actor.CoyoteAttack.getDescription());
        System.out.println(playerOne.games.toString());
        System.out.println(Locations.Independence.getDescription() + " " + Locations.Independence.getDirections());
        System.out.println(playerOne.games.map.toString());
        System.out.println(playerOne.toString());
        System.out.println(playerOne.games.playerData.toString());
        System.out.println(RegularScene.desert.getName() + " " + RegularScene.desert.getDescription());
        System.out.println(ResourceScene.fort.getName() + " " + ResourceScene.fort.getDescription());
        System.out.println(playerOne.supplies.toString());
        */
    }
    
}
