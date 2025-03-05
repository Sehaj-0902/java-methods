// Program to convert from one unit to another

import java.util.Scanner;

public class UnitConvertor2 {
    	// Create convertYardsToFeet() method to convert yards to feet and return the value
    	public static double convertYardsToFeet(double yards) {
        	double yards2feet = 3;
        	return yards * yards2feet;
    	}

    	// Create convertFeetToYards() method to convert feet to yards and return the value
    	public static double convertFeetToYards(double feet) {
        	double feet2yards = 0.333333;
        	return feet * feet2yards;
    	}

    	// Create convertMetersToInches() method to convert meters to inches and return the value
    	public static double convertMetersToInches(double meters) {
        	double meters2inches = 39.3701;
        	return meters * meters2inches;
    	}

    	// Create convertInchesToMeters() method to convert inches to meters and return the value
    	public static double convertInchesToMeters(double inches) {
        	double inches2meters = 0.0254;
        	return inches * inches2meters;
    	}

    	// Create convertInchesToCentimeters() method to convert inches to centimeters and return the value
    	public static double convertInchesToCentimeters(double inches) {
        	double inches2cm = 2.54;
        	return inches * inches2cm;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter value in yards: ");
        	double yards = sc.nextDouble();
		// Call convertYardsToFeet() method and print the result
        	System.out.println("Feet: " + String.format("%.2f", convertYardsToFeet(yards)));

        	System.out.print("Enter value in feet: ");
        	double feet = sc.nextDouble();
		// Call convertFeetToYards() method and print the result
        	System.out.println("Yards: " + String.format("%.2f", convertFeetToYards(feet)));

        	System.out.print("Enter value in meters: ");
        	double meters = sc.nextDouble();
		// Call convertMetersToInches() method and print the result
        	System.out.println("Inches: " + String.format("%.2f", convertMetersToInches(meters)));

        	System.out.print("Enter value in inches: ");
        	double inches = sc.nextDouble();
		// Call convertInchesToMeters() method and print the result
        	System.out.println("Meters: " + String.format("%.2f", convertInchesToMeters(inches)));

        	System.out.print("Enter value in inches: ");
        	inches = sc.nextDouble();
		// Call convertInchesToCentimeters() method and print the result
        	System.out.println("Centimeters: " + String.format("%.2f", convertInchesToCentimeters(inches)));
    	}
}
