package com.knoldus.task4;

class Shape {

    public double getArea() {
        return(0);
    }
}

class Circle extends  Shape {

    public double getArea(double radius) {
        return(Math.PI * radius * radius);
    }
}
class  Rectangle extends Shape {

    public double getArea(double length, double breadth) {
        return(length * breadth);
    }
}
public class ShapeImplementation {
    public static void main(String[] args) {
        Circle Circle = new  Circle();
        Circle.getArea();
        Rectangle  Rectangle = new   Rectangle();
        Rectangle.getArea();
    }
}
