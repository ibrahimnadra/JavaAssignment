//Write a program that declares a String variable named "name" and assigns it a value of "John".
//Concatenate this variable with another String variable named "message" and print the result.
package com.knoldus.basicJavaAssignment.task3;

public class StringOperatorExample {
    public static void main(String[] args) {
        String name = "John", message = " I hope you are fine.";
        String concatenatedString = name + message;
        System.out.println(concatenatedString);
    }
}
