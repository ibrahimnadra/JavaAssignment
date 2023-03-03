//Write a program that declares an integer variable named "x" and initializes it with the
// value of 10. Using a while loop, print the value of x while it is greater than 0.
package com.knoldus5;
public class LoopExample {
    public static void main(String[] args) {
        int x = 10;
        while(x > 0){
            System.out.println("Variable x = " + x);
            x--;
        }
    }
}
