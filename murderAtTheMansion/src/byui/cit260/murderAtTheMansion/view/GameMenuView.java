/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.model.Location;
import byui.cit260.murderAtTheMansion.model.Scene;
import byui.cit260.murderAtTheMansion.control.GameControl;
import byui.cit260.murderAtTheMansion.model.Character;


import java.util.Scanner;
import murderatthemansion.MurderAtTheMansion;

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
        //get locations
       Location[][] locations = MurderAtTheMansion.getCurrentGame().getMap().getLocations();
        //print title
        System.out.println("Murder at the Mansion Map");
        //print column numbers
        System.out.println(" 1    2    3    4    5   "
                         + "/n_________________________");
        //FOR every row in map 
        for (Location[] row : locations){
            //PRINT a row divider 
            System.out.println("_________________________");
            //PRINT the row number on a new line
            System.out.println(row);
            //FOR every column in row
            for (Location location : row)   {
                //PRINT a column divider
                System.out.println("|");
                //IF location has been visited 
                if (location.getVisited() == true)
                    System.out.println(location.getScene().getDisplaySymbol());
                    // PRINT the mapSymbol in the scene in this location 
                // ELSE 
                else
                    System.out.println("??");
                int counter = 0;
                if (counter >= 25){
                    System.out.println("|");
                    break;
                }
                    
            }
            System.out.println("_________________________");
        }
        
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
        line.insert(8, "Description");
        line.insert(40,"Coordinates");
        System.out.println(line.toString());
        
        for(Character character : sortedList){
            line = new StringBuilder("                         ");
            line.insert(0, character.name());
            line.insert(12, character.getDescription());
            line.insert(60, character.getCoordinates().x + ", "+ character.getCoordinates().y);
            System.out.println(line.toString());
            
        }
        
        
    }
}
