/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.exceptions.GameControlException;
import byui.cit260.murderAtTheMansion.model.Location;
import byui.cit260.murderAtTheMansion.model.Item;
import java.util.logging.Level;
import java.util.logging.Logger;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Britt
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n| Game Menu                          |"
                + "\n--------------------------------------"
                + "\n M - Move Character"
                + "\n I - Interact with Objects"
                + "\n DM - Display Map"
                + "\n B - Show Backpack"
                + "\n G - Guess Murderer"
                + "\n C - Sort character list"
                + "\n TI - Get sum of total items"
                + "\n H - Help"
                + "\n Q - Quit Game Menu"
                + "\n--------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "M":
                this.moveCharacter();
                break;
            case "I":
                this.interactWithObject();
                break;
            case "DL":
                this.displayContentOfLocation();
                break;
            case "DM":
                this.displayMap();
                break;
            case "B":
                this.showBackpack();
                break;
            case "G":
                this.guessMurderer();
                break;
            case "C":
                this.sortCharactersView();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "TI": {
                try {
                    this.showTotalItemsView();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void moveCharacter() {
        MoveCharacterMenuView moveCharacterMenuView = new MoveCharacterMenuView();
        moveCharacterMenuView.display();

    }

    private void interactWithObject() {

        InteractObjectMenuView interactObjectMenuView = new InteractObjectMenuView();
        interactObjectMenuView.display();
    }

    private void displayContentOfLocation() {
        ErrorView.display(this.getClass().getName(), "\n*** displayContentOfLocationl() function called***");
    }

    private void displayMap() {
        DisplayMapView displayMapView = new DisplayMapView();
        displayMapView.display();

    }

    private void showBackpack() {
        BackpackMenuView backpackMenuView = new BackpackMenuView();
        backpackMenuView.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void guessMurderer() {
        GuessMurderView guessMurderView = new GuessMurderView();
        guessMurderView.display();
    }

    public void showTotalItemsView() throws GameControlException {
        TotalItemsView totalItemsView = new TotalItemsView();
        totalItemsView.display();
        }

    private void sortCharactersView() {
        SortCharactersView sortCharactersView = new SortCharactersView();
        sortCharactersView.display();

    }


}

