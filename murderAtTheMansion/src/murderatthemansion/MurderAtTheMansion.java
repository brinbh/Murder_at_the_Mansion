/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderatthemansion;

import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Player;
import byui.cit260.murderAtTheMansion.view.StartProgramView;


/**
 *
 * @author Britt
 */
public class MurderAtTheMansion {
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MurderAtTheMansion.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MurderAtTheMansion.player = player;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.display(); }
        catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
        
        
        
        
        
        
    }
    
}
