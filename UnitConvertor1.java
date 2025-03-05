// Program to convert from one unit to another unit

import java.util.Scanner;

public class UnitConvertor1 {
	// Create convertKmToMiles() method to convert kilometers to miles and return the value
    	public static double convertKmToMiles(double km) {
        	double km2miles = 0.621371;
        	return km * km2miles;
    	}

    	// Create convertMilesToKm() method to convert miles to kilometers and return the value
    	public static double convertMilesToKm(double miles) {
        	double miles2km = 1.60934;
        	return miles * miles2km;
    	}

    	// Create convertMetersToFeet() method to convert meters to feet and return the value
    	public static double convertMetersToFeet(double meters) {
        	double meters2feet = 3.28084;
        	return meters * meters2feet;
    	}

    	// Create convertFeetToMeters() method to convert feet to meters and return the value
    	public static double convertFeetToMeters(double feet) {
        	double feet2meters = 0.3048;
        	return feet * feet2meters;
    	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value in kilometers: ");
	        double km = sc.nextDouble();
		// Call convertKmToMiles() method and print the result
        	System.out.println("Miles: " + String.format("%.2f", convertKmToMiles(km)));

        	System.out.print("Enter value in miles: ");
        	double miles = sc.nextDouble();
		// Call convertMilesToKm() method and print the result
        	System.out.println("Kilometers: " + String.format("%.2f", convertMilesToKm(miles)));

        	System.out.print("Enter value in meters: ");
        	double meters = sc.nextDouble();
		// Call convertMetersToFeet() method and print the result
        	System.out.println("Feet: " + String.format("%.2f", convertMetersToFeet(meters)));

        	System.out.print("Enter value in feet: ");
        	double feet = sc.nextDouble();
		// Call convertFeetToMeters() method and print the result
        	System.out.println("Meters: " + String.format("%.2f", convertFeetToMeters(feet)));
	}
}

