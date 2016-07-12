/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.view;

import byui.cit260.murderAtTheMansion.exceptions.puzzleControlException;
import byui.cit260.murderAtTheMansion.control.puzzleControl;

/**
 *
 * @author Sara
 */
public class DeCodePuzzleView extends View{

    private String promptMessage;
    
    public DeCodePuzzleView () {
        super ("\nWhat is the age of the victim?");
    
}

    @Override
    public boolean doAction(String strAge) {
        //age
        int age = Integer.parseInt(strAge);
        //weight
        this.promptMessage = "What is the weight of the victim?";
        String strWeight = this.getInput();
        int weight = Integer.parseInt(strWeight);
        //time 
        this.promptMessage = "What is the amount of time?";
        String strTime = this.getInput();
        int amount = Integer.parseInt(strTime);
        //call code 
        double code = 0;
        try {
            code = puzzleControl.decodePuzzle(age, weight, amount);
        } catch (puzzleControlException ex) {
            ErrorView.display(this.getClass().getName(),"\n Wrong input.");
        }
        //print out code 
        this.console.println(code);
        
        return true;
        
         }
    
}
