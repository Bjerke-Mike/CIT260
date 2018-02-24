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
class HelpMenuView {
    public boolean displayHelpMenuView() {
        //System.out.println("*** displayHelpMenuView() called***");
        char inputChar; 
        boolean endView = false;
        
        inputChar = getInputChar();
        
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
                if (inputChar == 'G' || inputChar == 'M' || inputChar == 'E' ||
                     inputChar == 'H' || inputChar == 'D' || inputChar == 'Q') {
                    valid = true;
                }
                else {
                    System.out.println("Invalid menu item.");
                }
            }
        } 
        return inputChar;
    }

    private void displayGoal(){
        System.out.println("*** displayGoal() called***");
    } 
    private void displayMove(){
        System.out.println("*** displayMove() called***");
    }
    private void displayEstimate(){
        System.out.println("*** displayEstimate() called***");
    }
    private void displayHarvest(){
        System.out.println("*** displayHarvest() called***");
    }
    private void displayDelivery(){
        System.out.println("*** displayDelivery() called***");
    }

    private void displayBanner(){
        System.out.println("\n\tG - What is the goal of the game?\n" +
                           "\tM - How to move\n" +
                           "\tE - Estimate the number of resources\n" +
                           "\tH - Harvest resources\n" +
                           "\tD - Delivering resources to warehouse\n" +
                           "\tQ - Quit");
    }

}
