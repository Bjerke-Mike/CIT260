/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import oregontrail.OregonTrail;

/**
 *
 * @author Mike
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    public boolean display() {
        boolean done = false;
        // prompt for and get the players name
        String value = this.getInput();
        done = this.doAction(value);
        return done;
    }
    
    @Override
    public String getInput() {
       
        boolean valid = false;
        String selection = null;
        // int test = 1 / (2 - 2);
        
        try {
            // while a valid name has not been retrieved
            while (!valid) {
            
                // prompt for the player's name
                ErrorView.display(this.getClass().getName(),
                          "\n" + this.displayMessage);
            
                // get the value entered from the keyboard
                selection = this.keyboard.readLine();
                selection = selection.trim();
                if (selection.length() < 1) {
                    this.console.println("You must enter a non-blank value.");
                    continue; 
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                          "Error reading input: " + e.getMessage());
        }
        return selection; // return the name
    }

    // converts the input string to just the capital first character
    public char getInputChar(String inputs) {
        char inputChar;
        inputChar = ' ';
        inputChar = inputs.toUpperCase().charAt(0);
        return inputChar;
    }
    


}
