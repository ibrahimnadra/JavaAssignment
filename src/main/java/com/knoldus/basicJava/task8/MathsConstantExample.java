//Create a program that declares a double variable named "radius" and initializes it with the value
// of 3. Calculate the area and circumference of a circle with this radius using predefined mathematical
// constants and print the results.
package com.knoldus.basicJava.task8;
public class MathsConstantExample {
    public static void main(String[] args) {
        double radiusOfCircle = 3, areaOfCircle, circumferenceOfCircle;
        areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
        circumferenceOfCircle = 2 * Math.PI * radiusOfCircle;
        System.out.println("Area of Circle = " + areaOfCircle);
        System.out.println("Circumference of Circle = " + circumferenceOfCircle);
    }
}
