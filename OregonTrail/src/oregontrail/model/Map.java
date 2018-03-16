/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author mellissah.
 */
public class Map implements Serializable {
    
    //class variables
    private static int numOfRows = 0;
    private static int numOfColumns = 0;
    private int plannedCourse;
    private boolean lost;

    public Map() {
        plannedCourse = 1;
        lost = false;
    }
    
    public int getPlannedCourse() {
        return plannedCourse;
    }

    public void setPlannedCourse(int plannedCourse) {
        this.plannedCourse = plannedCourse;
    }

    public boolean getLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }  

    public static int getNumOfRows() {
        return numOfRows;
    }

    public static void setNumOfRows(int numOfRows) {
        Map.numOfRows = numOfRows;
    }

    public static int getNumOfColumns() {
        return numOfColumns;
    }

    public static void setNumOfColumns(int numOfColumns) {
        Map.numOfColumns = numOfColumns;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.plannedCourse;
        hash = 23 * hash + (this.lost ? 1 : 0);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.plannedCourse != other.plannedCourse) {
            return false;
        }
        if (this.lost != other.lost) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "plannedCourse=" + plannedCourse + ", lost=" + lost + '}';
    }

    
}
