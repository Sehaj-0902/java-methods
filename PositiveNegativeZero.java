// Program to check if a number is positive, negative, or 0 using a method

import java.util.Scanner;

public class PositiveNegativeZero {
	// Create checkNumber() method to check if the number is positive, negative, or 0
	public static int checkNumber(int number) {
		if (number > 0) {
			return 1;
		}
		else if (number < 0) {
			return -1;
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take user input for number
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Call checkNumber() method and print the result
		System.out.println(checkNumber(number));
	}
}
