/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import oregontrail.OregonTrail;

/**
 *
 * @author mellissah.
 */
public class StartExistingGameView {

    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
 
    public void displayStartExistingGameView() {
        this.console.println("*** displayStartExistingGameView() called***");
    }
}
