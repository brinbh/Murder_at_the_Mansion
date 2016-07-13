/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

/**
 *
 * @author Sara
 */
public enum Clues {
    
    clue1("clueGolf.txt"),
    clue2("clueLicense.txt"),
    clue3("clueReciept.txt"),
    clue4("clueNote.txt"),
    clue5("clueFoot.txt");
    
    String clueLocation;
    
    Clues (String clueLocation){
        this.clueLocation = clueLocation; 
    }

    public String getClueLocation() {
        return clueLocation;
    }

   
    
}

