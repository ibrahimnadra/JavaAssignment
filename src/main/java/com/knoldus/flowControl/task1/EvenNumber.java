//Write a program to check if a given number is even or odd.
package com.knoldus.flowControl.task1;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner scannerObject = new Scanner(System.in);
        int number = scannerObject.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}