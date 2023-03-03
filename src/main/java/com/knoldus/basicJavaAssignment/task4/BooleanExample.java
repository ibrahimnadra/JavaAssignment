// Create a program that declares a boolean variable named "isRaining" and assigns it a value of true.
// Using an if statement, print "Take an umbrella" if isRaining is true,
// and "Enjoy the sunshine" otherwise.
package com.knoldus.basicJavaAssignment.task4;

public class BooleanExample {
    public static void main(String[] args) {
        boolean isRaining = true;
        if(isRaining){
            System.out.println("Take an umbrella");
        }
        else{
            System.out.println("Enjoy the sunshine");
        }
    }
}
