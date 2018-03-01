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
    public int displayHuntingView() {
        long totalTime = 0;
        do {
            displayBanner1();
            long startTime = System.nanoTime();
            do{
                ;
            }
            while ((System.nanoTime() - startTime) < 1500000000); // aprox 1.5 seconds
            displayBanner2();
            startTime = System.nanoTime();
            String inputs;
            inputs = getInputs();
            totalTime = System.nanoTime() - startTime;
            inputs = inputs.toLowerCase();
            if (inputs.equals("bang")) {
                if (totalTime < 1500000000) { // aprox 1.5 seconds
                    System.out.println("You got a big one!");
                }
                    
            }
            else {
                totalTime = -1;
            }
        }
        while (totalTime >= 0);
    return 1;
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
    
    private void displayBanner2(){
        System.out.println("\nTYPE: bang");
    }
}
