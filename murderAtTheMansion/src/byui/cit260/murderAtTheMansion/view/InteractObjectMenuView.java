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
public class InteractObjectMenuView extends View{
    private String menu;
    private String menuOption;

  public InteractObjectMenuView () {
      super ();
  }
    public boolean doAction(String choice) {
    choice = choice.toUpperCase();
            GameMenuView gameMenu = new GameMenuView();

        switch(choice){
            case "Y" :
                System.out.println("\n*** You picked up the item ***"); 
                    gameMenu.display();
            break;
            case "N":
                System.out.println("\n*** You dropped the item ***");      
            gameMenu.display();
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
