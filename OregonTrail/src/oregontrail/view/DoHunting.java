/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

/**
 *
 * @author Mike
 */
public class DoHunting extends View {
    private String wordName;

    public DoHunting() {
        ;
    }
    
    public DoHunting(String wordName) {
        super("\n\tTYPE:  " + wordName);
        this.wordName = wordName;
    }

    @Override
    public boolean doAction(String value) {
        boolean wordCheck = false;
        if (value.equals(wordName))
            wordCheck = true;
        return wordCheck;
    }
}
