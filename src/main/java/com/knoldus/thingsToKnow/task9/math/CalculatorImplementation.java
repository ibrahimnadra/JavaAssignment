package com.knoldus.thingsToKnow.task9.math;

import java.util.Scanner;

public class CalculatorImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        int sum = Calculator.add(firstNumber, secondNumber);
        int difference = Calculator.subtract(firstNumber, secondNumber);
        int product = Calculator.multiply(firstNumber, secondNumber);
        double quotient = Calculator.divide(firstNumber, secondNumber);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
