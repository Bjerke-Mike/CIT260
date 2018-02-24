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
                        inputChar == 'E') {
                    valid = true;
                }
                else {
                    System.out.println("You must enter N, R, H, or E.");
                }
            }
        } 
        return inputChar;
    }
    
    private void displayBanner(){
        System.out.println("\n\tN - Start new game\n" +
                           "\tR - Restart existing game\n" +
                           "\tH - Get help on how to play the game\n" +
                           "\tE - Exit");
    }
    
    private void doAction() {
        System.out.println("*** doAction has been called ***");
    }
    
    private void startNewGame() {
       // GameControl.createNewGame(OregonTrail.getPlayer());   //Create a new Game
       // GameMenuView gameMenuView = new GameMenuView();  //gameMenuView = create a new GameMenuView object
       // gameMenuView.displayGameMenuView(); 
       StartExistingGameView startExistingGameView = new StartExistingGameView();
       startExistingGameView.displayStartExistingGameView();
       System.out.println("*** startNewGame has been called ***");
    }
    
    private void restartGame() {
        
    }
    
    private void getHelp() {
       System.out.println("*** getHelp has been called ***");
    }
}
