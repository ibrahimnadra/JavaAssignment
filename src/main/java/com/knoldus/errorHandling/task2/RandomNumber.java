//Create a Java program that generates a random number between 1 and 100.
//The program should ask the user to enter a number.
//If the number entered by the user is less than the random number, the program should display
// the message "Too Low" and ask the user to enter another number.
//If the number entered by the user is greater than the random number, the program should display the
// message "Too High" and ask the user to enter another number.
//If the user enters the correct number, the program should display the message "You guessed it!"
// and terminate.
//Use the try-catch block to handle the exception in case the user enters an invalid input
// (e.g. a string instead of a number). The program should display the error message "Invalid input. Please enter a number." and ask the user to enter another number.
package com.knoldus.errorHandling.task2;

import java.util.Random;
import java.util.Scanner;
class RandomNumber {
    int findRandomNumber() {
        Random randomNumberObject = new Random();
        int randomNumber = randomNumberObject.nextInt(100) + 1;
        return randomNumber;
    }

    void guessingGame() {
        Scanner in = new Scanner(System.in);

        //calling random function and storing it into another variable
        int randomNUmber = findRandomNumber();
        boolean rightAnswer = false;
        int answer = 0;

        while (!rightAnswer) {

            System.out.println("Guess a number between 1 and 100: ");
            answer = in.nextInt();

            // if answer  is greater than actual
            if (randomNUmber > answer) {
                System.out.println("Too low, try again");
            }

            // if answer is less than actual
            else if (randomNUmber < answer) {
                System.out.println("Too high, try again");
            }

            // answer is equal to actual value
            else {
                System.out.println("Yes, you guessed the number.");
                rightAnswer = true;
                System.exit(0);
            }
        }
    }
}

class Main {

    public static void main(String[] args) {
        RandomNumber random_object = new RandomNumber();
        //after catching exception it will again invoke the message;
        boolean tryAgain = true;
        while (tryAgain) {
            try {
                random_object.guessingGame();
            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }
    }
}