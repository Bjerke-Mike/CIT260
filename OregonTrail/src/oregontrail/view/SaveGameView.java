/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;
import oregontrail.model.Game;
import oregontrail.OregonTrail;
import oregontrail.control.GameControl;
import oregontrail.exceptions.GameControlException;

/**
 *
 * @author mellissah.
 */
public abstract class SaveGameView extends View {

        public SaveGameView() {
        super("\n"
              + "\n\t-----------------------------------------"
              + "\n\t| Save Game                             |"
              + "\n\t-----------------------------------------"
              + "\n\t  Instructions on how to save the game  |"
              + "\n\t-----------------------------------------");
    }

    
/*    private String getInput() {
        String[] inputs = new String[1]; //array one element long
        
        
       
        Display instructions to save the game
        input1 = getInput(thePromptMessage)
        save a reference to input1 in the inputs array
        return inputs; 
    }
*/

    private boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        Game game = OregonTrail.getCurrentGame();
        try {
            GameControl.saveGame(game, filePath);
        } catch (GameControlException e) {
                this.console.println(e.getMessage());
                return false;
        }
        this.console.println("Game successfully saved");
        return true;
    }
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
