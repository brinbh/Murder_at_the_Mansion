/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Item;
import java.util.Scanner;
import murderatthemansion.MurderAtTheMansion;

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
                this.viewClues();
                break;
            case "S":
                this.viewSuspectFiles();
                break;
            case "M":
                this.murderedFile();
                break;
            case "W":
                this.backpackWeapons();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    


    private void viewSuspectFiles() {
        /*StringBuilder line;
        
        Game game = MurderAtTheMansion.getCurrentGame();
        Item[] item = game.getItem();
        
        System.out.println("\nLIST OF FILES");
        line = new StringBuilder("\n");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "NAME");
        System.out.println(line.toString());
        
        for (Item itemList : item){
            line = new StringBuilder("\n");
            line.insert(0, itemList.getDescription());
            line.insert(23, itemList.getTitle());
            
            System.out.println(line.toString());
        }*/
        
    }

    private void murderedFile() {
        System.out.println("\n*** murderedFile() function called***");
    }

    private void backpackWeapons() {
        System.out.println("\n*** backpackWeapons() function called***");
    }

    private void viewClues() {
        System.out.println("\n*** viewClues() function called***");
    }
}

    
