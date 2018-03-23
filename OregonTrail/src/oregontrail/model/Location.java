/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

/**
 *
 * @author Mike
 */
public class Location {
    private static int currentRow;
    private static int currentColumn;

    public static int getCurrentRow() {
        return currentRow;
    }

    public static void setCurrentRow(int currentRow) {
        Location.currentRow = currentRow;
    }

    public static int getCurrentColumn() {
        return currentColumn;
    }

    public static void setCurrentColumn(int currentColumn) {
        Location.currentColumn = currentColumn;
    }
    
    
}
