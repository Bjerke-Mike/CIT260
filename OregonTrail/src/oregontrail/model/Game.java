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
 * @author Mike Bjerke & Melissa Holland
 */
public class Game implements Serializable { 
    
    // class variables
    private int gameDate;
    private int mileage;
    private boolean atFort;
    private static int locationNum;
    private Map map;
    private PlayerData playerData;
    private Supplies supplies;

    public int getGameDate() {
        return gameDate;
    }

    public Game() {
        gameDate = 0;
        mileage = 0;
        atFort = true;
        locationNum = 0;
        map = new Map();
        playerData = new PlayerData();
        supplies = new Supplies();
    }

    public void setGameDate(int gameDate) {
        this.gameDate = gameDate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isAtFort() {
        return atFort;
    }

    public void setAtFort(boolean atFort) {
        this.atFort = atFort;
    }

    public int getLocationNum() {
        return locationNum;
    }

    public void setLocationNum(int locationNum) {
        this.locationNum = locationNum;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public PlayerData getPlayerData() {
        return playerData;
    }

    public void setPlayerData(PlayerData playerData) {
        this.playerData = playerData;
    }

    public Supplies getSupplies() {
        return supplies;
    }

    public void setSupplies(Supplies supplies) {
        this.supplies = supplies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.gameDate;
        hash = 71 * hash + this.mileage;
        hash = 71 * hash + Objects.hashCode(this.map);
        hash = 71 * hash + Objects.hashCode(this.playerData);
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
        final Game other = (Game) obj;
        if (this.gameDate != other.gameDate) {
            return false;
        }
        if (this.mileage != other.mileage) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.playerData, other.playerData)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "gameDate=" + gameDate + ", mileage=" + mileage + '}';
    }
    
    
}
