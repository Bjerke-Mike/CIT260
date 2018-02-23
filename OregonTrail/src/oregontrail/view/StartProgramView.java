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
        /*
        endOfView = false
        DO
            inputs = getInputs()
            IF no inputs were entered OR the first input is Q
                RETURN
            ENDIF
            endOfView = doAction(inputs)
        WHILE endOfView != true 
        */
        String[] inputs = this.getInputs();
    }
        
        /*
        displayBanner();
        String playerName = null;
        do {
            playerName = promptName();
            if (playerName == null || playerName == "\n"){
                System.out.println("The name you entered is invalid.\n" + 
                                   "Would you like to try again? (Y/N)");
            }
        }
        while (playerName == null);
        Player player;
        player = new Player();
        player.setName(playerName);
        
        return;
        */
        
    
    private void displayBanner(){
        System.out.println("Welcome to the Oregon Trail.\nWould you like instructions? (Y/N)");
        return;
    }
    
    private String promptName(){
        return "Melissa and Mike";
    }
    
   private String [] getInputs() {
       /*
       inputs = new String array one element long
       
       Display a description of the view
       
       valid = false
       WHILE valid == false (no input value has been entered)
       
        Display the prompt message
        Get the value entered from the keyboard
        Trim off leading and trailing blanks from the value
       
        IF length of the value < 1 THEN
            Display "You must enter a non-blank value"
            Continue (move to the top of the loop and repeat)
        ENDIF
       
       Assign the value to the first position in the inputs array
       
       valid = true (ends the loop)
       
      ENDWHILE
       
      RETURN inputs
       */
       System.out.println("*** getInputs called ***");
       
       String[] inputs = new String[1];
       inputs[0] = "testInput";
       
       return inputs;        
   } 
   
   private boolean doAction(String[] inputs) {
       System.out.println("*** doAction called ***");
       System.out.println("\tinputs = " + inputs[0]);
       
       return true;
   }
   
}

