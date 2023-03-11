package com.knoldus.thingsToKnow.task10;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return(base + height + hypotenuse);
    }
}