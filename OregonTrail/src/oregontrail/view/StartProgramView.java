/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

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
    
    private void displayBanner(){
        System.out.println("Welcome to the Oregon Trail.\nWould you like instructions? (Y/N)");
        return;
    }
    
    private String promptName(){
        return "Melissa and Mike";
    }
    
   private String [] getInputs() {
       
       inputs = new String array one element long
       
       Display a description of the view
       
       valid = false;
       while(valid == false) {
           System.out.println("Please enter an action.");
       
            Get the value entered from the keyboard
            Trim off leading and trailing blanks from the value
                }
       
        if (length < 1) {
            System.out.println("You must enter a non-blank value.");
            continue;
        } 
       
       Assign the value to the first position in the inputs array
       
       valid = true (ends the loop)
       
      return inputs;
       /*
        System.out.println("*** getInputs called ***");
       
       String[] inputs = new String[1];
       inputs[0] = "testInput";
       
       return inputs;  
       */
   } 
   
   private boolean doAction(String[] inputs) {
       /*
       Convert input values to the appropriate database
       Call a control layer method to perform the action
       
       IF the control layer method returns to an error then
        display an error message
        RETURN false (repeats the current view)
       ENDIF
       
       DISPLAY a success message
       
       create the new view object
       display the new view
       
       RETURN true (Terminates the current view)
       */
       
      
       //System.out.println("*** doAction called ***");
       //System.out.println("\tinputs = " + inputs[0]);
       
       //return true;
   }
   
}

