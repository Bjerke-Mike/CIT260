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
public class StartProgramView extends View {
    private String playersName;

    public StartProgramView() {
        super("Enter the player's name below or Q to quit.");
    }
    
    public boolean doAction(String inputs) {
       
        boolean endOfView = false;
        if (inputs == null) {
            System.out.println("Could not create the player. " +
                               "Enter a different name.");
            return false;
        }
        else if (inputs.length() == 1 &&
                (inputs.toUpperCase().charAt(0) == 'Q')){
            return true;
        }
        playersName = inputs;
        Player player = GameControl.savePlayer(playersName);
        
        System.out.println("================================================="
                         + "\nWelcome to the game " + playersName
                         + "\nWe hope you have a lot of fun!"
                         + "\n=================================================");
        boolean mainMenuCheck;
        mainMenuCheck = false;
        while (!mainMenuCheck){
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuCheck = mainMenuView.display();
        }
        return true;
    }
    
    private void displayBanner() {
        System.out.println("Welcome to the Oregon Trail.\nWould you like instructions? (Y/N)");
    }

}

