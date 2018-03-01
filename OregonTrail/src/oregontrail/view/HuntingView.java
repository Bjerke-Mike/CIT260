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
            long startTime = System.nanoTime();
            String inputs;
            inputs = getInputs();
            totalTime = System.nanoTime() - startTime;
            inputs = inputs.toLowerCase();
            System.out.println(totalTime + "nanoTime.");
            if (inputs.equals("bang")) {
                System.out.println(totalTime + "nanoTime.");
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
       
       displayBanner();
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
   

    private void displayBanner(){
        System.out.println("\n\tYou go hunting.\nTYPE: bang");
    }
    
}
