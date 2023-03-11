package com.knoldus.thingsToKnow.task11;
import com.knoldus.thingsToKnow.task11.game.*;

import java.util.Scanner;

public class PlayerImplementation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player("Nadra", 2000, 10);
        Player player2 = new Player("Ishaq", 1500, 13);

        System.out.println("Player 1: " + player1.getName() + " Score: " + player1.getScore() + " Level: " + player1.getLevel());
        System.out.println("Player 2: " + player2.getName() + " Score: " + player2.getScore() + " Level: " + player2.getLevel());

        player1.setName("Zain");
        player2.setScore(1400);
        player2.setLevel(15);

        System.out.println("Player 1: " + player1.getName() + " Score: " + player1.getScore() + " Level: " + player1.getLevel());
        System.out.println("Player 2: " + player2.getName() + " Score: " + player2.getScore() + " Level: " + player2.getLevel());
    }
}
