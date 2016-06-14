/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sara
 */
public class puzzleControlTest {
    
    public puzzleControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of decodePuzzle method, of class puzzleControl.
     */
    @Test
    public void testDecodePuzzle() {
        System.out.println("decodePuzzle");
        
        System.out.println("\t Test Case #1");

        // inputs 
        int age = 30;
        double weight = 250;
        double amount = 3;
        
        puzzleControl instance = new puzzleControl();
        
        double expResult = 780;
        
        double result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #2");

        // inputs 
        age = 37;
        weight = 250;
        amount = 3;
                
        expResult = -1;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #3");

        // inputs 
        age = 30;
        weight = 302;
        amount = 3;
                
        expResult = -1;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #4");

        // inputs 
        age = 30;
        weight = 250;
        amount = 7;
                
        expResult = -1;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #5");

        // inputs 
        age = 24;
        weight = 250;
        amount = 3;
                
        expResult = 774;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #6");

        // inputs 
        age = 36;
        weight = 250;
        amount = 3;
                
        expResult = 786;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #7");

        // inputs 
        age = 30;
        weight = 199;
        amount = 3;
                
        expResult = 627;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #8");

        // inputs 
        age = 30;
        weight = 301;
        amount = 3;
                
        expResult = 933;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #9");

        // inputs 
        age = 30;
        weight = 250;
        amount = 1;
                
        expResult = 280;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #10");

        // inputs 
        age = 30;
        weight = 250;
        amount = 6;
                
        expResult = 1530;
        
        result = instance.decodePuzzle(age, weight, amount);
        
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of murderAmountOfTime method, of class puzzleControl.
     */
    @Test
    public void testMurderAmountOfTime() {
        System.out.println("murderAmountOfTime");
        System.out.println("\t Test Case #1");

        int startTime = 9;
        int endTime = 12;
        int hideBody = 2;
        
        puzzleControl instance = new puzzleControl();
        
        double expResult = 5;
        
        double result = instance.murderAmountOfTime(startTime, endTime, hideBody);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #2");

        startTime = 7;
        endTime = 12;
        hideBody = 2;
               
        expResult = -1;
        
        result = instance.murderAmountOfTime(startTime, endTime, hideBody);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #3");

        startTime = 9;
        endTime = 11;
        hideBody = 2;
               
        expResult = -1;
        
        result = instance.murderAmountOfTime(startTime, endTime, hideBody);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t Test Case #4");

        startTime = 9;
        endTime = 12;
        hideBody = 3;
               
        expResult = -1;
        
        result = instance.murderAmountOfTime(startTime, endTime, hideBody);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of CalculateAge method, of class puzzleControl.
     */
    @Test
    public void testCalculateAge() {
        System.out.println("CalculateAge");
        
        //Test Case #1
        System.out.println("\tTest Case #1");
        int monthOfBirth = 1;
        int yearOfBirth = 1980;
        int monthOfDeath = 1;
        int yearOfDeath = 2016;
        puzzleControl instance = new puzzleControl();
        double expResult = 36;
        double result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #2
        System.out.println("\tTest Case #2");
        monthOfBirth = -1;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #3
        System.out.println("\tTest Case #3");
        monthOfBirth = 13;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #4
        System.out.println("\tTest Case #4");
        monthOfBirth = 1;
        yearOfBirth = 1979;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #5
        System.out.println("\tTest Case #5");
        monthOfBirth = 1;
        yearOfBirth = 1993;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #6
        System.out.println("\tTest Case #6");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = -1;
        yearOfDeath = 2016;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #7
        System.out.println("\tTest Case #7");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 13;
        yearOfDeath = 2016;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #8
        System.out.println("\tTest Case #8");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2015;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #9
        System.out.println("\tTest Case #9");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2017;
        expResult = -1;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #10
        System.out.println("\tTest Case #10");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = 36;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #11
        System.out.println("\tTest Case #11");
        monthOfBirth = 12;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = 36;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #12
        System.out.println("\tTest Case #12");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = 36;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #13
        System.out.println("\tTest Case #13");
        monthOfBirth = 1;
        yearOfBirth = 1992;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = 24;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #14
        System.out.println("\tTest Case #14");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 1;
        yearOfDeath = 2016;
        expResult = 36;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
        
        //Test Case #15
        System.out.println("\tTest Case #15");
        monthOfBirth = 1;
        yearOfBirth = 1980;
        monthOfDeath = 12;
        yearOfDeath = 2016;
        expResult = 36;
        result = instance.calculateAge(monthOfBirth, yearOfBirth, monthOfDeath, yearOfDeath);
        assertEquals(expResult, result, 0.0);
    }
    
}
