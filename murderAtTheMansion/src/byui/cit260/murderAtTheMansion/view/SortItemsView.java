/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.BackpackControl;
import byui.cit260.murderAtTheMansion.exceptions.GameControlException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Britt
 */
public class SortItemsView extends View {

    public SortItemsView() {
        super("\nWhat file would you like to save this to?");
    }

    @Override
    public boolean doAction(String fileLocation) {
        BackpackControl backpackControl = new BackpackControl();
        int[] sortedItems = null;
        try {
            sortedItems = backpackControl.calculateTotalItems();
        } catch (GameControlException ex) {
            Logger.getLogger(SortItemsView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //create list of types of items
        String[] typeList = {"Clue", "File", "Weapon"};

        try (PrintWriter outFile = new PrintWriter(fileLocation)) {
           
            //make title
            outFile.println("\n----------------Sort Items List----------------------");
            StringBuilder line = new StringBuilder("                             ");
            outFile.println("\n");
            line.insert(0, "Type");
            line.insert(20, "Amount" + "\n\n");

            outFile.println(line.toString());
            //print data
            for (int i = 0; i < sortedItems.length; i++) {
                line = new StringBuilder("                         ");
                line.insert(0, typeList[i]);
                line.insert(20,sortedItems[i]);
                outFile.println(line.toString());
            }
        } catch (IOException ex2) {
            ErrorView.display(this.getClass().getName(), "Error saving items list.");
        }
        return true;
    }

    }
