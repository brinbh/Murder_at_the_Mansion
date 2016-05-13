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
public class Item implements Serializable{
    private String placeIn;
    private String lookAt;
    private String readItem;
    private String useItem;

    public Item() {
    }
    
    

    public String getPlaceIn() {
        return placeIn;
    }

    public void setPlaceIn(String placeIn) {
        this.placeIn = placeIn;
    }

    public String getLookAt() {
        return lookAt;
    }

    public void setLookAt(String lookAt) {
        this.lookAt = lookAt;
    }

    public String getReadItem() {
        return readItem;
    }

    public void setReadItem(String readItem) {
        this.readItem = readItem;
    }

    public String getUseItem() {
        return useItem;
    }

    public void setUseItem(String useItem) {
        this.useItem = useItem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.placeIn);
        hash = 41 * hash + Objects.hashCode(this.lookAt);
        hash = 41 * hash + Objects.hashCode(this.readItem);
        hash = 41 * hash + Objects.hashCode(this.useItem);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.placeIn, other.placeIn)) {
            return false;
        }
        if (!Objects.equals(this.lookAt, other.lookAt)) {
            return false;
        }
        if (!Objects.equals(this.readItem, other.readItem)) {
            return false;
        }
        if (!Objects.equals(this.useItem, other.useItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "placeIn=" + placeIn + ", lookAt=" + lookAt + ", readItem=" + readItem + ", useItem=" + useItem + '}';
    }
    
    
    
}
