//Suppose you have a class called "Car" with a static variable called "numOfCars".
// How would you use this variable to keep track of the total number of cars created by the class?
package com.knoldus.thingsToKnow.task1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

class Car{
    private static int numOfCars;
    Car(){
        numOfCars++;
    }
    public static int getNumOfCars(){
        return(numOfCars);
    }
}
public class CarImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endLoop = false;
        while(!endLoop){
            System.out.println("Creating a car object..");
            Car car = new Car();
            System.out.println("Enter true to exit or false to continue");
            endLoop = scanner.nextBoolean();
            if(endLoop){
                break;
            }
        }
        System.out.println("Number of cars = " + Car.getNumOfCars());
    }

}
