/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.control.GameControl;
import oregontrail.model.Player;

/**
 *
 * @author Mike
 */
public class StartProgramView {
    
    private String playersName;
    
    public void displayStartProgramView(){
        
        boolean endOfView = false;
        do {
            String inputs[] = getInputs();
            if (inputs[0] == null || inputs[0] == "Q"){
                return;
            }
            endOfView = doAction(inputs);
        }
        while (endOfView != true);
        
    }
    
   private String[] getInputs() {
       
       String inputs[] = null;
       
       displayBanner();
       String inputValue = null;
       boolean valid = false;
       while(valid == false) {
           System.out.println("Please enter an action.");
       
            Scanner sc = new Scanner(System.in);
            inputValue = sc.nextLine();  //Get the value entered from the keyboard
            
            inputValue = inputValue.trim();
            
            if (inputValue.length() < 1) {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else {
                valid = true;
            }
        } 
       
        //Assign the value to the first position in the inputs array
        inputs[0] = inputValue;
        return inputs;
        }
   
    private boolean doAction(String inputs[]) {
       
        playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if (player == null) {
            System.out.println("Could not create the player. " +
                               "Enter a different name.");
            return false;
        }
        System.out.println("================================================="
                         + "\nWelcome to the game " + playersName
                         + "\nWe hope you have a lot of fun!"
                         + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        return true;
    }
    
    private void displayBanner() {
        System.out.println("Welcome to the Oregon Trail.\nWould you like instructions? (Y/N)");
    }
    
    private String promptName() {
        return "Melissa and Mike";
    }
     
}

