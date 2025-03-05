// Program to find the sum of n natural numbers using loop

import java.util.Scanner;

public class NaturalNumberSum {
	// Create calculateSum() method to calculate sum of n natural numbers
	public static int calculateSum(int number) {
		// Calculate sum using a loop
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        	System.out.println("Enter a number: ");
		int number = sc.nextInt();

		// Call the calculateSum() method and print the sum	
		System.out.println("The sum of " + number + " natural numbers is " + calculateSum(number));
	}
}

