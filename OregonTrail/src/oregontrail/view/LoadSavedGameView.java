/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.IOException;
import oregontrail.OregonTrail;
import oregontrail.control.GameControl;
import oregontrail.exceptions.GameControlException;
import oregontrail.model.Game;

/**
 *
 * @author Mike
 */
public class LoadSavedGameView extends View {

    public LoadSavedGameView() {
        super("\n\t  Enter the name of the file to load:");
    }

    @Override
    public boolean doAction(String value) {
        Game game = OregonTrail.getCurrentGame();
        GameControl.getGame(game, value);
        this.console.println("Game successfully saved");
        
        
        return true;
    }
    
}
