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
    
}
