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
public class HuntingView {
    private static int wordCount = -1;
    private static String[] wordName = {"bang", "shoot", "blam", "pow"};
    
    public int displayHuntingView() {
        wordCount++;
        if (wordCount >= wordName.length)
            wordCount = 0;
        long totalTime = 0;
        displayBanner();
        long startTime = System.currentTimeMillis();
        do{
            ; // do nothing while waiting for the timer to expire
        }
        while ((System.currentTimeMillis() - startTime) < 1500); // aprox 1.5 seconds
        
        DoHunting doHunting = new DoHunting(wordName[wordCount]);
        startTime = System.currentTimeMillis();
        boolean huntingSuccess = doHunting.display();
        totalTime = System.currentTimeMillis() - startTime;
        if (huntingSuccess) {
            if (totalTime <= 2000) { // aprox 2 seconds 100 to 200 food
                System.out.println("You got a big one!\nThere will plenty of food tonight!");
                if (totalTime < 1000)
                    return 200; // if you get it in less than 1 second, you get max food.
                // otherwise, you lose 1 food for each .01 second longer than that.
                return (200 - ((int) (totalTime - 1000) /10));
            }
            else if (totalTime <= 4000) { // aprox 4 seconds, 50 to 100 food
                System.out.println("You got a medium one.\nThis won't last very long.");
                return (100 - ((int) (totalTime - 2000) / 40));
            }
            else if (totalTime <= 6000) { // aprox 6 seconds, 25 to 50 food.
                System.out.println("You got a small one.\nYou will need to go hunting again soon.");
                return (50 - ((int) (totalTime - 4000) / 80));
            }
        }
        // Longer than 6 seconds or mistyped "bang"
        System.out.println("You missed it!" + 
                "\nI hope you have food in your wagon or you may starve.");
        return 0;
    }

    private void displayBanner(){
        System.out.println("\n\tYou go hunting.");
    }
    
}
