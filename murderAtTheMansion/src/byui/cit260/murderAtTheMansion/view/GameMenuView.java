/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.GameControl;
import byui.cit260.murderAtTheMansion.model.Character;
import byui.cit260.murderAtTheMansion.model.Point;

import java.util.Scanner;

/**
 *
 * @author Britt
 */
public class GameMenuView extends View {
     

    public GameMenuView(){
    super ("\n"
                  + "\n--------------------------------------"
                  + "\n| Game Menu                          |"
                  + "\n--------------------------------------"
                  + "\n M - Move Character"
                  + "\n I - Interact with Objects"
                  + "\n DM - Display Map"
                  + "\n B - Show Backpack"
                  + "\n G - Guess Murderer"
                  + "\n C - Sort character list"
                  + "\n H - Help"
                  + "\n Q - Quit Game Menu"
                  + "\n--------------------------------------");
    
    }
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "M":
                this.moveCharacter();
                break;
            case "I":
                this.interactWithObject();
                break;
            case "DL":
                this.displayContentOfLocation();
                break;
            case "DM":
                this.displayMap();
                break;
            case "B":
                this.showBackpack();
                break;
            case "G":
                this.guessMurderer();
                break;
            case "C":
                this.sortCharacters();
                break;
            case "H": 
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void moveCharacter() {
        MoveCharacterMenuView moveCharacterMenuView = new MoveCharacterMenuView();
        moveCharacterMenuView.display();
        
    }

    private void interactWithObject() {

            InteractObjectMenuView interactObjectMenuView = new InteractObjectMenuView();
            interactObjectMenuView.display();  
    }

    private void displayContentOfLocation() {
        System.out.println("\n*** displayContentOfLocationl() function called***");
    }

    private void displayMap() {
        
    }

    private void showBackpack() {
            BackpackMenuView backpackMenuView = new BackpackMenuView();
            backpackMenuView.display();
    }
    
    private void displayHelpMenu() {
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void guessMurderer() {
            GuessMurderView guessMurderView = new GuessMurderView();
            guessMurderView.display();
    }

    private void sortCharacters() {
        //sort the list of characters
        Character[] sortedList = GameControl.sortCharacters();
        //print list of characters 
        System.out.println("\n Sorted List of Characters");
        StringBuilder line = new StringBuilder("                             ");
        line.insert(0, "Name");
        line.insert(5, "Description");
        line.insert(10,"Coordinates");
        System.out.println(line.toString());
        
        for(Character character : sortedList){
            line = new StringBuilder("                         ");
            line.insert(0, character.name());
            line.insert(5, character.getDescription());
            line.insert(10, character.getCoordinates().toString());
            
        }
        
        
    }
}
