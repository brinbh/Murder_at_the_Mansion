/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit230.murderAtTheMansion.exceptions.puzzleControlException;
import byui.cit260.murderAtTheMansion.control.puzzleControl;

/**
 *
 * @author Sara
 */
public class MurderAmountOfTimeView extends View{

    private String promptMessage;
    
    public MurderAmountOfTimeView () {
        super ("\nWhat is the start time?");
    
}

    @Override
    public boolean doAction(String strST) {
        //age
        int startTime = Integer.parseInt(strST);
        //weight
        this.promptMessage = "What is the end time?";
        String strET = this.getInput();
        int endTime = Integer.parseInt(strET);
        //time 
        this.promptMessage = "What is the amount of time that they had to hide the body?";
        String strHBT = this.getInput();
        int hideBodyTime = Integer.parseInt(strHBT);
        //call code 
        double murderTime = 0;
        try {
            murderTime = puzzleControl.murderAmountOfTime(startTime, endTime, hideBodyTime);
        } catch (puzzleControlException ex) {
            ErrorView.display(this.getClass().getName(),"\n Wrong input.");
        }
        //print out code 
        this.console.println(murderTime);
        
        return true;
        
         }
    
}
