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
    public int decodePuzzle(int age, double weight, double amount){
        //If (age < 24 or age > 36) then
        //return -1;
        if (age < 24 || age > 36){
            return -1;
        }
        //If (weight < 199 or weight > 301) then
        //return -1;
        if (weight < 199 || weight > 301){
            return -1;
        }
        //If (amount < 1 or amount > 6) then
        //return -1;
        if (amount < 1 || amount > 6){
            return -1;
        }
        //code = age + (weight * amount); 
        
    }
}
