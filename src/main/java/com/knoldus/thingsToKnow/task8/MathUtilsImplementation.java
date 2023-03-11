//Imagine you have a class called "MathUtils" with a static variable called "E".
// How would you use this variable to calculate the value of the exponential function?
package com.knoldus.thingsToKnow.task8;

import java.util.Scanner;
class MathUtils {
    public static double E = 2.71828;

    public static double calculateExponential(double x) {
        double result = Math.pow(E, x); // Use Math.exp() method to calculate the exponential value of x
        return result;
    }

}

public class MathUtilsImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x value : ");
        double x = scanner.nextDouble();
        double exponential = MathUtils.calculateExponential(x);
        System.out.println("The exponential of " + x + " is " + exponential);

    }
}
