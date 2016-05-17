/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderatthemansion;

import byui.cit260.murderAtTheMansion.model.Player;

import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Map;
import byui.cit260.murderAtTheMansion.model.Character;
import byui.cit260.murderAtTheMansion.model.Location;
import byui.cit260.murderAtTheMansion.model.Scene;
import byui.cit260.murderAtTheMansion.model.ResourceTypeScene;
import byui.cit260.murderAtTheMansion.model.Guess;
import byui.cit260.murderAtTheMansion.model.Item;
import byui.cit260.murderAtTheMansion.model.Backpack;




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
        Location locationOne = new Location();
        
        locationOne.setCol(1);
        locationOne.setRow(1);
        locationOne.setVisited(1);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        //Scene
        Scene sceneOne = new Scene();

        sceneOne.setDescription("This is a bedroom. It is perfectly clean and shows no signs of wear.");
        sceneOne.setTravelTime(2);
        sceneOne.setBlockedLocation(0);
        sceneOne.setDisplaySymbol("|_|");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        //ResourceTypeScene
        ResourceTypeScene resourceTypeOne = new ResourceTypeScene();
        
        resourceTypeOne.setAmountAvailable(5);
        resourceTypeOne.setResourceType("Flashlight Batteries");
        
        String resourceOneInfo = resourceTypeOne.toString();
        System.out.println(resourceOneInfo);
        
        //Character
        Character charOne = new Character();
        
        charOne.setName("Decetive Danger");
        charOne.setDescription("Tall, Dark, and Handsome");
        charOne.setCordinates(20);
        
        String charInfo = charOne.toString();
        System.out.println(charInfo);
        
        //Guess
        Guess guessPlayer = new Guess();
        
        guessPlayer.setGuessNum(5);
        guessPlayer.setGuessIsWrong("Your guess is Wrong!");
        guessPlayer.setGuessIsRight("Your guess is Right!");
        guessPlayer.setGuess("Would you like to guess who the murderer is?");
        
        String guessInfo = guessPlayer.toString();
        System.out.println(guessInfo);
        
        //Items
        Item items = new Item();
        
        items.setPlaceIn("Place the item in your backpack?");
        items.setLookAt("Would you like to look at the item?");
        items.setReadItem("This item can be read, would you like to read it?");
        items.setUseItem("Would you like to use this item?");
        
        String itemInfo = items.toString();
        System.out.println(itemInfo);
        
        //Backpack
        Backpack useBackpack = new Backpack();
        
        useBackpack.setItemAmount(1);
        useBackpack.setTypeOfClue("Clue");
        useBackpack.setTypeOfWeapon("Weapon");
        useBackpack.setTypeOfFile("File");
        
        String backpackInfo = useBackpack.toString();
        System.out.println(backpackInfo);
        
        
        
        
        
    }
    
}
