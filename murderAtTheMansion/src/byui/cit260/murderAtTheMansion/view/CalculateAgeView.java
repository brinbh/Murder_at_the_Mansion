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
public class CalculateAgeView extends View{

    private String promptMessage;
    
    public CalculateAgeView () {
        super ("\nWhat is the month of birth of the victim?");
    
}

    @Override
    public boolean doAction(String strBM) {
        //birth month 
        int birthMonth = Integer.parseInt(strBM);
        //year of birth 
        this.promptMessage = "What is their year of birth?";
        String strYB = this.getInput();
        int yearBirth = Integer.parseInt(strYB);
        //month of death  
        this.promptMessage = "What is their month of death?";
        String strMD = this.getInput();
        int monthDeath = Integer.parseInt(strMD);
        //year of death  
        this.promptMessage = "What is their year of death?";
        String strYD = this.getInput();
        int yearDeath = Integer.parseInt(strYD);
        //call code 
        double ageOfMurderer = 0;
        try {
            ageOfMurderer = puzzleControl.calculateAge(birthMonth, yearBirth, monthDeath, yearDeath);
        } catch (puzzleControlException ex) {
            ErrorView.display(this.getClass().getName(),"\n Wrong input.");
        }
        //print out code 
        this.console.println(ageOfMurderer);
        
        return true;
        
         }
    
}

