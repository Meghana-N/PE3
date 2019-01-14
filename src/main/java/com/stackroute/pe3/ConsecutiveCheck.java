package com.stackroute.pe3;

/*Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
*/

import java.util.Arrays;

public class ConsecutiveCheck {
    public Boolean consecutiveSeriesMethod(String numbers) { //method to check if there exists consecutive numbers
        String[] number = numbers.split(",");
        int numberArray[] = new int[number.length];
        int i=0;
        Boolean output = true;
        for(String n: number){
            numberArray[i++] = Integer.parseInt(n);
        }
        Arrays.sort(numberArray);
        for (int j=0;j<number.length-1;j++) {
            if(!((numberArray[j+1]-numberArray[j]) == 1)) { //condition to check for consecutive numbers
                output = false;
            }
        }
        return output;
    }
}