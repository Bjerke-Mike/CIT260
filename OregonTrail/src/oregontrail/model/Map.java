/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

/**
 *
 * @author mellissah.
 */
public class Map implements Serializable {
    
    //class variables
    private int plannedCourse;
    private int lost;

    public Map() {
    }
    
    public int getPlannedCourse() {
        return plannedCourse;
    }

    public void setPlannedCourse(int plannedCourse) {
        this.plannedCourse = plannedCourse;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.plannedCourse;
        hash = 67 * hash + this.lost;
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
