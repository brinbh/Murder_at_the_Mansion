/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import byui.cit260.murderAtTheMansion.exceptions.GameControlException;
import byui.cit260.murderAtTheMansion.model.Item;
import byui.cit260.murderAtTheMansion.model.Player;

/**
 *
 * @author Britt
 */
public class BackpackControl {

    public BackpackControl() {
    }
    
    public int[] calculateTotalItems() throws GameControlException {
        String errorMessage = "ERROR in retrieving the Items list. There is an error in the";
        Item[] itemList = Item.values();
        int sumClues = 0;
        int sumFiles = 0;
        int sumWeapons = 0;

        for (Item item : itemList) {

            // Count sum of each type of Item
            if (item.getType().equals("Clue")) {
                sumClues += 1;
            } else if (item.getType().equals("File")) {
                sumFiles += 1;
            } else {
                sumWeapons += 1;
            }

            //check to see if there are any items
            if (sumClues < 0) {
                throw new GameControlException(errorMessage + " sum of the Clues.");
            }
            if (sumFiles < 0) {
                throw new GameControlException(errorMessage + " sum of the Files.");
            }
            if (sumWeapons < 0) {
                throw new GameControlException(errorMessage + " sum of the Weapons.");
            }
            //Display the total

        }
        int[] total = {sumClues, sumFiles, sumWeapons};
        return total;
    }

    
}
