//Write a program to print the name of the day based on the given day number using switch statements.
package com.knoldus.flowControl.task6;

import java.util.Scanner;

public class NameOfDay {
    public static void main(String[] args){
        System.out.println("Enter the number of the day : ");
        Scanner scannerObject = new Scanner(System.in);
        int dayNumber = scannerObject.nextInt();
        String dayName = "";
        switch(dayNumber){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            case 8:
                dayName = "Wrong Number";
        }
        System.out.println("The day name for day number (" + dayNumber + ") is " + dayName);
    }
}