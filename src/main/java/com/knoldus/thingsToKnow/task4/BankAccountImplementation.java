//Suppose you have a class called "BankAccount" with a static variable called "interestRate".
// How would you use this variable to calculate the interest earned on a bank account balance?
package com.knoldus.thingsToKnow.task4;

import java.util.Scanner;

class BankAccount{
    private static double interestRate = 5;
    public static double calculateInterest(double principal, double time){
        return(principal * interestRate * time / 100);
    }
}
public class BankAccountImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount(in rupees) : ");
        double principal = scanner.nextDouble();
        System.out.println("Enter the time(in years) : ");
        double time = scanner.nextDouble();
        System.out.println("Earned interest on the principal value (Rs." + principal + ") = " +
                BankAccount.calculateInterest(principal, time));
    }
}
