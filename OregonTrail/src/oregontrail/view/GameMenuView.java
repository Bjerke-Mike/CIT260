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
                ErrorView.display(this.getClass().getName(),
                                  "Invalid menu item");
        }
        return false; 
    }

    private void goHunting() {
        HuntingView startHunting = new HuntingView();
        int foodReceived;
        foodReceived = startHunting.displayHuntingView();
        ErrorView.display(this.getClass().getName(),
                          "You received " + foodReceived + " food.");
    }
    private void displayMap(){
        
        Game game = new Game();
        game = OregonTrail.getCurrentGame();
        
        ErrorView.display(this.getClass().getName(),
                          "Trail Map Information");
        
    } 
    private void displayMove(){
        ErrorView.display(this.getClass().getName(),
                          "*** displayMove() called***");
    }
    private void displayInventory(){
        ErrorView.display(this.getClass().getName(),
                          "*** displayInventory() called***");
    }
    private void displayHelp(){
        ErrorView.display(this.getClass().getName(),
                          "*** displayHelp() called***");
    }
    
     private void displayStrength(){
        ErrorView.display(this.getClass().getName(),
                          "*** displayStrength() called***");
    }
  
}
