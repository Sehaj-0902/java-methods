// Program to create NumberChecker utility class and perform different tasks

import java.util.Scanner;

public class NumberChecker3 {
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

    	// Create reverseDigitsArray() method to reverse the digits array
    	public static int[] reverseDigitsArray(int[] digits) {
        	int[] reversed = new int[digits.length];
        	for (int i = 0; i < digits.length; i++) {
            		reversed[i] = digits[digits.length - 1 - i];
        	}
        	return reversed;
    	}

    	// Create compareArrays() method to compare two arrays and check if they are equal
    	public static boolean compareArrays(int[] arr1, int[] arr2) {
        	if (arr1.length != arr2.length) {
        	    	return false;
        	}
        	for (int i = 0; i < arr1.length; i++) {
            		if (arr1[i] != arr2[i]) {
                		return false;
            		}
        	}
        	return true;
    	}

    	// Create isPalindrome() method to check if a number is a palindrome using the Digits
    	public static boolean isPalindrome(int number, int[] digits) {
        	int[] reversed = reverseDigitsArray(digits);
        	return compareArrays(digits, reversed);
    	}

    	// Create isDuckNumber() method to Check if a number is a duck number using the digits array
    	public static boolean isDuckNumber(int[] digits) {
        	for (int digit : digits) {
            		if (digit == 0) {
                		return true;
            		}
        	}
        	return false;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter a number: ");
        	int number = sc.nextInt();

        	// Call the methods and print the results
        	System.out.println("Number of digits: " + countDigits(number));

        	int[] digits = getDigits(number);

        	int[] reversedDigits = reverseDigitsArray(digits);
        	System.out.print("Reversed digits: ");
        	for (int digit : reversedDigits) {
            		System.out.print(digit);
        	}
        	System.out.println();

        	System.out.println("Is Palindrome: " + isPalindrome(number, digits));
        	System.out.println("Is Duck Number: " + isDuckNumber(digits));
    	}
}
