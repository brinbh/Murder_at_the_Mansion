/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.MoveCharacter;
import java.util.Scanner;

/**
 *
 * @author Britt
 */
public class MoveCharacterMenuView {
    
    private String menu;
    private String menuOption;

    public MoveCharacterMenuView() {
        this.menu = "Enter in new location with number of "
                + "spaces and the direction (include space between): "
                + "\nU - up"
                + "\nD - down "
                + "\nL - left "
                + "\nR - right "
                + "\n\"Ex. U 2\""
                + "\n\nTo Quit press \"Q\".";
        
    }    
     void displayMoveCharacterMenuView() {
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

        //extract the direction and distance
        String [] words = choice.split(" ");
        //verify the amount of variables in array
        if (words.length != 2){
            System.out.println("\n*** Invalid input. Please input the letter, a space, and then the number***");
            return false;
        }
        String direction = words[0];
        String sdistance = words[1];
        
        int distance;
        
        //verify that the input is in order
       
        try {
            distance = Integer.parseInt(sdistance);
        }
        catch(NumberFormatException ex) {
            System.out.println("\n*** Invalid value. You must first enter the direction then the distance. ***");
            return false;
        }
        switch (direction) {
                case "U":
                case "D":
                case "L":
                case "R":
                    MoveCharacter moveCharacter = new MoveCharacter();
                    moveCharacter.moveCharacter(direction, distance);
                    break;
                default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;   
    }


}

