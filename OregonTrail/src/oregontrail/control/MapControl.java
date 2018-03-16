/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import oregontrail.OregonTrail;
import oregontrail.model.Map;

/**
 *
 * @author mellissah.
 */
public class MapControl {
    
    public static Map createMap(int numOfRows, int numOfColumns) {
        if (numOfRows < 0, numOfColumns < 0) {
            return null;
        }
        
        if (items == null, length < 1) {
            return null;
        }
        
        Map map = new Map();
        
        OregonTrail.setnumOfRows(map);
        OregonTrail.setnumOfColumns(map);
        
        
        return map;
        
       
     /*
 
        
    locations = createLocations(noOfRows, noOfColumns)
    Assign the locations array to the map
        
    scenes = createScenes()
    questions = createQuestions()
        
    assignQuestionsToScenes()
    assignItemsToScenes()
        
    assignScenesToLocations()
        
    return map 
    */
    }
    
}
