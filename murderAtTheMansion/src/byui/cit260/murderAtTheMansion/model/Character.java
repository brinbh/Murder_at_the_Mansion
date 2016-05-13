/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.murderAtTheMansion.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Sara
 */
public class Character implements Serializable{
    private String name;
    private String description;
    private double cordinates;

    public Character() {
    }
    
    

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

    public double getCordinates() {
        return cordinates;
    }

    public void setCordinates(double cordinates) {
        this.cordinates = cordinates;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.cordinates) ^ (Double.doubleToLongBits(this.cordinates) >>> 32));
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
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.cordinates) != Double.doubleToLongBits(other.cordinates)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", cordinates=" + cordinates + '}';
    }
    
    
}
