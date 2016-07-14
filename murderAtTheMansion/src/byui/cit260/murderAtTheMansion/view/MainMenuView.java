/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.exceptions.MapControlException;
import byui.cit260.murderAtTheMansion.control.GameControl;
import byui.cit260.murderAtTheMansion.model.Game;
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame()  {
            try {
            GameControl.createNewGame(MurderAtTheMansion.getPlayer());
            }
            catch (MapControlException mce){
           this.console.println(mce.getMessage());
            return;
            
            }
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
    }

    private void displayHelpMenu() {
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.display();
    }

    private void saveGame(){
        this.console.println("\n\n Enter the file path for the file where the game "
                + "needs to be saved.");
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(MurderAtTheMansion.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    private void startExistingGame (){
        this.console.println("\n\n Eneter the file path for the file where the game "
                + "can be saved.");
        String filePath = this.getInput();
        
        try{
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("ManinMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
}
