/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.OregonTrail;
import oregontrail.exceptions.MapControlException;
import oregontrail.model.Actor;
import oregontrail.model.Game;
import oregontrail.model.Map;
import oregontrail.model.Location;
import oregontrail.model.Locations;
import oregontrail.model.Player;

/**
 *
 * @author mellissah.
 */
public class MapControl {
    private static int currentRow = 1;
    private static int currentColumn = 1;
    public static Map createMap(int numOfRows, int numOfColumns) {
        if (numOfRows < 0 || numOfColumns < 0) {
            return null;
        }
        
        Map map = new Map();
        
        Map.setNumOfRows(numOfRows);
        Map.setNumOfColumns(numOfColumns);
        
        Map locations;
        locations = createLocations(numOfRows, numOfColumns);
        // Assign the locations array to the map
        // Our map doesn't have locations, so this has been commented out.
        
        return map;
    }
    
    private static Map createLocations(int numOfRows, int numOfColumns){
        //System.out.println("The createLocations() has been called.");
        Map map = new Map();
        Map.setNumOfRows(numOfRows);
        Map.setNumOfColumns(numOfColumns);
        return map;
    }
    
    public static Location moveActor(Player player, int newRow, int newColumn)
                                     throws MapControlException {
        if (player == null){
            throw new MapControlException("No actor to move.");
        }
        Game game = OregonTrail.getCurrentGame();
        Map map = OregonTrail.getMap();
        // This is an enum class, so I can't instance it. I will try to fix it later.
        //Locations locations = new Locations();
        if (newRow < 1 || newRow > map.getNumOfRows() || 
            newColumn < 1 || newColumn > map.getNumOfRows()) {
            throw new MapControlException("Can't move off the map.");
        }
        int oldRow = currentRow;
        int oldColumn = currentColumn;
        currentRow = player.getLocation().getCurrentRow();
        currentColumn = player.getLocation().getCurrentColumn();
        Location oldLocation = new Location();
        oldLocation.setCurrentRow(oldRow);
        oldLocation.setCurrentColumn(oldColumn);
        Location newLocation = new Location();
        newLocation.setCurrentRow(currentRow);
        newLocation.setCurrentColumn(currentColumn);
        
        return newLocation;
    }

    public static int getCurrentRow() {
        return currentRow;
    }

    public static void setCurrentRow(int currentRow) {
        MapControl.currentRow = currentRow;
    }

    public static int getCurrentColumn() {
        return currentColumn;
    }

    public static void setCurrentColumn(int currentColumn) {
        MapControl.currentColumn = currentColumn;
    }
    
    
}
