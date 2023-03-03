//Create a program that declares a double variable named "distance" and initializes it with the value of 5.
// Convert this variable to an integer using casting, and print the result.
package com.knoldus6;

public class CastingExample {
    public static void main(String[] args) {
        double distance = 5;
        int integerDistance = (int)distance;
        System.out.println("Value of distance after type casting from double to integer type : " + integerDistance);
    }
}
