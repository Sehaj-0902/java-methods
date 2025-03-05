// Program to convert from one unit to another unit

import java.util.Scanner;

public class UnitConvertor3 {
    	// Create convertFahrenheitToCelsius() method to convert Fahrenheit to Celsius and return the value
    	public static double convertFahrenheitToCelsius(double fahrenheit) {
        	double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        	return fahrenheit2celsius;
    	}

    	// Create convertCelsiusToFahrenheit() method to convert Celsius to Fahrenheit and return the value
    	public static double convertCelsiusToFahrenheit(double celsius) {
        	double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
        	return celsius2fahrenheit;
    	}

    	// Create convertPoundsToKilograms() method to convert pounds to kilograms and return the value
    	public static double convertPoundsToKilograms(double pounds) {
        	double pounds2kilograms = 0.453592;
        	return pounds * pounds2kilograms;
    	}

    	// Create convertKilogramsToPounds() method to convert kilograms to pounds and return the value
    	public static double convertKilogramsToPounds(double kilograms) {
        	double kilograms2pounds = 2.20462;
        	return kilograms * kilograms2pounds;
    	}

    	// Create convertGallonsToLiters() method to convert gallons to liters and return the value
    	public static double convertGallonsToLiters(double gallons) {
        	double gallons2liters = 3.78541;
        	return gallons * gallons2liters;
    	}

    	// Create convertLitersToGallons() method to convert liters to gallons and return the value
    	public static double convertLitersToGallons(double liters) {
        	double liters2gallons = 0.264172;
        	return liters * liters2gallons;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter value in Fahrenheit: ");
        	double fahrenheit = sc.nextDouble();
        	// Call convertFahrenheitToCelsius() method and print the result
        	System.out.println("Celsius: " + String.format("%.2f", convertFahrenheitToCelsius(fahrenheit)));

        	System.out.print("Enter value in Celsius: ");
        	double celsius = sc.nextDouble();
        	// Call convertCelsiusToFahrenheit() method and print the result
        	System.out.println("Fahrenheit: " + String.format("%.2f", convertCelsiusToFahrenheit(celsius)));

        	System.out.print("Enter value in pounds: ");
        	double pounds = sc.nextDouble();
        	// Call convertPoundsToKilograms() method and print the result
        	System.out.println("Kilograms: " + String.format("%.2f", convertPoundsToKilograms(pounds)));

        	System.out.print("Enter value in kilograms: ");
        	double kilograms = sc.nextDouble();
        	// Call convertKilogramsToPounds() method and print the result
        	System.out.println("Pounds: " + String.format("%.2f", convertKilogramsToPounds(kilograms)));

        	System.out.print("Enter value in gallons: ");
        	double gallons = sc.nextDouble();
        	// Call convertGallonsToLiters() method and print the result
        	System.out.println("Liters: " + String.format("%.2f", convertGallonsToLiters(gallons)));

        	System.out.print("Enter value in liters: ");
        	double liters = sc.nextDouble();
        	// Call convertLitersToGallons() method and print the result
        	System.out.println("Gallons: " + String.format("%.2f", convertLitersToGallons(liters)));
    	}
}
