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
public class BackpackWeaponsView extends View{

    public BackpackWeaponsView() {
        super    ("\n----------------------------------------"
                + "\n| Which weapon would you like to equipt?"
                + "\n----------------------------------------"
                + "\nK - Knife"
                + "\nF - Flashlight"
                + "\nB - Bat"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "K":
               
                    this.console.println("You now have the knife as your weapon.");
                    return true;
                
                case "F":
                
                    this.console.println("You now have the flashlight as your weapon.");
                    return true;
                
                case "B":
                
                    this.console.println("You now have the bat as your weapon.");
                    return true;
                
            
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;

        }

        return false;

    }

}
