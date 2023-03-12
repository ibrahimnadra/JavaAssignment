package com.knoldus.task9;

class Shape {

    public void draw() {
        System.out.println("Drawing a shape...");;
    }
}

class Circle extends  Shape {

    public void draw() {
        System.out.println("Drawing a circle...");;
    }
}
class  Rectangle extends Shape {

    public void draw() {
        System.out.println("Drawing a rectangle...");;
    }
}

class Triangle extends Shape {

    public void draw() {
        System.out.println("Drawing a triangle...");;
    }
}
public class ShapeImplementation {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}