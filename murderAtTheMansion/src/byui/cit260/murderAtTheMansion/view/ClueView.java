/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.BackpackControl;
import byui.cit260.murderAtTheMansion.model.Clue;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Britt
 */
public class ClueView extends View {

    Clue[] clues;

    public ClueView() {
        super("\nTo see more information about the clue, enter number of clue: ");
        clues = BackpackControl.getClue(MurderAtTheMansion.getPlayer());
        System.out.println("-------------------------------------------"
                + "\nClues: ");
        for (int i = 0; i < clues.length; i++) {
            System.out.println("\t" + (i + 1) + ". "+ clues[i].getTitle());
        }

        System.out.println("-------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        int clueNum = Integer.parseInt(value);
        clueNum--;
        
        if (clueNum < 0 || clueNum >= clues.length){
            System.out.println("Invalid Clue Number");
            return false;
        }
        
        System.out.println(clues[clueNum].getDescription());
        return true;
    }

}
