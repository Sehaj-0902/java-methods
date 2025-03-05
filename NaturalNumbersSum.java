// Program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2

import java.util.Scanner;

public class NaturalNumbersSum {
    	// Create recursiveSum() method to find the sum of n natural numbers
    	public static int recursiveSum(int number) {
        	if (number == 1) {
            		return 1;
	        }
		else {
            		return number + recursiveSum(number - 1);
        	}
    	}

    	// Create formulaSum() method to find the sum of n natural numbers using the formula
    	public static int formulaSum(int number) {
        	return number * (number + 1) / 2;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a natural number: ");
        	int number = sc.nextInt();

        	if (number <= 0) {
            		System.out.println("Invalid input. Please enter a natural number.");
            		return;
        	}

		// Call recursiveSum() method
        	int recursiveResult = recursiveSum(number);

		// Call formulaSum() method
        	int formulaResult = formulaSum(number);

		// Print recursive sum
        	System.out.println("Recursive sum: " + recursiveResult);

		// Print formula sum
        	System.out.println("Formula sum: " + formulaResult);

		// Compare recursive sum and formula sum
        	if (recursiveResult == formulaResult) {
			System.out.println("Both results are equal, and are correct.");
        	}
		else {
			System.out.println("Results do not match.");
        	}
    	}
}
