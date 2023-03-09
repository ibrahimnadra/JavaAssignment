//Write a program that declares two integer variables named "num1" and "num2" and initializes them
// with the values 10 and 5 respectively. Using arithmetic operators, calculate the sum, difference,
// product, and quotient of these two variables and print the results.
package com.knoldus.basicJava.task7;

public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int firstNumber = 10, secondNumber = 5;
        int additionOfTwoNumbers, differenceOfTwoNumbers, productOfTwoNumbers, quotientOfTwoNumbers;
        additionOfTwoNumbers = firstNumber + secondNumber;
        differenceOfTwoNumbers = firstNumber - secondNumber;
        productOfTwoNumbers = firstNumber * secondNumber;
        quotientOfTwoNumbers = firstNumber / secondNumber;
        System.out.println("Addition of " + firstNumber + " and " + secondNumber + " is " + additionOfTwoNumbers);
        System.out.println("Substraction of " + firstNumber + " and " + secondNumber + " is " + differenceOfTwoNumbers);
        System.out.println("Product of " + firstNumber + " and " + secondNumber + " is " + productOfTwoNumbers);
        System.out.println("Quotient of " + firstNumber + " and " + secondNumber + " is " + quotientOfTwoNumbers);
    }
}
