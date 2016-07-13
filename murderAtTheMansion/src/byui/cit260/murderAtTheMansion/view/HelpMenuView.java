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
public class HelpMenuView extends View {

    private String menu;
    private String menuOption;

    public HelpMenuView() {
        super ( "\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n--------------------------------------"
                  + "\nG - Goal of Game"
                  + "\nM - How to move"
                  + "\nB - How to get to backpack"
                  + "\nQ - Quit Help Menu"
                  + "\n--------------------------------------");
    }

    
    @Override
    public boolean doAction(String choice) {
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
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void goalOfGame() {
        this.console.println("\n------------GOAL OF GAME--------------"
                + "\nThe goal of this game is to figure out "
                + "\nwho is the murderer. You are the "
                + "\ndetective assigned to this case and you "
                + "\nhave the entire mansion to discover "
                + "\nuntil you find all the clues, weapons, and "
                + "\ncase files. When you discover all of them, "
                + "\nyou can decide by looking at the clues who "
                + "\nthe murderer was. Start by going to each "
                + "\nroom in the mansion.");
    }

    private void howToMove() {
        this.console.println("\n-----------HOW TO MOVE----------------"
                + "\nYou can move by going to the Game Menu "
                + "\nand pressing 'M' to select the Move "
                + "\nbutton. Then you can enter in a letter "
                + "\nthat refers to the direction you wish "
                + "\nto travel. This will be according to "
                + "\nthe following: "
                + "\n\t\t U - UP"
                + "\n\t\t D - DOWN"
                + "\n\t\t L - LEFT"
                + "\n\t\t R - RIGHT"
                + "\nThen you will enter a space and the "
                + "\namount of spaces you want to travel. "
                + "\nExample: D 1 Note: Do not forget "
                + "\nthe space.");
    }

    private void howToGetBackpack() {
        this.console.println("\n---------HOW TO GET BACKPACK----------"
                + "\nGo to the Game Menu. Then select 'B' to "
                + "\ndisplay the backpack. To use the backpack "
                + "\nfollow the Backpack Menu options.");
    }
}
