/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.control.GameControl;
import oregontrail.exceptions.GameControlException;
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
        if (inputs == null || inputs.length() < 1) {
            ErrorView.display(this.getClass().getName(),
                          "Could not create the player. " +
                          "Enter a different name.");
            return false;
        }
        else if (inputs.length() == 1 &&
                (inputs.toUpperCase().charAt(0) == 'Q')){
            return true;
        }
        playersName = inputs;
        boolean validName = false;
        while (!validName) {
            validName = true;
            try {
                Player player = GameControl.savePlayer(playersName);
            } catch (GameControlException e) {
                this.console.println("Error reading input: ");
                return false;
            }
        }
        this.console.println("\"=================================================\"\n" +
"                         + \"\\nWelcome to the game \" + playersName\n" +
"                         + \"\\nWe hope you have a lot of fun!\"\n" +
"                         + \"\\n=================================================");
        boolean mainMenuCheck;
        mainMenuCheck = false;
        MainMenuView mainMenuView = new MainMenuView();
        while (!mainMenuCheck){
            mainMenuCheck = mainMenuView.display();
        }
        return true;
    }
    
    private void displayBanner() {
        this.console.println("Welcome to the Oregon Trail. \nWould you like instructions? (Y/N)");
    }

}

