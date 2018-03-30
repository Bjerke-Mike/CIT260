/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class HelpMenuView extends View {
    public HelpMenuView() {
        super("\n\tG - What is the goal of the game?\n" +
              "\tM - How to move\n" +
              "\tE - Estimate the number of resources\n" +
              "\tH - Harvest resources\n" +
              "\tD - Delivering resources to warehouse\n" +
              "\tQ - Quit");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert all uppercase
        char inputChar; 
        boolean endView = false;
        
        inputChar = getInputChar(value);
        
        switch (inputChar) {
            case 'G': 
               displayGoal(); 
               break;
            case 'M':
               displayMove();
               break;
            case 'E':
                displayEstimate();
                break;
            case 'H':
               displayHarvest();
               break;
            case 'D':
                displayDelivery();
                break;
            case 'Q':
                return true;
            default: 
                this.console.println("Invalid menu item.");
        }
        return false; 
    }

    private void displayGoal(){
        this.console.println("*** displayGoal() called***");
    } 
    private void displayMove(){
        this.console.println("*** displayMove() called***");
    }
    private void displayEstimate(){
        this.console.println("*** displayEstimate() called***");
    }
    private void displayHarvest(){
        this.console.println("*** displayHarvest() called***");
    }
    private void displayDelivery(){
        this.console.println("*** displayDelivery() called***");
    }
 
}
