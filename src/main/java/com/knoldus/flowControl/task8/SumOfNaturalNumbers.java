
//Write a program to find the sum of first n natural numbers using a while loop.
package com.knoldus.flowControl.task8;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    int findSum(int lastNaturalNumber){
        int firstNaturalNumber = 1, sumOfNaturalNumbers = 0;
        while(firstNaturalNumber <= lastNaturalNumber){
            sumOfNaturalNumbers += firstNaturalNumber;
            firstNaturalNumber++;
        }
        return sumOfNaturalNumbers;
    }
}

class Main{
    public static void main(String[] args){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to add the natural numbers : ");
        int lastNaturalNumber = scannerObject.nextInt();
        SumOfNaturalNumbers sumObject = new SumOfNaturalNumbers();
        System.out.println("The sum of natural numbers = " + sumObject.findSum(lastNaturalNumber));
    }
}