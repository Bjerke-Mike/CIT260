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
        int oxen;
        try {
            oxen = Integer.parseInt(value);
        } catch(NumberFormatException e) {
            console.println("You must enter a number from 200 to 300.");
            return false;
        }
        if (oxen < 200 || oxen > 300){
            console.println("You must enter a number from 200 to 300.");
            return false;
        }
        oxen *= 50;
        OregonTrail.getCurrentGame().getPlayerData().setOxenQuality(oxen);
        OregonTrail.getCurrentGame().getSupplies().modifyMoney(-(oxen * 2));
        return true;
    }
}
