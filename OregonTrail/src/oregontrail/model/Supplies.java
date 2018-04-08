/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

import java.io.Serializable;
import oregontrail.exceptions.ShoppingControlException;

/**
 *
 * @author Mike
 */
public class Supplies implements Serializable {
    private int money;
    private int food;
    private int ammo;
    private int clothing;
    private int miscSupplies;

    public Supplies() {
        money = 70000;
        food = 0;
        ammo = 0;
        clothing = 0;
        miscSupplies = 0;
    }

    public int getSupplies(int value) throws ShoppingControlException {
        switch(value) {
            case 0:
                return money;
            case 1:
                return food;
            case 2:
                return ammo;
            case 3:
                return clothing;
            case 4:
                return miscSupplies;
            default:
                throw new ShoppingControlException("Supplies number is invalid in getSupplies()");
        }
    }

    public void setSupplies(int itemNum, int value) throws ShoppingControlException {
        switch(itemNum) {
            case 0:
                this.setMoney(value);
                return;
            case 1:
                this.setFood(value);
                return;
            case 2:
                this.setAmmo(value);
                return;
            case 3:
                this.setClothing(value);
                return;
            case 4:
                this.setMiscSupplies(value);
                return;
            default:
                throw new ShoppingControlException("Supplies number is invalid in setSupplies()");
        }
    }
    
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void modifyMoney(int money) {
        this.money += money;
        if (this.money < 0)
            this.money = 0;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void modifyFood(int food) {
        this.food += food;
        if (this.food < 0)
            this.food = 0;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void modifyAmmo(int ammo) {
        this.ammo += ammo;
        if (this.ammo < 0)
            this.ammo = 0;
    }

    public int getClothing() {
        return clothing;
    }

    public void setClothing(int clothing) {
        this.clothing = clothing;
    }

    public void modifyClothing(int clothing) {
        this.clothing = clothing;
        if (this.clothing < 0)
            this.clothing = 0;
    }

    public int getMiscSupplies() {
        return miscSupplies;
    }

    public void setMiscSupplies(int miscSupplies) {
        this.miscSupplies = miscSupplies;
    }
    
    public void modifyMiscSupplies(int miscSupplies) {
        this.miscSupplies += miscSupplies;
        if (this.miscSupplies < 0)
            this.miscSupplies = 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.money;
        hash = 97 * hash + this.food;
        hash = 97 * hash + this.ammo;
        hash = 97 * hash + this.clothing;
        hash = 97 * hash + this.miscSupplies;
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
        final Supplies other = (Supplies) obj;
        if (this.money != other.money) {
            return false;
        }
        if (this.food != other.food) {
            return false;
        }
        if (this.ammo != other.ammo) {
            return false;
        }
        if (this.clothing != other.clothing) {
            return false;
        }
        if (this.miscSupplies != other.miscSupplies) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supplies{" + "money=$" + money + ", food=" + food + ", ammo=" + ammo + ", clothing=" + clothing + ", miscSupplies=" + miscSupplies + '}';
    }
    
    
}
