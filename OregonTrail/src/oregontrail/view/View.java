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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            // prompt for and get the players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return;
            done = this.doAction(value);
        }
        while (!done);
    }
    
    @Override
    public String getInput() {
       
       Scanner keyboard = new Scanner(System.in);
       boolean valid = false;
       String value = null;
       
       // while a valid name has not been retrieved
       while (!valid) {
            
            // prompt for the player's name
            System.out.println("\n" + this.displayMessage);
            
            // get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1) {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            break;
        }
        return value; // return the name
    }

    public char getInputChar() {
        String inputs = null;
        char inputChar;
        inputChar = ' ';
        boolean valid = false;
        while(valid == false) {
            inputs = getInput();
            //Converts the string to just the first character
            inputChar = inputs.toUpperCase().charAt(0);
        } 
        return inputChar;
    }
    


}
