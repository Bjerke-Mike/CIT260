/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

/**
 *
 * @author mellissah.
 */
public class SaveGameView extends View {

    private String[] getInput() {
        String[] inputs = new String[1]; //array one element long
        
        
       
        Display instructions to save the game
        input1 = getInput(thePromptMessage)
        save a reference to input1 in the inputs array
        return inputs; 
    }
    
    private boolean doAction(String[] inputs) {
        filePath = get first value in inputs array
        game = get the currentGame in the main class
        try
        call the saveGame(game)control method
        catch GameControlException
        Print error passed with the exception
        return false to repeat the view
        endTry
        Print a success message indicating where the
        file was saved
        return true;
    }
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
