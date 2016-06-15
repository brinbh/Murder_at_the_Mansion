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
    
    public InteractObjectMenuView() {
        super ("\n Would you like to pick up this item? Y or N?");
    }
   
        
    @Override   
    public boolean doAction(String choice) {
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
        
               
        return false;
    }


    }
