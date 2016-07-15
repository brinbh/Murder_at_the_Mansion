/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import java.awt.Point;
import java.util.Objects;

/**
 *
 * @author Britt
 */
public enum Item {
    golfClub("Bloody Golf Club","This is a golf club with blood on it.", "Clue"),
    license("Driver's License", "This is the victim's driver's license.", "Clue"),
    reciept("Reciept", "This is the reciept from the dinner he bought for everyone.", "Clue"),
    note("Note from CEO", "This is a note of praise from the CEO.", "Clue"),
    footprint("Footprint", "This is a small footprint leading away from the murder scene", "Clue"),
    knife("Carving Knife", "This is a very sharp knife.", "Weapon"),
    flashlight("Heavy Duty Flashlight", "This is a very heavy flashlight with batteries.", "Weapon"),
    bat("Metal Bat", "Victim's son's metal baseball bat.", "Weapon"),
    filePaula("Paula Duncan", "Nanny that has worked for them for 15 years", "File"),
    fileRandalph("Randalph", "Neighbor who likes to play golf and garden", "File"),
    fileCharlie("Charlie","Nephew of the victim. He is in his mid-twenties.", "File"),
    fileJohn("John", "Victim's boss who is a coorporate manager at Google.", "File"),
    fileSophia("Sophia", "Ex-lover of the victim.", "File"),
    fileMarvin("Marvin", "Victim. He is now dead.", "File");
    
    private String title;
    private String description;
    private String type;

    



    Item(String title, String description, String type) {
        this.title = title;
        this.description = description;
        this.type = type;
    }
    

    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
  

    @Override
    public String toString() {
        return "Clue{" + "title=" + title + ", description=" + description + '}';
    }

    
    
    
    
}
