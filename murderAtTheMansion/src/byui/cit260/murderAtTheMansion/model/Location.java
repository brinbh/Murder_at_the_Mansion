/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Britt
 */
public class Location implements Serializable{
    private int row;
    private int col;
    private boolean visited;
    private Scene scene;
    private Character[] characters;
    private Map map;
    private Point coordinates;

    public Location() {
    }

    public Point getCoordinates() {
        return coordinates;
    }
    public Point setCoordinates(int x, int y) {
        return coordinates;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Character[] getCharacter() {
        return characters;
    }

    public void setCharacter(Character[] character) {
        this.characters = character;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.row;
        hash = 59 * hash + this.col;
        //hash = 59 * hash + this.visited;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", col=" + col + ", visited=" + visited + '}';
    }
    
    
}
