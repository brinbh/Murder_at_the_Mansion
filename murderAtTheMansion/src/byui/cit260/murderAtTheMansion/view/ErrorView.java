/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import java.io.PrintWriter;
import murderatthemansion.MurderAtTheMansion;

/**
 *
 * @author Sara
 */
public class ErrorView {
    private static final PrintWriter errorFile = MurderAtTheMansion.getOutFile();
    private static final PrintWriter logFile = MurderAtTheMansion.getLogFile();

    public static void display(String className, String errorMessage){
        errorFile.println(
                    "------------------------------------------------"
                   +"\n- Error -" + errorMessage
                   +"\n----------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
        
    }
}
