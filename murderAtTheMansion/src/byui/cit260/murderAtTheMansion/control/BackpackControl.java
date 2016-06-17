/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import byui.cit260.murderAtTheMansion.model.Clue;
import byui.cit260.murderAtTheMansion.model.Player;

/**
 *
 * @author Britt
 */
public class BackpackControl {
    public static Clue[] getClue(Player player){
        Clue[] clues = {
                    new Clue("Diary", "This is a diary."), 
                    new Clue("Note", "This is a note from bobby."),
                    new Clue("Letter", "This is a letter from the murderer.")
                    
        };
        return clues;
    }
    
}
