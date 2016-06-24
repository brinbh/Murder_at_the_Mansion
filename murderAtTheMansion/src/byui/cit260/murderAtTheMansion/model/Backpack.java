/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Sara
 */
public class Backpack implements Serializable{
       private double itemAmount;
       private String typeOfWeapon;
       private String typeOfClue;
       private String typeOfFile;
       private Character character;
       
    ArrayList <Item> itemList = new ArrayList<>();
       

    public Backpack() {
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getTypeOfClue() {
        return typeOfClue;
    }

    public void setTypeOfClue(String typeOfClue) {
        this.typeOfClue = typeOfClue;
    }

    public String getTypeOfFile() {
        return typeOfFile;
    }

    public void setTypeOfFile(String typeOfFile) {
        this.typeOfFile = typeOfFile;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.itemAmount) ^ (Double.doubleToLongBits(this.itemAmount) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.typeOfWeapon);
        hash = 97 * hash + Objects.hashCode(this.typeOfClue);
        hash = 97 * hash + Objects.hashCode(this.typeOfFile);
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
        if (Double.doubleToLongBits(this.itemAmount) != Double.doubleToLongBits(other.itemAmount)) {
            return false;
        }
        if (!Objects.equals(this.typeOfWeapon, other.typeOfWeapon)) {
            return false;
        }
        if (!Objects.equals(this.typeOfClue, other.typeOfClue)) {
            return false;
        }
        if (!Objects.equals(this.typeOfFile, other.typeOfFile)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Backpack{" + "itemAmount=" + itemAmount + ", typeOfWeapon=" + typeOfWeapon + ", typeOfClue=" + typeOfClue + ", typeOfFile=" + typeOfFile + '}';
    }
}  
  
