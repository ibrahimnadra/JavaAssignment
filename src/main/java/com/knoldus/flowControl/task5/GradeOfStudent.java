//Write a program to calculate the grade of a student based on their percentage using nested if statements.
package com.knoldus.flowControl.task5;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args){
        System.out.println("Enter the percentage of student : ");
        Scanner scannerObject = new Scanner(System.in);
        float percentageOfStudent = scannerObject.nextFloat();
        String grade = "";
        if(percentageOfStudent <= 100 ){
            if(percentageOfStudent > 90) {
                grade = "A+";
            }
            else if(percentageOfStudent > 80) {
                grade = "A";
            }
            else if(percentageOfStudent > 70) {
                grade = "B";
            }
            else if(percentageOfStudent > 60) {
                grade = "C";
            }
            else if(percentageOfStudent > 50) {
                grade = "D";
            }
        }
        else{
            System.out.println("Very poor scored.");
        }
        System.out.println("Grade of the student is " + grade);
    }
}