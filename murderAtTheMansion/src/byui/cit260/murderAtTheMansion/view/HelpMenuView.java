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
public class HelpMenuView {

    private String menu;
    private String menuOption;

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n--------------------------------------"
                  + "\nG - Goal of Game"
                  + "\nM - How to move"
                  + "\nB - How to get to backpack"
                  + "\nC - Get clue"
                  + "\nQ - Quit Help Menu"
                  + "\n--------------------------------------";
    }

    void displayHelpMenuView() {
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
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "B":
                this.howToGetBackpack();
                break;
            case "C":
                this.getClue();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfGame() {
        System.out.println("\n*** goalOfGoal() function called***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove() function called***");
    }

    private void howToGetBackpack() {
        System.out.println("\n*** howToGetBackpack() function called***");
    }

    private void getClue() {
        System.out.println("\n*** getClue() function called***");
    }
}
