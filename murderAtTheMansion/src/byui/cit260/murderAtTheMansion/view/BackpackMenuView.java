/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import java.util.Scanner;

public class BackpackMenuView {
    private String menu;
    private String menuOption;

    public BackpackMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Backpack Menu                          |"
                  + "\n--------------------------------------"
                  + "\nC - Clues"
                  + "\nS - Suspect Files"
                  + "\nM - Murdered File"
                  + "\nW - Weapons"
                  + "\nQ - Quit Backpack Menu"
                  + "\n--------------------------------------";
    }

    public void displayBackpackMenuView() {
        boolean done = false;
                do {
                    String menuOption = this.getMenuOption();
                    if (menuOption.toUpperCase().equals("Q"))
                        return;

                    done = this.doAction(menuOption);
                } while (!done);    
    }
    private  String getMenuOption() {
        
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
        System.out.println("\n*** backpackClues() function called***");
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

    
