/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Britt
 */
public class MainCharacter {
    String name;
    String description;
    Point coordinates = new Point(0,0);
    ArrayList <Item> backpack = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<Item> backpack) {
        this.backpack = backpack;
    }
    
}
