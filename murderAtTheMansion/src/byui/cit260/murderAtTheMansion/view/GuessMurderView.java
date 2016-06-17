/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

/**
 *
 * @author Sara
 */
public class GuessMurderView extends View {



    public GuessMurderView() {
        super("\n Do you want to guess who the murderer is? Y or N");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "Y":
                this.displayMessage = "\nPlease enter the name of the murderer";
                String value = this.getInput();
                value = value.toUpperCase();
                if (value.equals("JOHN")) {
                    System.out.println("You guessed right! He is the murderer!");
                    return true;
                }
                System.out.println("You guessed wrong! Look at your clues again detective.");
                break;
            case "N":
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }

        return false;

    }

}
