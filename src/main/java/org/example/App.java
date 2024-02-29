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
        else {
            return Integer.toString(i);
        }

    }

    public static void main(String[] args) {
        String[] str = new String[100];
        for(int i = 1; i <= 100; i++){
            str[i-1] = fun1(i);
        }

        for (String s : str) {
            System.out.print(s + ",");
        }
    }

}
