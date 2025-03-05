// Program to create NumberChecker utility class and perform different tasks

import java.util.Scanner;

public class NumberChecker2 {
    	// Create countDigits() method to find the count of digits in the number
    	public static int countDigits(int number) {
        	return String.valueOf(Math.abs(number)).length();
    	}

    	// Create getDigits() method to store the digits of the number in a digits array
    	public static int[] getDigits(int number) {
        	String str = String.valueOf(Math.abs(number));
        	int[] digits = new int[str.length()];
        	for (int i = 0; i < str.length(); i++) {
            		digits[i] = Character.getNumericValue(str.charAt(i));
        	}
        	return digits;
    	}

    	// Create sumOfDigits() method to find the sum of the digits of a number using the digits array
    	public static int sumOfDigits(int[] digits) {
        	int sum = 0;
        	for (int digit : digits) {
            		sum += digit;
        	}
        	return sum;
    	}

    	// Create sumOfSquaresOfDigits() method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
    	public static int sumOfSquaresOfDigits(int[] digits) {
        	int sum = 0;
        	for (int digit : digits) {
            		sum += Math.pow(digit, 2);
        	}
        	return sum;
    	}

    	// Create isHarshadNumber() method to Check if a number is a Harshad number using a digits array
    	public static boolean isHarshadNumber(int number, int[] digits) {
        	int sum = sumOfDigits(digits);
        	return sum != 0 && number % sum == 0;
    	}

    	// Create findDigtFrequency() method to find the frequency of each digit in the number
    	public static int[][] findDigitFrequency(int[] digits) {
        	int[][] frequency = new int[10][2]; 
        	for (int i = 0; i < 10; i++) {
            		frequency[i][0] = i; 
            		frequency[i][1] = 0; 
        	}

        	for (int digit : digits) {
            		frequency[digit][1]++; 
        	}
        	return frequency;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter a number: ");
        	int number = sc.nextInt();

        	// Call the methods and print the results
        	System.out.println("Number of digits: " + countDigits(number));

        	int[] digits = getDigits(number);

        	System.out.println("Sum of digits: " + sumOfDigits(digits));

        	System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        	System.out.println("Is Harshad number: " + isHarshadNumber(number, digits));

        	int[][] frequency = findDigitFrequency(digits);
        	System.out.println("Digit frequencies:");
        	for (int[] freq : frequency) {
            		if (freq[1] > 0) {
                		System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
            		}
        	}
    	}
}
