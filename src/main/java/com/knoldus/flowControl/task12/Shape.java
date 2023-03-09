//Write a program to define an enum class for the geometric shapes
//// and calculate the area of each shape based on its properties.
package com.knoldus.flowControl.task12;

import java.util.HashMap;
import java.util.Scanner;

public class Shape {
    enum ShapesEnum {
        CIRCLE,
        RECTANGLE,
        SQUARE,
        RIGHT_ANGLED_TRIANGLE,
        EXIT
    }

    void findAreaOfCircle(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radiusOfCircle = scannerObject.nextDouble();
        double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
        System.out.println("Area of Circle = " + areaOfCircle);
    }

    void findAreaOfRectangle(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        double lengthOfRectangle = scannerObject.nextDouble();
        System.out.println("Enter the breadth of rectangle : ");
        double breadthOfRectangle = scannerObject.nextDouble();
        double areaOfRectangle = lengthOfRectangle * breadthOfRectangle;
        System.out.println("Area of Rectangle = " + areaOfRectangle);
    }

    void findAreaOfSquare(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        double sideOfSquare= scannerObject.nextDouble();
        double areaOfSquare = Math.pow(sideOfSquare, 2);
        System.out.println("Area of Square = " + areaOfSquare);
    }

    void findAreaOfRightAngledTriangle(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the base of triangle : ");
        double baseOfTriangle = scannerObject.nextDouble();
        System.out.println("Enter the height of triangle : ");
        double heightOfTriangle = scannerObject.nextDouble();
        double areaOfRightAngledTriangle = baseOfTriangle * heightOfTriangle / 2;
        System.out.println("Area of Right-angled triangle  = " + areaOfRightAngledTriangle);
    }
}

class Main{
    public static void main(String[] args) {
        Shape shapeObject = new Shape();
        Shape.ShapesEnum shapeEnum = Shape.ShapesEnum.CIRCLE;
            switch (shapeEnum) {
                case CIRCLE:
                    shapeObject.findAreaOfCircle();
                case SQUARE:
                    shapeObject.findAreaOfSquare();
                case RECTANGLE:
                    shapeObject.findAreaOfRectangle();
                case RIGHT_ANGLED_TRIANGLE:
                    shapeObject.findAreaOfRightAngledTriangle();
            }
        }
    }