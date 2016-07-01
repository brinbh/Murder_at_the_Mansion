/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import byui.cit230.murderAtTheMansion.exceptions.MapControlException;
import byui.cit260.murderAtTheMansion.model.Backpack;
import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Item;
import byui.cit260.murderAtTheMansion.model.Map;
import byui.cit260.murderAtTheMansion.model.Player;
import byui.cit260.murderAtTheMansion.model.Scene;
import byui.cit260.murderAtTheMansion.model.Character;
import java.util.ArrayList;
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

    public static void createNewGame(Player player) throws MapControlException {
        Game game = new Game();
        MurderAtTheMansion.setCurrentGame(game);
        
        game.setPlayer(player);
        player.setCharacter(Character.MainCharacter);

       // Item[] itemList = GameControl.createItemList();
        //game.setItem(itemList);
        
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
    public int calculateTotalItems() {
        String errorMessage = "ERROR in retrieving the Items list. There is an error in the";
        Item[] itemList = MurderAtTheMansion.getCurrentGame().getItem();

        for (Item item : itemList) {
            int sumClues;
            int sumFiles;
            int sumWeapons;
            //check for errors
            if (items == 0) {
                System.out.println(errorMessage + " Item[]. Item[] == NULL");
                return -1;
            }
            if (items == 0) {
                System.out.println(errorMessage + " Item[]. Item[] == 0");
                return -1;
            }
            if (type 
                does 
            not equal clue, file, or weapon
            
                ){
		System.out.println(errorMessage + " type");
                return -1;
            }
            if (type == "clue") {
                sumClues += Item[counter];
            } else if (type == file) {
                sumFiles += Item[counter];
            } else {
                (type == weapon)
            
            }
            sumWeapon += Item[counter];

            if (sumClues < 0) {
                System.out.println(errorMessage + " sum of the Clues");
                return -1;
                break;
            }
            if (sumFiles < 0) {
                System.out.println(errorMessage + " sum of the Files");
                return -1;
            }
            if (sumWeapons < 0) {
                System.out.println(errorMessage + " sum of the Weapons");
                return -1;
            }
            System.out.println("The sum of the Clues is: " + sumClues);
            System.out.println("The sum of the Files is: " + sumFiles);
            System.out.println("The sum of the Weapons is: " + sumWeapons);
        }
        return 0;
    }
}
