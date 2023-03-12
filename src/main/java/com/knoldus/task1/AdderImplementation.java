package com.knoldus.task1;

import java.util.Scanner;

class Adder{
    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int add(int firstNumber, int secondNumber,int thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }
}
public class AdderImplementation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number : ");
        int thirdNumber = scanner.nextInt();
        Adder adder = new Adder();
        System.out.println("Sum of first two numbers : " + adder.add(firstNumber, secondNumber));
        System.out.println("Sum of all three numbers : " + adder.add(firstNumber, secondNumber, thirdNumber));
    }
}
