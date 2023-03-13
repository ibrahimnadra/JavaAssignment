package com.knoldus.task2;

public class IncrementingCounter {
    public static volatile int counter = 0;
    public static void main(String[] args) {

        IncrementingCounter incrementingCounter = new IncrementingCounter();

        Thread mainThread = new Thread(() -> {
            while (counter < 10) {
                System.out.println("Incremented the counter to " + ++counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread printingThread = new Thread(() -> {
            while (counter < 10) {
                if (counter < 10) {
                    System.out.println("Current value of the counter : " + counter);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        mainThread.start();
        printingThread.start();
    }
}