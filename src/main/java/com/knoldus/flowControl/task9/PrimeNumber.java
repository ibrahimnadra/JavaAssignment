//Write a program to check if a given number is prime or not using a do-while loop
package com.knoldus.flowControl.task9;

import java.util.Scanner;

public class PrimeNumber {
    boolean checkPrimeNumber(int number){
        int divisor = (int)Math.sqrt(number);
        boolean isPrime = true;
        do{
            if(number % divisor == 0){
                isPrime = false;
                break;
            }
            else{
                divisor--;
            }
        }while(divisor > 1);
        return(isPrime);
    }
}
class Main{
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scannerObject.nextInt();
        PrimeNumber primeNumberObject = new PrimeNumber();
        if(primeNumberObject.checkPrimeNumber(number)){
            System.out.println("The number is prime.");
        }
        else{
            System.out.println("The number is not prime.");
        }
    }
}