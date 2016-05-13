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
public class Backpack implements Serializable{
       private String openBackpack;
       private String closeBackpack;
       private String placeInBack;

    public Backpack() {
    }
       
       

    public String getOpenBackpack() {
        return openBackpack;
    }

    public void setOpenBackpack(String openBackpack) {
        this.openBackpack = openBackpack;
    }

    public String getCloseBackpack() {
        return closeBackpack;
    }

    public void setCloseBackpack(String closeBackpack) {
        this.closeBackpack = closeBackpack;
    }

    public String getPlaceInBack() {
        return placeInBack;
    }

    public void setPlaceInBack(String placeInBack) {
        this.placeInBack = placeInBack;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.openBackpack);
        hash = 53 * hash + Objects.hashCode(this.closeBackpack);
        hash = 53 * hash + Objects.hashCode(this.placeInBack);
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
        final Backpack other = (Backpack) obj;
        if (!Objects.equals(this.openBackpack, other.openBackpack)) {
            return false;
        }
        if (!Objects.equals(this.closeBackpack, other.closeBackpack)) {
            return false;
        }
        if (!Objects.equals(this.placeInBack, other.placeInBack)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Backpack{" + "openBackpack=" + openBackpack + ", closeBackpack=" + closeBackpack + ", placeInBack=" + placeInBack + '}';
    }
       
       
}
