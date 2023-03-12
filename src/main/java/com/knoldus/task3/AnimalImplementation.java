package com.knoldus.task3;

class Animal {

    public void speak() {
        System.out.println(" ");;
    }
}

class Cat extends Animal {

    public void speak() {
        System.out.println("Meow meow");;
    }
}
class Dog extends Animal {

    public void speak() {
        System.out.println("Bow wow");;
    }
}
public class AnimalImplementation {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
        Dog dog = new Dog();
        dog.speak();
    }
}
