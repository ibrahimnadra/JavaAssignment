//Create a Java class with a private instance variable.
// Define getter and setter methods for the variable.
// Import the class into another Java program and use the getter
// and setter methods to access the variable.
package com.knoldus.thingsToKnow.task12;

public class StudentImplementation {
    public static void main(String[] args) {
        Student firstStudentObject = new Student();
        System.out.println("First Student : ");
        firstStudentObject.printStudentDetails();
    }
}
