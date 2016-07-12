/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.model.Files;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class MurderedFileView extends View {

  
    private String menu;
    private String menuOption;

    public MurderedFileView() {
        super ("\n"
                  + "\n--------------------------------------"
                  + "\n|Murder File Menu                    |"
                  + "\n--------------------------------------"
                  + "\nP - Paula's file"
                  + "\nR - Randalph's file"
                  + "\nC - Charlie's file"
                  + "\nJ - John's file"
                  + "\nS - Sophia's file"
                  + "\nM - Marvin's file"
                  + "\nQ - Quit Murder file menu"
                  + "\n--------------------------------------");
    }

    
    
    @Override 
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "P":
                this.printFile(Files.pFile);
                break;
            case "R":
                this.printFile(Files.rFile);
                break;
            case "C":
                this.printFile(Files.cFile);
                break;
            case "J":
                this.printFile(Files.jFile);
                break;
            case "S":
                this.printFile(Files.sFile);
                break;
            case "M":
                this.printFile(Files.mFile);
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void printFile(Files inputFile) {
        
        //get the file location 
        String locationOfFile = inputFile.getFileLocation();
        //creat file stream to read in the file 
        try(Scanner in = new Scanner(new FileReader(locationOfFile))){
            while (in.hasNextLine()){
                String readLine = in.nextLine();
                this.console.println(readLine);
            }
            
        }catch (IOException ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());

        }
        
    }

   
}
