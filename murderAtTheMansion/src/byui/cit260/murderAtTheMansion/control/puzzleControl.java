/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

/**
 *
 * @author Britt
 */
public class puzzleControl {
    public double decodePuzzle(int age, double weight, double amount){
        //verify the validity of the input
        //age
        if (age < 24 || age > 36){
            return -1;
        }
        //weight
        if (weight < 199 || weight > 301){
            return -1;
        }
        //amount
        if (amount < 1 || amount > 6){
            return -1;
        }
        //code = age + (weight * amount); 
        double code = age + (weight * amount);
        
        return code;
        
    }
    
    public double calculateAge(int monthOfBirth, int yearOfBirth, int monthOfDeath, int yearOfDeath){
        //Verfify validity of input
        //monthOfBirth
        if (monthOfBirth < 0 || monthOfBirth > 12){
            return -1;   
        }
        //yearOfBirth
        if (yearOfBirth < 1980 || yearOfBirth > 1992){
            return -1;
        }
        //monthOfDeath
        if (monthOfDeath < 0 || monthOfDeath > 12){
            return -1;
        }
        //yearOfDeath
        if (yearOfDeath != 2016)
            return -1;
        
        //calculate total years and months
        int totalYears = yearOfDeath - yearOfBirth;
        double totalMonth = monthOfDeath - monthOfBirth;
        
        //convert months to years
        totalMonth /= 12;
        int ageOfMurderer = totalYears + (int)totalMonth;
        
        return ageOfMurderer;
    }
    
    public double murderAmountOfTime(int startTime, int endTime, int hideBody){
        //If (starttime > 9 or starttime < 9) then
        if (startTime > 9 || startTime < 9){
                return -1;
        }
        if (endTime > 12 || endTime < 12){
            return -1;
        }
	if (hideBody > 2 || hideBody < 2){
            return -1;
        }
	
         int murderTime = (endTime - startTime) + hideBody;
        
                return murderTime;
    }

}
