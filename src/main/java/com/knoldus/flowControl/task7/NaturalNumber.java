
//Write a program to print the first n natural numbers using a while loop.
package com.knoldus.flowControl.task7;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args){
        System.out.println("Enter the number upto which you want to print the natural numbers : ");
        Scanner scannerObject = new Scanner(System.in);
        int firstNaturalNumber = 1, lastNaturalNumber;
        lastNaturalNumber = scannerObject.nextInt();
        System.out.println("Natural numbers till number(" + lastNaturalNumber + ") is ");
        while(firstNaturalNumber <= lastNaturalNumber){
            System.out.println(firstNaturalNumber);
            firstNaturalNumber++;
        }
    }
}