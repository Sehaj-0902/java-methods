// Program to create NumberChecker utility class and perform different tasks

import java.util.Scanner;

public class NumberChecker4 {
    	// Create isPrime() method to Check if a number is prime number
    	public static boolean isPrime(int number) {
        	if (number <= 1) {
            		return false;
        	}
        	for (int i = 2; i <= Math.sqrt(number); i++) {
            		if (number % i == 0) {
                		return false;
            		}
        	}
        	return true;
    	}

    	// Create isNeonNumber() method to Check if a number is a neon number
    	public static boolean isNeonNumber(int number) {
        	int square = number * number;
        	int sum = 0;
        	while (square != 0) {
            		sum += square % 10;
            		square /= 10;
        	}
        	return sum == number;
    	}

    	// Create isSpyNumber() method to Check if a number is a spy number
    	public static boolean isSpyNumber(int number) {
        	int sum = 0;
        	int product = 1;
        	int temp = Math.abs(number);
        	while (temp != 0) {
            		int digit = temp % 10;
            		sum += digit;
            		product *= digit;
            		temp /= 10;
        	}
        	return sum == product;
    	}

    	// Create isAutomorphicNumber() method to Check if a number is an automorphic number
    	public static boolean isAutomorphicNumber(int number) {
        	int square = number * number;
        	String numStr = String.valueOf(number);
        	String squareStr = String.valueOf(square);
        	if (squareStr.length() < numStr.length()) {
            		return false;
        	}
        	return squareStr.endsWith(numStr);
    	}

    	// Create isBuzzNumber() method to Check if a number is a buzz number
    	public static boolean isBuzzNumber(int number) {
        	return number % 7 == 0 || number % 10 == 7;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

       		System.out.println("Enter a number: ");
        	int number = sc.nextInt();

        	// Call the methods and print the results
        	System.out.println("Is Prime: " + isPrime(number));
        	System.out.println("Is Neon: " + isNeonNumber(number));
        	System.out.println("Is Spy: " + isSpyNumber(number));
       	 	System.out.println("Is Automorphic: " + isAutomorphicNumber(number));
        	System.out.println("Is Buzz: " + isBuzzNumber(number));
    	}
}
