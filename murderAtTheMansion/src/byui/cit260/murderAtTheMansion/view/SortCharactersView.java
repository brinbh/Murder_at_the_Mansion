/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.GameControl;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Sara
 */
public class SortCharactersView extends View {
    
    public SortCharactersView () {
        super ("\nWhat file would you like to save this to?");
    
}

    @Override
    public boolean doAction(String fileLocation) {
        //sort the list of characters
        byui.cit260.murderAtTheMansion.model.Character[] sortedList = GameControl.sortCharacters();
        try (PrintWriter outFile = new PrintWriter(fileLocation)) {

            //print list of characters 
            outFile.println("\n--------Sorted List of Characters--------");
            StringBuilder line = new StringBuilder("                             ");
            outFile.println("\n");
            line.insert(0, "Name");
            line.insert(20, "Coordinates" + "\n");

            outFile.println(line.toString());

            for (byui.cit260.murderAtTheMansion.model.Character character : sortedList) {
                line = new StringBuilder("                         ");
                line.insert(0, character.name());
                line.insert(20, character.getCoordinates().x + ", " + character.getCoordinates().y);
                outFile.println(line.toString());
            }
        } catch (IOException ex1) {
            ErrorView.display(this.getClass().getName(), "Error saving character list.");

        }

        return true;
    } 
}

