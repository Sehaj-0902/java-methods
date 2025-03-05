// Program to create NumberChecker utility class and perform different tasks

import java.util.Scanner;

public class NumberChecker1 {
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

    	// Create isDuckNumber() method to check if a number is a duck number
    	public static boolean isDuckNumber(int number) {
        	String str = String.valueOf(Math.abs(number));
        	return str.contains("0");
    	}

    	// Create isArmstrong() method to check if the number is an Armstrong number
    	public static boolean isArmstrong(int number) {
        	int[] digits = getDigits(number);
        	int power = digits.length;
        	int sum = 0;
        	for (int i = 0; i < digits.length; i++) {
            		sum += Math.pow(digits[i], power);
        	}
        	return sum == number;
    	}

    	// Create findLargestAndSecondLargest() method to find the largest and second largest elements in the digits array
    	public static int[] findLargestAndSecondLargest(int[] digits) {
        	int largest = Integer.MIN_VALUE;
        	int secondLargest = Integer.MIN_VALUE;
        	for (int i = 0; i < digits.length; i++) {
            		if (digits[i] > largest) {
                		secondLargest = largest;
                		largest = digits[i];
            		}
			else if (digits[i] > secondLargest && digits[i] != largest) {
                		secondLargest = digits[i];
            		}
        	}
        	return new int[]{largest, secondLargest};
    	}

    	// Create findSmallestAndSecondSmallest() method to find the smallest and second smallest elements in the digits array
    	public static int[] findSmallestAndSecondSmallest(int[] digits) {
        	int smallest = Integer.MAX_VALUE;
        	int secondSmallest = Integer.MAX_VALUE;
        	for (int i = 0; i < digits.length; i++) {
            		if (digits[i] < smallest) {
                		secondSmallest = smallest;
                		smallest = digits[i];
            		}
			else if (digits[i] < secondSmallest && digits[i] != smallest) {
                		secondSmallest = digits[i];
            		}
        	}
        	return new int[]{smallest, secondSmallest};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
        	int number = sc.nextInt();

		// Call the methods and print the results
        	System.out.println("Number of digits: " + countDigits(number));

        	int[] digits = getDigits(number);

        	System.out.println("Is Duck Number: " + isDuckNumber(number));
        	System.out.println("Is Armstrong Number: " + isArmstrong(number));

        	int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);

        	System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        	System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        	int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);

        	System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        	System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    	}
}
