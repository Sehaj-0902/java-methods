// Program to calculate the wind chill temperature

import java.util.Scanner;

public class WindChill {
    	// Create calculateWindChill() method to calculate wind chill temperature
    	public static double calculateWindChill(double temperature, double windSpeed) {
        	// Calculate return wind chill using below formula
        	double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

		// Return wind chill temparature
		return windChill;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the temperature in Fahrenheit: ");
        	double temperature = sc.nextDouble();

        	System.out.print("Enter the wind speed in miles per hour: ");
        	double windSpeed = sc.nextDouble();

        	// Create a variable windChill to call calculateWindChill() method to store the value
        	int windChill = (int) Math.ceil(calculateWindChill(temperature, windSpeed));

        	// Print wind chill temperature
        	System.out.println("Wind chill temperature: " + windChill);
    	}
}
