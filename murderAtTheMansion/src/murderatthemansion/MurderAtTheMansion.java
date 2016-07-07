/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderatthemansion;

import byui.cit260.murderAtTheMansion.model.Game;
import byui.cit260.murderAtTheMansion.model.Player;
import byui.cit260.murderAtTheMansion.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Britt
 */
public class MurderAtTheMansion {
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null; 
    
    private static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MurderAtTheMansion.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MurderAtTheMansion.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MurderAtTheMansion.logFile = logFile;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        MurderAtTheMansion.inFile = new BufferedReader(new InputStreamReader(System.in));
        MurderAtTheMansion.outFile = new PrintWriter(System.out, true);
        
        String filePath = "log.txt";
        MurderAtTheMansion.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        }
        catch (Throwable te){
            System.out.println("Exception:" + te.toString()+
                               "\nCause:" + te.getCause()+
                               "\nMessage:" + te.getMessage());
            te.printStackTrace(); 
           
        }
        finally{
            try {
                if (MurderAtTheMansion.inFile != null)
                    MurderAtTheMansion.inFile.close();
                
                if (MurderAtTheMansion.outFile != null)
                    MurderAtTheMansion.outFile.close();
                
                if (MurderAtTheMansion.logFile != null)
                    MurderAtTheMansion.logFile.close();
                
                
            } catch (IOException ex) {
                Logger.getLogger(MurderAtTheMansion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
    }
    
}
