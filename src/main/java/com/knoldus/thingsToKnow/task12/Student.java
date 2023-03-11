package com.knoldus.thingsToKnow.task12;

import java.util.Scanner;

public class Student {
    private int rollNumber;
    private String name;

    Student() {
        inputStudentDetails();
    }

    Student(int rollNumber, String name){
        setRollNumber(rollNumber);
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return(name);
    }

    public int getRollNumber(){
        return(rollNumber);
    }

    //method to print the details
    public void printStudentDetails(){
        System.out.println("Student's roll no : " + getRollNumber());
        System.out.println("Student's name : " + getName());
    }

    //method to input the details by user
    public void inputStudentDetails(){
        Scanner scannerObject =  new Scanner(System.in);
        System.out.println("Enter the student's roll number : ");
        setRollNumber(scannerObject.nextInt());
        System.out.println("Enter the student's name : ");
        setName(scannerObject.next());
    }
}