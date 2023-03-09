//Write a program to find the largest of three numbers
package com.knoldus.flowControl.task2;

import java.util.Scanner;

public class LargestNumber {
    public static int findLargestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int largestNumber;
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                largestNumber = firstNumber;
            } else {
                largestNumber = thirdNumber;
            }
        } else {
            if (secondNumber > thirdNumber) {
                largestNumber = secondNumber;
            } else {
                largestNumber = thirdNumber;
            }
        }
        return (largestNumber);
    }
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;

        System.out.println("Enter the first number : ");
        firstNumber = scannerObject.nextInt();

        System.out.println("Enter the second number : ");
        secondNumber = scannerObject.nextInt();

        System.out.println("Enter the third number : ");
        thirdNumber = scannerObject.nextInt();
        System.out.println("Largest number = " + findLargestNumber(firstNumber, secondNumber, thirdNumber));

    }
}