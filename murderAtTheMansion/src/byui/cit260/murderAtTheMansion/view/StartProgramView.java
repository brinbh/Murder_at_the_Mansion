/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.GameControl;
import byui.cit260.murderAtTheMansion.model.Player;
import java.util.Scanner;

/**
 *
 * @author Britt
 */
public class StartProgramView extends View {
    
    private String promptMessage;
    
    
    public StartProgramView () {
        super              ("\n****************************************************"
                          + "\n*       This is the game Murder at the Mansion    "
                          + "\n* In this game you are a detective who has been   "
                          + "\n* called to a house where a murder has taken place"
                          + "\n* Your job is to find out who did it.             "
                          + "\n*                                                 "
                          + "\n* You enter the house of the murder, and there    "
                          + "\n* you will find clues, suspect files, murder files"
                          + "\n* , and weapons scattered throughout the rooms.   "
                          + "\n* Throughtout the game you place items in your    "
                          + "\n* backpack to help you explore the house and be   "
                          + "\n* safe. A good detective knows that you must      "
                          + "\n* explore every inch of the murder scene which,   "
                          + "\n* lucky for you, is the whole house. Once you have"
                          + "\n* explored the whole house then you can guess the "
                          + "\n* murderer at the mansion.                        "
                          + "\n* Good luck detective!                            "
                          + "\n***************************************************"
                          + "\n\n Please enter your name: "
        );
    }

    
    
    @Override
    public boolean doAction(String playersName) {
         if (playersName.length() < 2) {
             System.out.println("\nInvalid players name: " 
                                + "The name must be greater than 1 character in length.");
             return false;
         }
         Player player = GameControl.createPlayer(playersName);
         
         if (player == null){
             System.out.println("\nError creating the player.");
             return false;
         }
         
         this.displayNextView(player);
        
         return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n=============================================="
                           +"\n Welcome to the game " + player.getName() + "."
                           +"\n We hope you have a lot of fun!"
                           +"\n=============================================="
        );
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
        
    }
    
    
}
