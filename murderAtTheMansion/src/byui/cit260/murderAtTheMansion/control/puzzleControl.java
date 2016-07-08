/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import byui.cit230.murderAtTheMansion.exceptions.MapControlException;
import byui.cit230.murderAtTheMansion.exceptions.puzzleControlException;

/**
 *
 * @author Britt
 */
public class puzzleControl {
    public static double decodePuzzle(int age, double weight, double amount)throws puzzleControlException {
        //verify the validity of the input
        //age
        if (age < 24 || age > 36){
            throw new puzzleControlException("The age that you entered is"
                    + "incorrect, please try again!");
        }
        //weight
        if (weight < 199 || weight > 301){
            throw new puzzleControlException("The weight that you entered is"
                    + "incorrect, please try again!");
        }
        //amount
        if (amount < 1 || amount > 6){
            throw new puzzleControlException("The amount of time that you entered is"
                    + "incorrect, please try again!");
        }
        //code = age + (weight * amount); 
        double code = age + (weight * amount);
        
        return code;
        
    }
    
    public double calculateAge(int monthOfBirth, int yearOfBirth, int monthOfDeath, int yearOfDeath)throws puzzleControlException{
        //Verfify validity of input
        //monthOfBirth
        if (monthOfBirth < 0 || monthOfBirth > 12){
            throw new puzzleControlException("The month of birth that you entered is"
                    + "incorrect, please try again"); 
        }
        //yearOfBirth
        if (yearOfBirth < 1980 || yearOfBirth > 1992){
            throw new puzzleControlException("The year of birth that you entered is"
                    + "incorrect, please try again");
        }
        //monthOfDeath
        if (monthOfDeath < 0 || monthOfDeath > 12){
            throw new puzzleControlException("The month of death that you entered is"
                    + "incorrect, please try again");
        }
        //yearOfDeath
        if (yearOfDeath != 2016)
            throw new puzzleControlException("The year of death that you entered is"
                    + "incorrect, please try again");
        
        //calculate total years and months
        int totalYears = yearOfDeath - yearOfBirth;
        double totalMonth = monthOfDeath - monthOfBirth;
        
        //convert months to years
        totalMonth /= 12;
        int ageOfMurderer = totalYears + (int)totalMonth;
        
        return ageOfMurderer;
    }
    
    public double murderAmountOfTime(int startTime, int endTime, int hideBody)throws puzzleControlException{
        //If (starttime > 9 or starttime < 9) then
        if (startTime > 9 || startTime < 9){
                throw new puzzleControlException("The start time that you entered is"
                    + "incorrect, please try again");
        }
        if (endTime > 12 || endTime < 12){
            throw new puzzleControlException("The end time that you entered is"
                    + "incorrect, please try again");
        }
	if (hideBody > 2 || hideBody < 2){
            throw new puzzleControlException("The amunt to hide the body that you entered is"
                    + "incorrect, please try again");
        }
	
         int murderTime = (endTime - startTime) + hideBody;
        
                return murderTime;
    }

}
