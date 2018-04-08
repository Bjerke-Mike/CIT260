/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;
import oregontrail.control.ShoppingControl;
import oregontrail.exceptions.ShoppingControlException;
import oregontrail.model.Game;
import oregontrail.model.Location;

/**
 *
 * @author mellissah.
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n\tV - View Map\n" +
              "\tI - View list of items in inventory.\n" +
              "\tS - Shop at the local trader\n" +
              "\tM - Move on down the trail.\n" +
              "\tF - Hunt for food.\n" +
              "\tG - Get average health strength.\n" +
              "\tH - Help on the View menu.\n" +
              "\tQ - Quit to main menu.");
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
            case 'S':
               displayShopping();
               break;
            case 'M':
                displayMove();
                break;
            case 'F':
                goHunting();
                break;
            case 'G':
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

    private void displayMap(){
    /*
    game = get the currentGame from the main class -done
    locations = get the 2-D locations array from the map
    Print the title-done
    Print the column numbers for each column-done
    for every row in map-done
    Print a row divider-done
    Print the row number on a new line for every column in the row-done
    Print a column divider-done
        
    The rest isn't done... don't understand how to complete:   
    location = locations[row][column]
    if location has been visited
    Get the mapSymbol for the scene in this location
    Print the mapSymbol
    else
    Print " ?? "
    endif
    endFor
    Print the ending column divider
    endFor
    Print the ending row divider
    */
        Game game = new Game();
        game = OregonTrail.getCurrentGame();
        this.console.println("Oregon Trail Map");
        Location location = new Location();
  
        this.console.println("Oregon Trail Map");
        this.console.println("1  2  3  4  5");
        this.console.println("__________________________________________");
        this.console.println("1");
        this.console.println("2");
        this.console.println("3");
        this.console.println("4");
        this.console.println("5");
        this.console.println("__________________________________________");
        
    } 
    private void displayMove(){
        this.console.println("*** displayMove() called ***");
    }

    private void displayInventory(){
        this.console.println("*** displayInventory() called ***");
    }

    private void displayShopping() {
        boolean exitShopping = false;
        boolean exitShoppingMenu = false;
        while(!exitShoppingMenu) {
            ShoppingControl shopping = new ShoppingControl();
            try {
                ShoppingControlView shoppingView = new
                    ShoppingControlView(shopping.getLocationName(OregonTrail.getLocationNum()));
                    exitShoppingMenu = shoppingView.display();
            } catch (ShoppingControlException e) {
                ErrorView.display(this.getClass().getName(),
                    "Shopping Control Error: " + e);
            }
        }

        //this.console.println("*** displayShopping() called ***");
    }
  
    private void goHunting() {
        HuntingView startHunting = new HuntingView();
        int foodReceived;
        foodReceived = startHunting.displayHuntingView();
        this.console.println("You received " + foodReceived + " food.");
    }
    private void displayHelp(){
        this.console.println("*** displayHelp() called ***");
    }
    
     private void displayStrength(){
        this.console.println("*** displayStrength() called ***");
    }

}
