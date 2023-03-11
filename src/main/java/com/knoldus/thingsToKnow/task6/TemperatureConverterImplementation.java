package com.knoldus.thingsToKnow.task6;

//Consider a class called "TemperatureConverter" with a static variable called "CONVERSION_FACTOR".
// How would you use this variable to convert a temperature from Celsius to Fahrenheit?
import java.util.Scanner;

class TemperatureConverter {
    private double temperatureInCelsius;
    private static final double CONVERSION_FACTOR = 1.8;

    public TemperatureConverter(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public double convertToFahrenheit() {
        double temperatureInFahrenheit = temperatureInCelsius * CONVERSION_FACTOR + 32;
        return temperatureInFahrenheit;
    }

}

public class TemperatureConverterImplementation {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the temperature(in Celsius)");
        TemperatureConverter temperatureConverter = new TemperatureConverter(scanner.nextDouble());
        System.out.println("Temperature in Fahrenheit: " + temperatureConverter.convertToFahrenheit());
    }
}
