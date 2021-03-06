/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import byui.cit260.murderAtTheMansion.exceptions.MapControlException;
import java.io.Serializable;
/**
 *
 * @author Britt
 */
public class Game implements Serializable{
    private double totalTime;
    private Item[] item;
    private Map map;

    public MainCharacter getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(MainCharacter mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
    private Player player;
    private MainCharacter mainCharacter;
    
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    

    public double getTotalTime() {
        return totalTime;
    }
    
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
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
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }
    
}
