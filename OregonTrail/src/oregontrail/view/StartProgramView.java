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

