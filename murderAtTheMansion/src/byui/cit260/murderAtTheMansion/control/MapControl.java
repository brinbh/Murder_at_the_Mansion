/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import byui.cit260.murderAtTheMansion.exceptions.MapControlException;
import byui.cit260.murderAtTheMansion.model.Item;
import byui.cit260.murderAtTheMansion.model.Location;
import byui.cit260.murderAtTheMansion.model.MainCharacter;
import byui.cit260.murderAtTheMansion.model.Map;
import byui.cit260.murderAtTheMansion.model.Scene;
import java.awt.Point;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Sara
 */
public class MapControl {

    static Map createMap() throws MapControlException {
        Map map = new Map(5,5);
        Scene[] scenes = createScenes();
        MapControl.assignScenesToLocations(map, scenes);
        MapControl.assignItemToLocation(map);
        
        return map;
       
    }

    /*public static void moveMainCharacterToStartingLocation() throws MapControlException {

       Point startingLocation = new Point(0,0);
       MapControl.moveCharacterToLocation(startingLocation);

    }*/
    public static boolean moveCharacterToLocation(Point coordinates) throws MapControlException{
        Map map = MurderAtTheMansion.getCurrentGame().getMap();
        MainCharacter mainCharacter = MurderAtTheMansion.getPlayer().getMainCharacter();
        Point currentLocation = mainCharacter.getCoordinates();

        //reset coordinates
        if (coordinates.x != 0)
            coordinates.x -= 1;
        if (coordinates.y != 0)
            coordinates.y -= 1;
        int newRow = coordinates.x + currentLocation.x;
        int newCol = coordinates.y + currentLocation.y;

        //delete character from location
        Location[][] locationList = map.getLocations();
        locationList[currentLocation.x][currentLocation.y].setMainCharacter(false);

        //add character to new location
        Location[][] newLocationList = map.getLocations();
        newLocationList[newRow][newCol].setMainCharacter(true);
        newLocationList[newRow][newCol].getScene().setVisited(true);
        

        //set Character's Location
        Point newCoordinates = new Point(newRow, newCol);
        MurderAtTheMansion.getPlayer().getMainCharacter().setCoordinates(newCoordinates);

        if (newRow < 0 || newRow > 5 || newCol < 0 || newCol > 5){
            throw new MapControlException("Can not move actor to location " +
                    coordinates.x + ", " + coordinates.y + " because that "
                    + "location is outside the bounds of the map.");
        }
        
        return true;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        Scene startingScene = new Scene();
        Scene hallwayScene = new Scene();
        Scene masterScene = new Scene();
        Scene kidScene = new Scene();
        Scene laundryScene = new Scene();
        Scene gameScene = new Scene();
        Scene officeScene = new Scene();
        Scene diningScene = new Scene();
        Scene livingScene = new Scene();
        Scene kitchenScene = new Scene();

        //front door scene
        startingScene.setDescription(
                "Welcome to the Marvin's mansion. The suspects are still in the "
                        + "mansion. You need to go around and find clues, files,"
                        + "and weapons to figure out who is the murderer at the "
                        + "mansion. This the front door of the mansion. You can "
                        + "move around anywhere inside the mansion.");
        startingScene.setDisplaySymbol("ST");
        startingScene.setVisited(true);
        
        scenes[SceneType.frontDoor.ordinal()] = startingScene;

        //hallway
        hallwayScene.setDescription(
                "You are in a crooked hallway covered with rather large portraits"
                        + "of old men. There are golfing trophies and a strange"
                        + "smell.");
        hallwayScene.setDisplaySymbol("||");
        hallwayScene.setVisited(false);
        scenes[SceneType.hallway.ordinal()] = hallwayScene;

        //master room
        masterScene.setDescription(
                "You enter the large master bedroom with a bed too big for just"
                        + "one person. In the room is where the murder has taken"
                        + "place so the smell of blood is in the air."
                    );
        masterScene.setDisplaySymbol("MR");
        masterScene.setVisited(false);
        scenes[SceneType.masterRoom.ordinal()] = masterScene;
        //kids room
        kidScene.setDescription(
                "You are in the kid's room. It seems that he is about the age"
                        + "of 7 from the superhero books and bedsheets. He is "
                        + "also into sports, with bats and gloves laying on the"
                        + "floor."
                    );
        kidScene.setDisplaySymbol("KR");
        kidScene.setVisited(false);
        scenes[SceneType.kidRoom.ordinal()] = kidScene;
        //laundry room
        laundryScene.setDescription(
                "You are now in the laundry room. It seems to be quite large"
                        + "for just three people in the house. There is also "
                        + "laundry that hasn't been done yet."
                    );
        laundryScene.setDisplaySymbol("LR");
        laundryScene.setVisited(false);
        scenes[SceneType.laundryRoom.ordinal()] = laundryScene;
        //game room
        gameScene.setDescription(
                "You enter the game room, it has a pool table, dart board, "
                        + "air hockey, and skee ball. Seems like a pretty"
                        + "fun place to hang out."
                    );
        gameScene.setDisplaySymbol("GR");
        gameScene.setVisited(false);
        scenes[SceneType.gameRoom.ordinal()] = gameScene;
        //office
        officeScene.setDescription(
                "You are now in the victim's office. It is very orderly and"
                        + "neat, there is not a single paper out of place. But"
                        + "there is something out of place."
                    );
        officeScene.setDisplaySymbol("OF");
        officeScene.setVisited(false);
        scenes[SceneType.office.ordinal()] = officeScene;
        //dining room
        diningScene.setDescription(
                "You enter the dining room. It seems to be fit for a king with "
                        + "expensive china on the table. The food has been eaten"
                        + "but the nanny hasn't picked it up yet."
                    );
        diningScene.setDisplaySymbol("DR");
        diningScene.setVisited(false);
        scenes[SceneType.diningRoom.ordinal()] = diningScene;
        //parlor or living room
        livingScene.setDescription(
                "You are now in the living room. It is huge, with a giant television"
                        + "in the corner. The smell of cigars fills the room. You seem "
                        + "envious."
                    );
        livingScene.setDisplaySymbol("PA");
        livingScene.setVisited(false);
        scenes[SceneType.livingRoom.ordinal()] = livingScene;
        //kitchen
        kitchenScene.setDescription(
                "You are now in the kitchen. It is the biggest one that you have "
                        + "ever seen. It looks like something was about to be made"
                        + "but they stoppen halfway through."

                    );
        kitchenScene.setDisplaySymbol("KI");
        kitchenScene.setVisited(false);
        scenes[SceneType.kitchen.ordinal()] = kitchenScene;




        return scenes;
    }
    private static void assignItemToLocation(Map map){
        Location[][] locations = map.getLocations();

        locations[0][1].setItem(Item.reciept);
        locations[2][1].setItem(Item.golfClub);
        locations[1][1].setItem(Item.license);
        locations[2][4].setItem(Item.note);
        locations[4][1].setItem(Item.footprint);
        locations[0][4].setItem(Item.knife);
        locations[3][4].setItem(Item.flashlight);
        locations[3][2].setItem(Item.bat);
        locations[0][3].setItem(Item.filePaula);
        locations[1][2].setItem(Item.fileRandalph);
        locations[4][0].setItem(Item.fileCharlie);
        locations[2][3].setItem(Item.fileJohn);
        locations[3][3].setItem(Item.fileSophia);
        locations[3][1].setItem(Item.fileMarvin);

    }
    private static void assignScenesToLocations(Map map, Scene[] scenes){

        Location[][] locations = map.getLocations();
        //startpoint
        locations[0][0].setScene(scenes[SceneType.frontDoor.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.livingRoom.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.livingRoom.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.livingRoom.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.livingRoom.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.diningRoom.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.diningRoom.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.office.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.office.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.masterRoom.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.masterRoom.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.kidRoom.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.kidRoom.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.gameRoom.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.masterRoom.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.masterRoom.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.laundryRoom.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.laundryRoom.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.gameRoom.ordinal()]);
        


    }


}
