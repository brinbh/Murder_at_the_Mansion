/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.control.MapControl;
import byui.cit260.murderAtTheMansion.exceptions.MapControlException;
import byui.cit260.murderAtTheMansion.model.Item;
import byui.cit260.murderAtTheMansion.model.Location;
import byui.cit260.murderAtTheMansion.model.MainCharacter;
import java.awt.Point;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Britt
 */
public class MoveCharacterMenuView extends View {

    private String menu;
    private String menuOption;

    public MoveCharacterMenuView() {
        super("Enter in new location with number of "
                + "\nspaces and the direction (include space between): "
                + "\nU - up"
                + "\nD - down "
                + "\nL - left "
                + "\nR - right "
                + "\n\"Ex. U 2\""
                + "\n\nTo Quit press \"Q\".");

    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        //extract the direction and distance
        String[] words = choice.split(" ");
        //verify the amount of variables in array
        if (words.length != 2) {
            ErrorView.display(this.getClass().getName(), "\n*** Invalid input. Please input the letter, a space, and then the number***");
            return false;
        }
        String sdirection = words[0];
        String sdistance = words[1];
        int distance;

        //verify that the input is in order
        try {
            distance = Integer.parseInt(sdistance);
        } catch (NumberFormatException ex) {
            ErrorView.display(this.getClass().getName(), "\n*** Invalid value. You must first enter the direction then the distance. ***");
            return false;
        }

        //change letter input to direction number
        sdirection = sdirection.toUpperCase();
        MainCharacter mainCharacter = MurderAtTheMansion.getPlayer().getMainCharacter();
        int currentRow = mainCharacter.getCoordinates().x;
        int currentCol = mainCharacter.getCoordinates().y;
        int newCol = currentCol;
        int newRow = currentRow;

        switch (sdirection) {
            case "U":
                newCol -= distance;
                break;
            case "D":
                newCol += distance;
                break;
            case "L":
                newRow -= distance;
                break;
            case "R":
                newRow += distance;
                break;

            default:
                newRow = currentRow;
                newCol = currentCol;
                break;
        }

        //create Point variable
        Point desiredPosition = new Point(newRow, newCol);

        switch (sdirection) {
            case "U":
            case "D":
            case "L":
            case "R": {
                try {
                    MapControl.moveCharacterToLocation(desiredPosition);
                    if (MapControl.moveCharacterToLocation(desiredPosition)) {
                        this.console.println("Your character has now moved to location: "
                                + MurderAtTheMansion.getPlayer().getMainCharacter().getCoordinates());
                        Location destination = MurderAtTheMansion.getCurrentGame().getMap().getLocations()[newCol][newRow];
                        this.console.println(destination.getScene().getDescription());
                        if (destination.getItem() != null) {
                            this.console.println(destination.getItem().getDescription());
                            Item item = destination.getItem();
                            destination.setItem(null);
                            MurderAtTheMansion.getPlayer().getInventoryItem().add(item);
                        }

                    }
                } catch (MapControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Wrong input for direction.");
                }
            }
            break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }
        DisplayMapView displayMapView = new DisplayMapView();
        displayMapView.display();
        return false;
    }

}
