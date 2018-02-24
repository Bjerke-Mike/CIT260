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
            String inputs = getInputs();
            if (inputs == null || inputs == "Q"){
                return;
            }
            endOfView = doAction(inputs);
        }
        while (endOfView != true);
        
    }
    
   private String getInputs() {
       
       String inputs = null;
       
       displayBanner();
       boolean valid = false;
       while(valid == false) {
           System.out.println("Enter the player's name below or Q to quit");
       
            Scanner sc = new Scanner(System.in);
            inputs = sc.nextLine();  //Get the value entered from the keyboard
            
            inputs = inputs.trim();
            
            if (inputs.length() < 1) {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else {
                valid = true;
            }
        } 
       
        //Assign the value to the first position in the inputs array
        return inputs;
        }
   
    private boolean doAction(String inputs) {
       
        playersName = inputs;
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

