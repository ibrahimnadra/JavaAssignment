//Write a program to check if a given year is a leap year or not
package com.knoldus.flowControl.task3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println("Enter the year: ");
        Scanner scannerObject = new Scanner(System.in);
        int givenYear = scannerObject.nextInt();
        if(givenYear % 4 == 0){
            System.out.println("The given year is a leap year.");
        }
        else{
            System.out.println("The given year is not a leap year.");
        }

    }
}