/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.model.Clues;
import byui.cit260.murderAtTheMansion.model.Files;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class ViewCluesView extends View {

    private String menu;
    private String menuOption;

    public ViewCluesView() {
        super ("\n"
                  + "\n--------------------------------------"
                  + "\n|Clues Menu                    |"
                  + "\n--------------------------------------"
                  + "\nG - Golf Club"
                  + "\nL - License"
                  + "\nR - Reciept"
                  + "\nN - Note"
                  + "\nF - Footprint"
                  + "\nQ - Quit Murder file menu"
                  + "\n--------------------------------------");
    }

    
    
    @Override 
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.printClues(Clues.clue1);
                break;
            case "L":
                this.printClues(Clues.clue2);
                break;
            case "R":
                this.printClues(Clues.clue3);
                break;
            case "N":
                this.printClues(Clues.clue4);
                break;
            case "F":
                this.printClues(Clues.clue5);
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void printClues(Clues inputClue) {
        
        //get the file location 
        String locationOfClue = inputClue.getClueLocation();
        //creat file stream to read in the file 
        try(Scanner in = new Scanner(new FileReader(locationOfClue))){
            while (in.hasNextLine()){
                String readLine = in.nextLine();
                this.console.println(readLine);
            }
            
        }catch (IOException ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());

        }
        
    }

   
}

