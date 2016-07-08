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
import byui.cit260.murderAtTheMansion.model.Character;
import byui.cit260.murderAtTheMansion.model.MainCharacter;
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

        MainCharacter mainCharacter = new MainCharacter();
        game.setMainCharacter(mainCharacter);
        
        Backpack backpack = new Backpack();
        game.setBackpack(backpack);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        
    }

    public static Character[] sortCharacters (){
        //extract enum items into an array 
        Character[] charList = Character.values();
        
        int n = charList.length;
        int k;
        for (int m = n; m >= 0; m--){
            for (int i = 0; i < n - 1; i++){
               k = i + 1;
               
               
               Character c1 = charList[i];
               Character c2 = charList[k];
                String s1 = c1.name();
                String s2 = c2.name();
                
                int result = s1.compareTo(s2);
                
                if(result > 0){
                  swapCharacter(i,k,charList);
               }
               
               
            }
            
        }
        return charList;
    }
    public static void swapCharacter (int i, int j, Character[] charList){
        
    
       Character character;
       character = charList[i];
       charList[i] = charList[j];
       charList[j] = character;
        
    }
    
}

   

    
        

    

