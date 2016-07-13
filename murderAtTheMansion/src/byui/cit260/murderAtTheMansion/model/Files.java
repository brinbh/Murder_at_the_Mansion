/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

/**
 *
 * @author Sara
 */
public enum Files {
    
    pFile("file1.txt"),
    rFile("file2.txt"),
    cFile("file3.txt"),
    jFile("file4.txt"),
    sFile("file5.txt"),
    mFile("file6.txt");
    
    String fileLocation;
    
    Files (String fileLocation){
        this.fileLocation = fileLocation; 
    }

    public String getFileLocation() {
        return fileLocation;
    }

   
    
}
