/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.OregonTrail;
import oregontrail.model.Game;

/**
 *
 * @author mellissah.
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n\tV - View Map\n" +
              "\tI - View list of items in inventory.\n" +
              "\tM - Move on down the trail.\n" +
              "\tF - Hunt for food.\n" +
              "\tS - Get average health strength.\n" +
              "\tH - Help\n" +
              "\tQ - Quit");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert all uppercase
        char inputChar; 
        boolean endView = false;
        
        inputChar = getInputChar(value);
        
        switch (inputChar) {
            case 'V': 
               displayMap(); 
               break;
            case 'I':
               displayInventory();
               break;
            case 'M':
                displayMove();
                break;
            case 'F':
                goHunting();
                break;
            case 'S':
                displayStrength();
                break;
            case 'H':
               displayHelp();
               break;    
            case 'Q':
                return true;
            default: 
                this.console.println("Invalid menu item");
        }
        return false; 
    }

    private void goHunting() {
        HuntingView startHunting = new HuntingView();
        int foodReceived;
        foodReceived = startHunting.displayHuntingView();
        this.console.println("You received " + foodReceived + " food.");
    }
    private void displayMap(){
        
        Game game = new Game();
        game = OregonTrail.getCurrentGame();
        
        this.console.println("Trail Map Information");
        
    } 
    private void displayMove(){
        this.console.println("*** displayMove() called***");
    }
    private void displayInventory(){
        this.console.println("*** displayInventory() called***");
    }
    private void displayHelp(){
        this.console.println("*** displayHelp() called***");
    }
    
     private void displayStrength(){
        this.console.println("*** displayStrength() called***");
    }
  
}
