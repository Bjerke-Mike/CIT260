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
public interface ViewInterface {
    public boolean display();
    public String getInput();
    public boolean doAction(String value);
    
}
