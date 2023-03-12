//You are building a student grading system in Java. The system needs to store the grades for each student. How would you use encapsulation to ensure
// that the grades can only be accessed and modified by authorized code?
package com.knoldus.task8;

import java.util.Scanner;

class GradingSystem{
    private static final String authorizedCode = "MNC1001";
    private String name;
    private double grades;
    Scanner scanner = new Scanner(System.in);
    private void printGrades() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
    }
    private void inputGrades(){
        System.out.print("Enter name: ");
        name = scanner.next();
        System.out.print("Enter grades: ");
        grades = scanner.nextDouble();
    }
    public void authorization(String authorizedCode){
        if(this.authorizedCode.equals(authorizedCode)){
            int choice = 0;
            while(choice != 3){
                System.out.println("1. Input Grades.");
                System.out.println("2. Print grades.");
                System.out.println("3. Exit.");
                choice = scanner.nextInt();
                switch(choice){
                    case 1 :
                        inputGrades();
                        break;
                    case 2 :
                        printGrades();
                        break;
                    case 3 :
                        break;
                    default:
                        System.out.println("Wrong choice.");
                }
            }
        }
        else{
            System.out.println("Invalid authorization.");
        }

    }
}

public class GradingSystemImplementation {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        GradingSystem gradingSystem = new GradingSystem();
        System.out.println("Enter authorization code : ");
        gradingSystem.authorization(scanner.next());
    }
}
