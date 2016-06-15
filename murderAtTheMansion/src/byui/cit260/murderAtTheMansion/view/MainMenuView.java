/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.GameControl;
import java.util.Scanner;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Britt
 */
public class MainMenuView extends View {
    private String menu;
    private String menuOption;

    public MainMenuView() {
        super (      "\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                          |"
                  + "\n--------------------------------------"
                  + "\nN - Start New Game"
                  + "\nR - Restart Existing Game"
                  + "\nH - Help"
                  + "\nS - Save Game"
                  + "\nQ - Quit Game"
                  + "\n--------------------------------------");
    }
    

   

    
    @Override 
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
            GameControl.createNewGame(MurderAtTheMansion.getPlayer());
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
    }

    private void startExistingGame() {
            System.out.println("\n*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
            System.out.println("\n*** saveGame() function called ***");
    }
    
}
