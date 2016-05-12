/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderatthemansion;

import byui.cit260.murderAtTheMansion.model.Player;
import byui.cit260.murderAtTheMansion.model.Character;


/**
 *
 * @author Britt
 */
public class MurderAtTheMansion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("George Lucas");
        playerOne.setNumGuess(4);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Character charOne = new Character();
        
        charOne.setName("Decetive Danger");
        charOne.setDescription("Tall, Dark, and Handsome");
        charOne.setCordinates(20);
        
        String charInfo = charOne.toString();
        System.out.println(charInfo);
    }
    
}
