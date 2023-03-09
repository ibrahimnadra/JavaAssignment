package com.knoldus.errorHandling.task2;

import java.util.Random;
import java.util.Scanner;
class RandomNumber {
    public int findRandomNumber() {
        Random randomNumberObject = new Random();
        int randomNumber = randomNumberObject.nextInt(100) + 1;
        return randomNumber;
    }

    public void guessingGame() {
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

public class Main {

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
