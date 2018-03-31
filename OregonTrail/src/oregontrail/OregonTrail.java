/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private static Game currentGame = new Game();
    private static Player player = null;
    private static Supplies items = null;
    private static Map map = null;
    private static int locationNum = 0;
    private static boolean atFort = true;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            OregonTrail.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            OregonTrail.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (OregonTrail.inFile != null)
                    OregonTrail.inFile.close();
                if (OregonTrail.outFile != null)
                    OregonTrail.outFile.close();
                if (logFile != null) {
                    logFile.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the files");
                return;
            }
            
            
        }
        
        
        
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

    public static Supplies getItems() {
        return items;
    }

    public static void setItems(Supplies items) {
        OregonTrail.items = items;
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

    public static int getLocationNum() {
        return locationNum;
    }

    public static void setLocationNum(int locationNumber) {
        OregonTrail.locationNum = locationNumber;
    }

    public static boolean isAtFort() {
        return atFort;
    }

    public static void setAtFort(boolean atFort) {
        OregonTrail.atFort = atFort;
    }
    
    public static Map getMap() {
        return OregonTrail.map;
    }

    public static void setMap(Map map) {
        OregonTrail.map = map;
    }

    public static void setnumOfRows(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setnumOfColumns(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        OregonTrail.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }

    public static PrintWriter getOutput() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
