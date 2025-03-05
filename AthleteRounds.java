// Program to calculate number of rounds to complete a 5km run using a method

import java.util.Scanner;

public class AthleteRounds {
	// Create calculateRounds() method to calculate number of rounds
	public static double calculateRounds(double side1, double side2, double side3) {
		// Create a variable perimeter to calculate perimeter of triangle
		double perimeter = side1 + side2 + side3;

		// Create a varible distance to store distance in meters (5 km = 5000 m)
		double distance = 5000;

		// Create a varible rounds to calculate number of rounds 
		// Formula: rounds = distance / perimeter 
		// Using Math.ceil() method to round up the value to the nearest integer 
		int rounds = (int) Math.ceil(distance / perimeter);

		// return number of rounds
		return rounds;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take user input for sides of triangle (in meters)
		System.out.print("Enter side 1 of triangle (in meters): ");
		double side1 = sc.nextDouble();

		System.out.print("Enter side 2 of triangle (in meters): ");
		double side2 = sc.nextDouble();

		System.out.print("Enter side 3 of triangle (in meters): ");
		double side3 = sc.nextInt();

		// Create a variable numberOfRounds to call the calculateRounds() method and store the result
		int numberOfRounds = (int) calculateRounds(side1, side2, side3);

		System.out.println("The number of rounds to complete a 5km run = " + numberOfRounds);
	}
}
