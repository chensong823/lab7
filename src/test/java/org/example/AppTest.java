package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testCheckFizz(){
        String result = App.fun1(3);
        assertEquals("Fizz", result);
    }

    public void testCheckBuzz(){
        String result = App.fun1(5);
        assertEquals("Buzz", result);
    }

    public void testCheckFizzBuzz(){
        String result = App.fun1(15);
        assertEquals("FizzBuzz", result);
    }

    public void testNumber(){
        String result = App.fun1(2);
        assertEquals(Integer.toString(2), result);
    }

}
