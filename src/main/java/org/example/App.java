package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static String fun1(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        else if(i % 3 == 0){
            return "Fizz";
        }
        else if(i % 5 == 0){
            return "Buzz";
        }

        return " ";
    }

}
