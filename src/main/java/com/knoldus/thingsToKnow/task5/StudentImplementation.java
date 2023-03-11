//Imagine you have a class called "Student" with a static variable called "numberOfStudents".
// How would you use this variable to display the total number of students enrolled in a course?
package com.knoldus.thingsToKnow.task5;

import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private static int numberOfStudents;

    Student(){
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void inputStudentDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student id : ");
        id = scanner.nextInt();
        System.out.println("Student name : ");
        name = scanner.next();
    }
}
public class StudentImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endLoop = false;
        while(!endLoop){
            Student student = new Student();
            System.out.println("Enter true to exit or false to enter new student details");
            endLoop = scanner.nextBoolean();
            student.inputStudentDetails();
            if(endLoop){
                break;
            }
        }
        System.out.println("Total number of students enrolled: " + Student.getNumberOfStudents());
    }
}