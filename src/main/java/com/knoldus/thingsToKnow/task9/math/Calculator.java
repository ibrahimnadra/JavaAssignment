//Create a Java package called "math" that contains a class called "Calculator".
// Define methods for addition, subtraction, multiplication, and division.
// Import the package into a Java program and use the methods to perform some calculations.
package com.knoldus.thingsToKnow.task9.math;

public class Calculator {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
