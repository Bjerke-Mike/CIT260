/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.OregonTrail;
import static oregontrail.control.MapControl.createMap;
import oregontrail.model.Game;
import oregontrail.model.Map;
import oregontrail.model.Player;
import oregontrail.model.Supplies;

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
    
    public static int createNewGame(Player player) {
       if (player == null) {
           return -1;
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
           return -1;
       }
      
       OregonTrail.setMap(map);
       return 1; 
   
    }
    
    public static Supplies createItems() {
        //System.out.println("The createItems class has been called.");
        Supplies items;
        items = new Supplies();
        return items;
       
        //Save the list of items in the game 
    }

}
