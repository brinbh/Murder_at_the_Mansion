/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.murderAtTheMansion.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Sara
 */
public enum Character implements Serializable{
    
    Paula("Nanny of the mansion, has been working for the family for over 15 years.",new Point(0,3)),
    Randalph("Neighbor of the victim, loves to play golf and garden.", new Point (1,2)),
    Charlie("Nephew of the victim, in his mid-twenties.", new Point (4,0)),
    John("Boss of the victim, corporate manager of Google.", new Point (2,3)),
    Sophia("Ex-lover of the victim, seduces men with her charm.", new Point (3,3)),
    Marvin("Victim and owner of the mansion", new Point (3,1));
    
    
    
    private final String description;
    private final Point coordinates;

    Character(String description, Point coordinates) {
        this.description = description; 
        this.coordinates = coordinates;
      
    }
    
   public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character{" +  ", description=" + description + ", cordinates=" + coordinates + '}';
    }
    
    
}
