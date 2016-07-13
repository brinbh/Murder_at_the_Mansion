/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import byui.cit260.murderAtTheMansion.exceptions.MapControlException;
import byui.cit260.murderAtTheMansion.view.ErrorView;
import java.io.Serializable;
/**
 *
 * @author Britt
 */
public class Map implements Serializable{
    private int rowCount;
    private int colCount;
    private Location[][] locations;

    public Map() {
    }
    
     public Map(int rowCount, int colCount) throws MapControlException {
         if(rowCount < 0 || colCount < 0){
         throw new MapControlException("The number of rows and columns must be greater than 1");//throw map control exception
         }
         this.rowCount = rowCount;
         this.colCount = colCount;
         
         this.locations = new Location [rowCount][colCount];
         
         for(int row = 0; row < rowCount; row++){
             for(int col = 0; col < colCount; col++){
                 Location location = new Location();
                 location.setCol(col);
                 location.setRow(row);
                 location.setVisited(false);
                 
                 locations [row][col] = location; 
             }
         }
    }
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.rowCount;
        hash = 47 * hash + this.colCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }
    
    
}
