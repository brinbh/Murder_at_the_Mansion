/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.model.Location;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Britt
 */
public class DisplayMapView extends View{

    public DisplayMapView() {
        super ("Enter any key:");
    }

    @Override
    public boolean doAction(String value) {
        //get current Map
        Location[][] locations = MurderAtTheMansion.getCurrentGame().getMap().getLocations();
        //display header
        //print title
        this.console.println("Murder at the Mansion Map\n");
        //print column numbers
        this.console.println(" |  0    1    2    3    4   \n"
                + "-|------------------------");

        //FOR each row 
        int rowCounter = 0;
        int colCounter = 0;
        for (Location[] row: locations ){
            this.console.print(rowCounter + "| ");
            rowCounter++;
            //FOR each column display content or ??
            for (Location colLocation: row ){
                colCounter++;
                if (colCounter < 5){
                    if (colLocation.getVisited() == true){
                        this.console.print(colLocation.getScene().getDisplaySymbol());
                    }
                    else
                    this.console.print("?? | ");                    
                }
                else {
                    this.console.println("?? | ");
                    colCounter = 0;
                    
                }
            }
        }
        
        return true;
    }
    
}