/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;
import oregontrail.model.Location;
import oregontrail.model.Player;
import oregontrail.control.MapControl;
import oregontrail.exceptions.MapControlException;

/**
 *
 * @author Mike
 */
public class MoveActorView extends View {

    public MoveActorView() {
        super("\n\tEnter a number row followed by a column number.");
    }
    
    private boolean doAction(String [] inputs) {
        int row;
        int column;
        try{
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
        } catch (NumberFormatException e){
            ErrorView.display(this.getClass().getName(),
                          "The row and column must be a number." + e.getMessage());
            return false;
        }
        Player player = OregonTrail.getPlayer();
        // Our Actor is a random event, and doesn't move.
        try {
            Location newLocation = MapControl.moveActor(player, row, column);
        } catch (MapControlException e) {
            System.out.println(e.getMessage());
            ErrorView.display(this.getClass().getName(),
                          "Error reading input:" + e.getMessage());
            return false;
        }
        ErrorView.display(this.getClass().getName(),
                          "Scene Information");
        
        return true;
    }
    
    private String[] getInputs() {
        String[] inputs = new String[2];
        inputs[0] = getInput();
        inputs[1] = getInput();
        
        return inputs;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
