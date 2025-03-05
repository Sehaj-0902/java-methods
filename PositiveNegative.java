// Program to check if a number is positive or negative, and further check if number is even or odd

import java.util.Scanner;

public class PositiveNegative {
	// Create isPositive() method to check if a number is positive or negative
    	public static boolean isPositive(int number) {
        	return number > 0;
    	}

    	// Create isEven() method to check if a number is even or odd
    	public static boolean isEven(int number) {
        	return number % 2 == 0;
    	}

    	// Create compare() method to compare the two numbers
    	public static int compare(int number1, int number2) {
        	if (number1 > number2) {
            		return 1;
        	}
		else if (number1 == number2) {
            		return 0;
        	}
		else {
            		return -1;
        	}
    	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[5];

		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] += sc.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			// Call isPositive() method to check if the number is positive or negative
			if (isPositive(numbers[i])) {
				// Call isEven() method to check if the positive number is even or odd
                		if (isEven(numbers[i])) {
                    			System.out.println(numbers[i] + " is positive and even");
                		}
				else {
                    			System.out.println(numbers[i] + " is positive and odd");
	                	}
			}
			// If the number is 0, print zero
			else if (numbers[i] == 0) { 
                		System.out.println("The number is zero");
			}
			else {
				System.out.println(numbers[i] + " is negative");
			}
		}

		// Comparing first and last number of array to check if they are greater, less or equal
		// Call compare() method to compare the first and last numbers
		int comparison = compare(numbers[0], numbers[numbers.length-1]);

		if (comparison == 1) {
			System.out.println("The first number is Greater than the last number");
		}
		else if (comparison == -1) {
			System.out.println("The first number is Less than the last number");
		}
		else {
			System.out.println("The first number and the last number are Equal");
		}

	}
}
