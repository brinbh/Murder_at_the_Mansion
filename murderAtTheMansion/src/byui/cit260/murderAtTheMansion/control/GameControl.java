/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import byui.cit260.murderAtTheMansion.model.Backpack;
import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Item;
import byui.cit260.murderAtTheMansion.model.Map;
import byui.cit260.murderAtTheMansion.model.Player;
import byui.cit260.murderAtTheMansion.model.Scene;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Britt
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        MurderAtTheMansion.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        MurderAtTheMansion.setCurrentGame(game);
        
        game.setPlayer(player);

        Item[] itemList = GameControl.createItemList();
        game.setItem(itemList);
        
        Backpack backpack = new Backpack();
        game.setBackpack(backpack);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
        
        
    }

    private static Item[] createItemList() {
        Item[] item = new Item[14];
        
        
                
        
        return item;
    }

    static void assignScenesLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
