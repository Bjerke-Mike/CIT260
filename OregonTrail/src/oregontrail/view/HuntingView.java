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
    private static int wordCount = 0;
    private static String[] wordName = {"pow", "bang", "shoot", "blam"};
    
    public int displayHuntingView() {
        wordCount++;
        if (wordCount >= 4)
            wordCount = 0;
        long totalTime = 0;
        displayBanner1();
        long startTime = System.currentTimeMillis();
        do{
            ; // do nothing while waiting for the timer to expire
        }
        while ((System.currentTimeMillis() - startTime) < 1500); // aprox 1.5 seconds
        displayBanner2(wordName[wordCount]);
        startTime = System.currentTimeMillis();
        String inputs;
        inputs = getInputs();
        totalTime = System.currentTimeMillis() - startTime;
        inputs = inputs.toLowerCase();
        if (inputs.equals(wordName[wordCount])) {
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
                "\nI hope you have food in your wagon or people may starve.");
        return 0;
    }

   private String getInputs() {
       
       String inputs = null;
       boolean valid = false;
       while(valid == false) {
            Scanner sc = new Scanner(System.in);
            inputs = sc.nextLine();  //Get the value entered from the keyboard
            
            inputs = inputs.trim();
            
            if (inputs.length() < 1) {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            else {
                valid = true;
            }
        } 
       
        //Assign the value to the first position in the inputs array
        return inputs;
        }
   

    private void displayBanner1(){
        System.out.println("\n\tYou go hunting.");
    }
    
    private void displayBanner2(String wordToType){
        System.out.println("\nTYPE: " + wordToType);
    }
}
