// Program to find simple interest using a method

import java.util.Scanner;

public class SimpleInterest {
	// Create simpleInterest() method to calculate simple interest
	public static double simpleInterest(double principal, double rate, double time) {
		// Calculate and return simple interest
		return (principal * rate * time) / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take user input for principal, rate of interest, and time
		System.out.print("Enter principal amount: ");
		double principal = sc.nextInt();

		System.out.print("Enter rate of interest: ");
		double rate = sc.nextInt();

		System.out.print("Enter time (in years): ");
		double time = sc.nextInt();

		// Create a variable SI to call the simpleInterest() method and store the result
		double SI = simpleInterest(principal, rate, time);

		System.out.println("The Simple Interest is " + SI + " for Principal = " + principal + ", Rate of Interest = " + rate + " and Time = " + time);
	}
}
