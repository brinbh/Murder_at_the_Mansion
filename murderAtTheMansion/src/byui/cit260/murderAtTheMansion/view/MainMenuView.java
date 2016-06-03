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
class MainMenuView {
    private String menu;
    private String menuOption;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                          |"
                  + "\n--------------------------------------"
                  + "\nN - Start New Game"
                  + "\nR - Restart Existing Game"
                  + "\nH - Help"
                  + "\nS - Save Game"
                  + "\nQ - Quit Game"
                  + "\n--------------------------------------";
    }
    

    void displayMainMenuView() {
        
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
            gameMenu.displayMenu();
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
