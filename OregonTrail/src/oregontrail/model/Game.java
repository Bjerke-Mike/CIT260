/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Mike Bjerke & Melissa Holland
 */
public class Game implements Serializable { 
    
    // class variables
    private int gameDate;
    private int mileage;
    public Map map = new Map();
    private PlayerData playerData = new PlayerData();

    public int getGameDate() {
        return gameDate;
    }

    public Game() {
        gameDate = 0;
        mileage = 0;
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

    @Override
    public String toString() {
        return "Game{" + "gameDate=" + gameDate + ", mileage=" + mileage + '}';
    }
    
    
}
