package com.stackroute.pe3;

/*Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
*/

public class ThrowException {
    ThrowException(String objectMsg) {
        System.out.println(objectMsg);
    }

    public static void main(String[] args) throws Exception { //method to throw different exceptions
        try {
            ThrowException exception = new ThrowException("Hello");
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("Index Out of bound");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Reached Finally block");
        }

    }
}