//Create a Java package called "game" that contains a class called "Player".
// Define instance variables for the player's name, score, and level.
// Write methods to set and get the values of the variables.
// Import the package into a Java program and create some Player objects

package com.knoldus.thingsToKnow.task11.game;

public class Player {
    private String name;
    private int score;
    private int level;

    public Player(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}