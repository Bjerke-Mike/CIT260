/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mellissah.
 */
public class PlayerData implements Serializable {
    
    private static int oxenQuality;
    private static int health;
    private static int rations;

    public PlayerData() {
        oxenQuality = 100;
        health = 100;
        rations = 5;
    }
    
    public int getOxenQuality() {
        return oxenQuality;
    }

    public void setOxenQuality(int oxenQuality) {
        this.oxenQuality = oxenQuality;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRations() {
        return rations;
    }

    public void setRations(int rations) {
        this.rations = rations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.oxenQuality;
        hash = 67 * hash + this.health;
        hash = 67 * hash + this.rations;
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
        final PlayerData other = (PlayerData) obj;
        if (this.oxenQuality != other.oxenQuality) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.rations != other.rations) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayerData{" + "oxenQuality=" + oxenQuality + ", health=" + health + ", rations=" + rations + '}';
    }
    
}
