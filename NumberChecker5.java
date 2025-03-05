// Program to create NumberChecker utility class and perform different tasks

import java.util.Scanner;

public class NumberChecker5 {
	// Create findFactors() method to find factors of a number and return them as an array
    	public static int[] findFactors(int number) {
        	int count = 0;
        	for (int i = 1; i <= number; i++) {
            		if (number % i == 0) {
        	        	count++;
            		}
        	}
        	int[] factors = new int[count];
        	int index = 0;
        	for (int i = 1; i <= number; i++) {
            		if (number % i == 0) {
                		factors[index++] = i;
            		}
        	}
        	return factors;
    	}

    	// Create findGreatestFactor() method to find the greatest factor of a Number using the factors array
    	public static int findGreatestFactor(int[] factors) {
        	if (factors.length == 0) {
           		return 0;
        	}
	        return factors[factors.length - 1];
    	}

    	// Create findSumOfFactors() method to find the sum of the factors using factors array and return the sum
    	public static int findSumOfFactors(int[] factors) {
        	int sum = 0;
        	for (int factor : factors) {
            		sum += factor;
        	}
        	return sum;
    	}

    	// Create findProductOfFactors() method to find the product of the factors using factors array and return the product
    	public static long findProductOfFactors(int[] factors) {
        	long product = 1;
        	for (int factor : factors) {
           		product *= factor;
        	}
        	return product;
    	}

    	// Create findProductOfCubeOfFactors() method to find product of cube of the factors using the factors array. Use Math.pow()
    	public static double findProductOfCubeOfFactors(int[] factors) {
        	double product = 1;
        	for (int factor : factors) {
            		product *= Math.pow(factor, 3);
        	}
   		return product;
    	}

    	// Create isPerfectNumber() method to Check if a number is a perfect number
    	public static boolean isPerfectNumber(int number, int[] factors) {
        	int sum = 0;
        	for (int factor : factors) {
           		if (factor != number) {
                		sum += factor;
            		}
        	}
       	 	return sum == number;
    	}

    	// Create isAbundantNumber() method to find the number is a abundant number
    	public static boolean isAbundantNumber(int number, int[] factors) {
        	int sum = 0;
        	for (int factor : factors) {
            		if (factor != number) {
                		sum += factor;
            		}
        	}
    	    	return sum > number;
    	}

    	// Create isDeficientNumber() method to find the number is a deficient number
    	public static boolean isDeficientNumber(int number, int[] factors) {
        	int sum = 0;
        	for (int factor : factors) {
            		if (factor != number) {
              		  	sum += factor;
            		}
        	}
        	return sum < number;
    	}

    	// Create isStrongNumber() method to Check if a number is a strong number
    	public static boolean isStrongNumber(int number) {
        	int temp = number;
        	int sum = 0;
        	while (temp != 0) {
            		int digit = temp % 10;
            		int fact = 1;
            		for (int i = 1; i <= digit; i++) {
                		fact *= i;
            		}
            		sum += fact;
            		temp /= 10;
        	}
        	return sum == number;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter a number: ");
        	int number = sc.nextInt();

        	int[] factors = findFactors(number);
        	System.out.print("Factors: ");
        	for (int factor : factors) {
            		System.out.print(factor + " ");
        	}
        	System.out.println();

        	System.out.println("Greatest factor: " + findGreatestFactor(factors));
        	System.out.println("Sum of factors: " + findSumOfFactors(factors));
        	System.out.println("Product of factors: " + findProductOfFactors(factors));
        	System.out.println("Product of cube of factors: " + findProductOfCubeOfFactors(factors));
        	System.out.println("Is Perfect number: " + isPerfectNumber(number, factors));
        	System.out.println("Is Abundant number: " + isAbundantNumber(number, factors));
        	System.out.println("Is Deficient number: " + isDeficientNumber(number, factors));
        	System.out.println("Is Strong number: " + isStrongNumber(number));
    	}
}


