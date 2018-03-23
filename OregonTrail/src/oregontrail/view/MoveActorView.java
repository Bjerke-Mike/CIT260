/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.OregonTrail;
import oregontrail.model.Player;

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
            System.out.println("The row and column must be a number");
            return false;
        }
        Player player = OregonTrail.getPlayer();
        
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
