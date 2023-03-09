
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
