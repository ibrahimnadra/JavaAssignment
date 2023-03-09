//Write a program to check if a given number is positive, negative or zero using nested if statements
package com.knoldus.flowControl.task4;

import java.util.Scanner;

public class SignOfNumbers {
    public static void main(String[] args){
        System.out.println("Enter the integer : ");
        Scanner scannerObject = new Scanner(System.in);
        int signedNumber = scannerObject.nextInt();
        if(signedNumber > 0){
            System.out.println("The number is positive.");
        }
        else{
            if(signedNumber == 0){
                System.out.println("The number is zero.");
            }
            else{
                System.out.println("The number is negative.");
            }
        }
    }
}