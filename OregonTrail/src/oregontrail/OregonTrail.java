/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import oregontrail.model.Actor;
import oregontrail.model.Game;
import oregontrail.model.Locations;
import oregontrail.model.Map;
import oregontrail.model.Player;
import oregontrail.model.RegularScene;
import oregontrail.model.ResourceScene;
import oregontrail.model.Supplies;
import oregontrail.view.StartProgramView;

/**
 *
 * @author Mike Bjerke & Melissa Holland
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    private static Supplies items = null;
    private static Map map = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        
        
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

    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        OregonTrail.player = new Player();
        OregonTrail.player = player;
    }
    
    public static Supplies getSupplies() {
        return OregonTrail.items;
    }

    public static void setSupplies(Supplies items) {
        OregonTrail.items = items;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }
    
    public static Map getMap() {
        return OregonTrail.map;
    }

    public static void setMap(Map map) {
        OregonTrail.map = map;
    }
    
}
