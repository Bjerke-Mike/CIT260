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
class MainMenuView {
    public boolean displayMainMenuView() {
        char inputChar; 
        boolean endView = false;
        
        inputChar = getInputChar();
        
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
    
    private char getInputChar() {
       
       String inputs = null;
       char inputChar;
       inputChar = ' ';
       boolean valid = false;
       while(valid == false) {
            displayBanner();
            Scanner sc = new Scanner(System.in);
            inputs = sc.nextLine();  //Get the value entered from the keyboard
            
            inputs = inputs.trim();
            
            if (inputs.length() < 1) {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else {
                //Converts the string to just the first character
                inputs = inputs.toUpperCase();
                inputChar = inputs.charAt(0);
                if (inputChar == 'N' || inputChar == 'R' || inputChar == 'H' ||
                        inputChar == 'E'  || inputChar == 'F') {
                    valid = true;
                }
                else {
                    System.out.println("Invalid menu item.");
                }
            }
        } 
        return inputChar;
    }
    
    private void doAction() {
        System.out.println("*** doAction has been called ***");
    }
    
    private void goHunting() {
        HuntingView startHunting = new HuntingView();
        int foodReceived;
        foodReceived = startHunting.displayHuntingView();
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
            exitHelpMenu = helpMenuView.displayHelpMenuView();
        }
    }

    private void displayBanner(){
        System.out.println("\n\tN - Start new game\n" +
                           "\tR - Restart existing game\n" +
                           "\tF - Hunt for Food\n" +
                           "\tH - Get help on how to play the game\n" +
                           "\tE - Exit");
    }
}
