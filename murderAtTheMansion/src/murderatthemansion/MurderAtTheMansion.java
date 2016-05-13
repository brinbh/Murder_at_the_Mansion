/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderatthemansion;

import byui.cit260.murderAtTheMansion.model.Player;
import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Map;

/**
 *
 * @author Britt
 */
public class MurderAtTheMansion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Player
        Player playerOne = new Player();
        
        playerOne.setName("George Lucas");
        playerOne.setNumGuess(4);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Game
        Game gameOne = new Game();
        
        gameOne.setTotalTime(5);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Map
        Map mapOne = new Map();
        
        mapOne.setColCount(2);
        mapOne.setRowCount(3);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        //Location
        
        //Scene
        
        //ResourceTypeScene
        
        
    }
    
}
