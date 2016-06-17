/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import java.util.Scanner;

public class BackpackMenuView extends View {
    private String menu;
    private String menuOption;

    public BackpackMenuView() {
        super ("\n"
                  + "\n--------------------------------------"
                  + "\n| Backpack Menu                          |"
                  + "\n--------------------------------------"
                  + "\nC - Clues"
                  + "\nS - Suspect Files"
                  + "\nM - Murdered File"
                  + "\nW - Weapons"
                  + "\nQ - Quit Backpack Menu"
                  + "\n--------------------------------------");
    }

    
    
    @Override 
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.backPackClues();
                break;
            case "S":
                this.suspectFiles();
                break;
            case "M":
                this.murderedFile();
                break;
            case "W":
                this.backpackWeapons();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    

    private void backPackClues() {
        ClueView backpackClueView = new ClueView();
        backpackClueView.display();
    }

    private void suspectFiles() {
        System.out.println("\n*** suspectFiles() function called***");
    }

    private void murderedFile() {
        System.out.println("\n*** murderedFile() function called***");
    }

    private void backpackWeapons() {
        System.out.println("\n*** backpackWeapons() function called***");
    }
}

    
