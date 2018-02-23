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
    }
    
    private void displayBanner(){
        System.out.println("Welcome to the Oregon Trail.\nWould you like instructions? (Y/N)");
        return;
    }
    
    private String promptName(){
        return "Melissa and Mike";
    }
    
    
}
