/* Create a class called Calculator with the following methods:

add: takes two integers as parameters and returns their sum.
subtract: takes two integers as parameters and returns their difference.
multiply: takes two integers as parameters and returns their product.
divide: takes two integers as parameters and returns the result of dividing the first parameter
by the second.
Add try-catch blocks to the methods in the Calculator class to handle the following exceptions:

ArithmeticException: thrown when dividing by zero. Modify the divide method to throw a custom
exception called DivisionByZeroException if a division by zero occurs. This exception should extend
the Exception class and include a constructor that takes a string parameter with an error message.
Print a message to the console indicating that division by zero is not allowed.

NumberFormatException: thrown when converting a string to an integer. Print a message to the
console indicating that the input is not a valid number.

Create a class called Main with a method main that performs the following actions:
Read two integers from the console.
Call each of the methods in the Calculator class, passing the two integers as parameters.
Print the results of the calculations to the console.
Test your code with several different inputs, including invalid inputs (e.g. non-numeric strings) and
inputs that would cause an arithmetic exception (e.g. dividing by zero).
Make sure your code handles all of these cases correctly.
 */

package com.knoldus.errorHandling.task1;
import java.util.Scanner;

class DivisionByZeroException extends Exception {
    DivisionByZeroException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
class Calculator {
    int checkFormat(String stringObject){
        int number;
        try{
            number = Integer.parseInt(stringObject);
            return number;
        }
        catch(NumberFormatException nfx){
            System.out.println("The input is not a valid number.");
            return 0;
        }
    }

    int addition(int firstNumber, int secondNumber){
        return(firstNumber + secondNumber);
    }
    int substraction(int firstNumber, int secondNumber){
        return(firstNumber - secondNumber);
    }
    int multipication(int firstNumber, int secondNumber){
        return(firstNumber * secondNumber);
    }
    int division(int firstNumber, int secondNumber) throws DivisionByZeroException{
        if(secondNumber == 0){
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return (firstNumber / secondNumber);
    }
}

class Main{
    public static void main(String[] args){
        int firstNumber, secondNumber;
        String stringObject = null;
        Calculator calculatorObject = new Calculator();
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter first number : ");
        stringObject = scannerObject.next();
        firstNumber = calculatorObject.checkFormat(stringObject);

        System.out.println("Enter second number : ");
        stringObject = scannerObject.next();
        secondNumber = calculatorObject.checkFormat(stringObject);
        scannerObject.close();

        System.out.println(calculatorObject.addition(firstNumber, secondNumber));
        System.out.println(calculatorObject.substraction(firstNumber, secondNumber));
        System.out.println(calculatorObject.multipication(firstNumber, secondNumber));
        try {
            System.out.println(calculatorObject.division(firstNumber, secondNumber));
        } catch (DivisionByZeroException e) {
            System.out.println(e);
        }
    }
}
