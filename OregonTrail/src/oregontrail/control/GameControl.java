/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import java.io.BufferedReader;
import java.io.PrintWriter;
import oregontrail.OregonTrail;
import static oregontrail.control.MapControl.createMap;
import oregontrail.exceptions.GameControlException;
import oregontrail.model.Game;
import oregontrail.model.Map;
import oregontrail.model.Player;
import oregontrail.model.Supplies;

/**
 *
 * @author mellissah.
 */
public class GameControl {

    protected static final BufferedReader keyboard = OregonTrail.getInFile();
    protected static final PrintWriter console = OregonTrail.getOutFile();

    public static Player savePlayer(String name) throws GameControlException {
        
        if (name == null | name.length() < 1) {
            throw new GameControlException("Can't use a blank name.");
        }
        
        Player player = new Player();  // player = new Player object
        player.setName(name);  //save the name in the player object
        OregonTrail.setPlayer(player);  //save the player in the main class of the project
                
        return player; 
    }
    
    public static void createNewGame(Player player) throws GameControlException {
       if (player == null || player.getName().length() < 1) {
           throw new GameControlException("Can't create a game without a player.");
       }
       Game game = new Game(); 
       OregonTrail.setPlayer(player); 
       
       Supplies items = createItems();
       OregonTrail.setSupplies(items);
       
       //actors = createActors()
       // Save the list of actors in the Game object
       // Assign an actor to the player 
       
       
       int numOfRows = 2;
       int numOfColumns = 3;
       Map map;
        map = createMap(numOfRows, numOfColumns);
       if (map == null) {
           throw new GameControlException("Can't create a game map.");
       }
      
       OregonTrail.setMap(map);
    }
    
    public static Supplies createItems() {
        //System.out.println("The createItems class has been called.");
        Supplies items;
        items = new Supplies();
        return items;
       
        //Save the list of items in the game 
    }

    public static void saveGame(Game game) {
        GameControl.console.println("saveGame game function called.");
    }

}
