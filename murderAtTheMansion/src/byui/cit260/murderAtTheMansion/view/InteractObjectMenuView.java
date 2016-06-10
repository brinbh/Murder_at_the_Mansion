/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.InteractObject;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class InteractObjectMenuView {
    private String menu;
    private String menuOption;

    public void displayInteractObjectMenuView() {
        boolean done = false;
                while (!done) {
                    String menuOption = this.getMenuOption();
                            if (menuOption.toUpperCase().equals("Q")){
                        break;
                            }

                    done = this.doAction(menuOption);
                }    
    }
    private  String getMenuOption() {
        InteractObject interactObject = new InteractObject();
        interactObject.interactObject();
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            
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
            GameMenuView gameMenu = new GameMenuView();

        switch(choice){
            case "Y" :
                System.out.println("\n*** You picked up the item ***"); 
                    gameMenu.displayGameMenu();
            break;
            case "N":
                System.out.println("\n*** You dropped the item ***");      
            gameMenu.displayGameMenu();
            break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
            }
        
        /*if (choice == "Y") {
            System.out.println("\n*** You picked up the item ***");   
            InteractObject interactObject = new InteractObject();
            interactObject.interactObject();
        }
        if (choice == "N"){
            System.out.println("\n*** You dropped the item ***");      
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
        }
        else {
                System.out.println("\n*** Invalid selection *** Try again");
        }
        */
        
        return false;
    }


    }
