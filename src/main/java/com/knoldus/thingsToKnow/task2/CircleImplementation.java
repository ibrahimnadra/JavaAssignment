//Imagine you have a static variable called "PI" in a class called "Circle".
// How would you use this variable to calculate the circumference of a circle?
package com.knoldus.thingsToKnow.task2;

import java.util.Scanner;

class Circle{
    private static double PI = 3.14159265359 ;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double findCircumference(){
        return(2 * PI * radius);
    }

}
public class CircleImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circumference of the circle : " + circle.findCircumference());
    }
}
