/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.OregonTrail;

/**
 *
 * @author Mike
 */
public class BuyOxenView extends View{
        public BuyOxenView() {
        super("Welcome to the Oregon Trail.\nYou start with $900 " + 
              "and you spent $200 on your wagon.\nHow much would you " +
              "like to spend on your oxen? (200 to 300 dollars");
    }

    @Override
    public boolean doAction(String value) {
        int oxenQuality;
        try {
            oxenQuality = Integer.parseInt(value);
        } catch(NumberFormatException e) {
            console.println("You must enter a number from 200 to 300.");
            return false;
        }
        if (oxenQuality < 200 || oxenQuality > 300){
            console.println("You must enter a number from 200 to 300.");
            return false;
        }
        OregonTrail.getCurrentGame().getSupplies().modifyMoney(-(oxenQuality * 100));
        oxenQuality *= 5;
        OregonTrail.getCurrentGame().getPlayerData().setOxenQuality(oxenQuality);
        return true;
    }
}
