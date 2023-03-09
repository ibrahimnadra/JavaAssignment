//Write a program to define an enum class for the days of the week and print the names of all the days
package com.knoldus.flowControl.task10;

public class Weekdays {
    enum WeekdaysEnum{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        for (WeekdaysEnum day: WeekdaysEnum.values()) {
            System.out.println(day);
        }
    }
}