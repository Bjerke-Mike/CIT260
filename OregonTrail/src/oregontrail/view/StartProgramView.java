/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.Scanner;
import oregontrail.model.Player;

/**
 *
 * @author Mike
 */
public class StartProgramView {
    
    public void displayStartProgramView(){
        
        boolean endOfView = false;
        do {
            String inputs[] = getInputs();
            if (inputs[0] == null || inputs[0] == "Q"){
                return;
            }
            endOfView = doAction(inputs);
        }
        while (endOfView != true);
        
    }
    
   private String[] getInputs() {
       
       String inputs[] = null;
       
       displayBanner();
       
       boolean valid = false;
       while(valid == false) {
           System.out.println("Please enter an action.");
       
            Scanner sc = new Scanner(System.in);
            inputs[0] = sc.nextLine();  //Get the value entered from the keyboard
            
            inputs[0] = inputs[0].trim();
            
       
            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else {
                valid = true;
            }
        } 
       
        char firstPosition = inputs[0].charAt(0);
        inputs[0] = inputs[0].valueOf(firstPosition);
        inputs[0] = inputs[0].toUpperCase();
        //Assign the value to the first position in the inputs array
        return inputs;
        }
   
    private boolean doAction(String[] inputs) {
       
       //Convert input values to the appropriate database
       //Call a control layer method to perform the action
       
       //IF the control layer method returns to an error then
        //display an error message
        //RETURN false (repeats the current view)
       //ENDIF
       
       System.out.println(""); //DISPLAY a success message
       
       //create the new view object
       //display the new view

       return true; //(Terminates the current view)
       
    }
    
    private void displayBanner() {
        System.out.println("Welcome to the Oregon Trail.\nWould you like instructions? (Y/N)");
    }
    
    private String promptName() {
        return "Melissa and Mike";
    }
     
}

