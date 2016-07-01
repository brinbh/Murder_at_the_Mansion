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
    Marvin("Victim and owner of the mansion", new Point (3,1)),
    MainCharacter("This is the main character.", new Point (0,0));
    
    
    
    private final String description;
    private final Point coordinates;
    private Backpack backpack; 
    private Game game; 
    private Location locationOfCharacter; 
    
    ArrayList<Player> player = new ArrayList<>();

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
    public Point setCoordinates(int x, int y) {
        return coordinates;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocationOfCharacter() {
        return locationOfCharacter;
    }

    public void setLocationOfCharacter(Location locationOfCharacter) {
        this.locationOfCharacter = locationOfCharacter;
    }
    
    
    

    

    @Override
    public String toString() {
        return "Character{" +  ", description=" + description + ", cordinates=" + coordinates + '}';
    }
    
    
}
