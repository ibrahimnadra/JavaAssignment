
//Create a Java package called "shapes" that contains classes for different geometric shapes,
// such as "Circle", "Rectangle", and "Triangle". Define instance variables for the dimensions
// of each shape and methods to calculate the area and perimeter.
// Import the package into a Java program and use the classes to perform some calculations.

package com.knoldus.thingsToKnow.task10;

import com.knoldus.thingsToKnow.task10.shapes.*;

import java.util.Scanner;

public class ShapeImplementation {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radiusOfCircle = scannerObject.nextDouble();
        Circle circle = new Circle(radiusOfCircle);
        System.out.println("Area of Circle = " + circle.getArea());
        System.out.println("Perimeter of Circle = " + circle.getPerimeter());

        System.out.println("Enter the length of rectangle : ");
        double lengthOfRectangle = scannerObject.nextDouble();
        System.out.println("Enter the breadth of rectangle : ");
        double breadthOfRectangle = scannerObject.nextDouble();
        Rectangle rectangle = new Rectangle(lengthOfRectangle, breadthOfRectangle);
        System.out.println("Area of Rectangle = " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle = " + rectangle.getPerimeter());

        System.out.println("Enter the base of triangle : ");
        double baseOfTriangle = scannerObject.nextDouble();
        System.out.println("Enter the height of triangle : ");
        double heightOfTriangle = scannerObject.nextDouble();
        Triangle rightAngledTriangle = new Triangle(baseOfTriangle, heightOfTriangle);
        System.out.println("Area of Right-angled triangle  = " + rightAngledTriangle.getArea());
        System.out.println("Perimeter of Right-angled triangle  = " + rightAngledTriangle.getPerimeter());
    }
}
