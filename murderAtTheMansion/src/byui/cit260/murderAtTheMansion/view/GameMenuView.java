/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import java.util.Scanner;

/**
 *
 * @author Britt
 */
public class GameMenuView {
    private String menu;
    private String menuOption;

    public GameMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Game Menu                          |"
                  + "\n--------------------------------------"
                  + "\n M - Move Character"
                  + "\n I - Interact with Objects"
                  + "\nDL - Display content of location"
                  + "\nDM - Display Map"
                  + "\n B - Show Backpack"
                  + "\n G - Guess Murderer"
                  + "\n H - Help"
                  + "\n Q - Quit Game Menu"
                  + "\n--------------------------------------";
    }


    void displayGameMenu() {
        boolean done = false;
                do {
                    String menuOption = this.getMenuOption();
                    if (menuOption.toUpperCase().equals("Q"))
                        return;

                    done = this.doAction(menuOption);
                } while (!done);    
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length()<1){
                System.out.println("\nInvalid value; value cannot be blank");
                continue;
            }
            break;
        }
            return value;
    }

    private boolean doAction(String choice) {
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
        System.out.println("\n*** moveCharacter() function called***");
    }

    private void interactWithObject() {
        System.out.println("\n*** interactWithObject() function called***");
    }

    private void displayContentOfLocation() {
        System.out.println("\n*** displayContentOfLocationl() function called***");
    }

    private void displayMap() {
        System.out.println("\n*** displayMap() function called***");
    }

    private void showBackpack() {
        System.out.println("\n*** showBackpack() function called***");    }
    
    private void displayHelpMenu() {
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void guessMurderer() {
        System.out.println("\n*** guessMurderer() function called***"); 
    }
}
