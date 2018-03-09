/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.OregonTrail;
import oregontrail.control.GameControl;

/**
 *
 * @author Mike
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
              + "\n\t-----------------------------------------"
              + "\n\t| Main Menu                             |"
              + "\n\t-----------------------------------------"
              + "\n\tN - Start new game"
              + "\n\tR - Restart existing game"
              + "\n\tF - hunt for Food"
              + "\n\tH - Get help on how to play the game"
              + "\n\tE - Exit"
              + "\n\t-----------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert all uppercase
        char inputChar; 
        boolean endView = false;
        
        inputChar = getInputChar(value);
        
        switch (inputChar) {
            case 'F':
                goHunting();
                break;
            case 'N': 
               startNewGame(); 
               break;
            case 'R':
               restartGame();
               break;
            case 'H':
                getHelp();
                break;
            case 'E':
                return true;
            default: 
                System.out.println("Invalid menu item.");
        }
        return false; 
    }
    
    private void goHunting() {
        HuntingView startHunting = new HuntingView();
        int foodReceived = 0;
        foodReceived = startHunting.displayHuntingView();
        System.out.println("You received " + foodReceived + " food.");
    }
    
    private void startNewGame() {
       GameControl.createNewGame(OregonTrail.getPlayer());   
       GameMenuView gameMenuView = new GameMenuView();
       gameMenuView.displayGameMenuView(); 
    }
    
    private void restartGame() {
       StartExistingGameView startExistingGameView = new StartExistingGameView();
       startExistingGameView.displayStartExistingGameView();
    }
    
    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        boolean exitHelpMenu;
        exitHelpMenu = false;
        while(!exitHelpMenu) {
            exitHelpMenu = helpMenuView.display();
        }
    }

}
