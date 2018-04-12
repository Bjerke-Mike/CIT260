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
              "\tC - Check your health.\n" +
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
            case 'C':
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

        int miles = OregonTrail.getCurrentGame().getMileage() / 1000;
        if (miles > 1820)
            miles = 1820;
        // For testing the map. A value from 0 to 1820.
        // miles = 1040;
        int counter = miles / 65;
        if ((miles % 65) > 32 && ((counter + 1) % 4 ) != 0 ){
            counter++;
        }
        if ((counter % 4) == 0 && (miles % 260) != 0) {
            counter++;
        }
        String displayPosition = "";
        for (int i = 0; i < counter; i++){
            displayPosition += "-";
        }
        displayPosition += ">";
        this.console.println("Oregon Trail Map");
        this.console.println("S   1   2   3   4   5   6   F\n" +
                             "|---|---|---|---|---|---|---|");
        this.console.println(displayPosition);
        this.console.println("S is where you start, F is where you finish,");
        this.console.println("and the numbers are places you can stop on your journey.");
        int mileage = OregonTrail.getCurrentGame().getMileage() / 1000;
        this.console.println("You have traveled: " + mileage + " miles.");

        //All this was written by Melissa Holland. I changed it to  what I need for my map.
        /*
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
        this.console.println("__________________________________________");*/

    } 
    private void displayMove(){
        Game game = OregonTrail.getCurrentGame();
        int oxen = game.getPlayerData().getOxenQuality();
        int ammo = game.getSupplies().getAmmo();
        int food = game.getSupplies().getFood() * 7;
        int rations = game.getPlayerData().getRations();
        int health = game.getPlayerData().getHealth();
            
        int gameDate = game.getGameDate();
        int startMiles = game.getMileage();
        int miles = startMiles;
        if (miles == 0) {
            miles = 1000;
        }
        int mileage;
        int mapLocation = miles / 260000;
        int startDate = gameDate % 7;
        int trailDate = startDate;
        String newLocation;
        while (trailDate < 7) {
            if (health < 1){
                console.println("You are dead. You can't move while dead.");
                return;
            }
            if (miles != 1000) {
                miles += (oxen * health /100);
            }else {
                miles += (oxen * health /100 - 1000);
            }
            int healthMod = -5;
            if ((food - rations) < 0)
                rations = food;
            if (rations > 0 && rations < 3 && food > 0)
                healthMod = -2;
            if (food > 0 && rations > 1) {
                if (health < 50) {
                    healthMod = 6;
                }else if (health < 60) {
                    healthMod = 5;
                }else if (health < 70) {
                    healthMod = 4;
                }else if (health < 80) {
                    healthMod = 3;
                }else if (health < 90) {
                    healthMod = 2;
                }else {
                    healthMod = 1;
                }
            } 
            health += healthMod;
            if (food > 4 && health < 100 && rations > 3) {
                if (health < 50) {
                    healthMod = 6;
                }else if (health < 60) {
                    healthMod = 5;
                }else if (health < 70) {
                    healthMod = 4;
                }else if (health < 80) {
                    healthMod = 3;
                }else if (health < 90) {
                    healthMod = 2;
                }else {
                    healthMod = 1;
                }
            }
            health += healthMod;
            if (health > 100)
                health = 100;
            food -= rations;
            if (food < 0)
                food = 0;
            mileage = (miles / 260000) * 260;
            mileage -= game.getMileage() / 1000;
            if ((miles / 260000) > mapLocation){
                if (miles >18200000) {
                    console.println("You have reached Oregon city in " + (trailDate) + " days!");

                    trailDate = 7;
                }
                else if (startDate == trailDate) {
                    ShoppingControl shopping = new ShoppingControl();
                    console.println(mapLocation);
                    try {
                        newLocation = shopping.getLocationName(mapLocation + 1);
                    } catch (ShoppingControlException ex) {
                        console.println("Error in GameMenuView displayMove()");
                        return;
                    }
                    this.console.println("You travel " + mileage + "and reach" +
                            newLocation + ".\nYou have " + food + " food and " +
                            ammo + " ammo.");
                    if (food < (rations * 10) || ammo < 5) {
                        console.println("You really should stop for supplies.");
                    }
                    console.println("Would you like to stop here? (Y/N)");
                    trailDate++;
                }
            } else {
                trailDate++;
            }
        }
        console.println("You travel " + (miles - startMiles) / 1000 + " miles in " + (trailDate - startDate) + " days.");

        game.getSupplies().setFood(food / 7);
        game.setMileage(miles);
        game.setGameDate(trailDate);
        OregonTrail.setCurrentGame(game);



        //this.console.println("*** displayMove() called ***");
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
        ShoppingControl shopping = new ShoppingControl();
        int foodReceived;
        if (OregonTrail.getSupplies().getAmmo() > 0) {
            foodReceived = startHunting.displayHuntingView();
            int currentFood = OregonTrail.getSupplies().getFood();
            int maxFood = shopping.getMaxCapacity(1);
            if ((currentFood + foodReceived) > maxFood) {
                OregonTrail.getSupplies().setFood(maxFood);
            } else{
                OregonTrail.getSupplies().modifyFood(foodReceived);
            }
            OregonTrail.getSupplies().modifyAmmo(-1);
        } else{
            this.console.println("You can't hunt without any ammo!");
        }
    }
    private void displayHelp(){
        this.console.println("*** displayHelp() called ***");
    }
    
     private void displayStrength(){
        this.console.println("Your health is: " + 
                OregonTrail.getCurrentGame().getPlayerData().getHealth() + "%.");
    }

}
