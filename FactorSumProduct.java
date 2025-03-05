// Program to find the factors of a number, sum of the factors, sum of square of factors and product of the factors

import java.util.Scanner;

public class FactorSumProduct {
	// Create findFactors() method to find factors and store them in an array
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
                		factors[index] = i;
				index++;
            		}
        	}
        	return factors;
    	}

    	// Create sumOfFactors() method to find the sum of factors
    	public static int sumOfFactors(int[] factors) {
        	int sum = 0;
        	for (int i = 0; i < factors.length; i++) {
            		sum += factors[i];
        	}
        	return sum;
    	}

    	// Create productOfFactors() method to find the product of factors
    	public static long productOfFactors(int[] factors) {
        	long product = 1;
        	for (int i = 0; i < factors.length; i++) {
            		product *= factors[i];
        	}
        	return product;
    	}

    	// Create sumOfSquaresOfFactors() method to find the sum of squares of factors
    	public static long sumOfSquaresOfFactors(int[] factors) {
        	long sumOfSquares = 0;
        	for (int i = 0; i < factors.length; i++) {
            		sumOfSquares += Math.pow(factors[i], 2);
        	}
        	return sumOfSquares;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	int[] factors = findFactors(number);

        	System.out.print("Factors: ");
        	for (int i = 0; i < factors.length; i++) {
            		System.out.print(factors[i] + " ");
        	}
        	System.out.println();

        	int sum = sumOfFactors(factors);
        	System.out.println("Sum of factors: " + sum);

        	long product = productOfFactors(factors);
        	System.out.println("Product of factors: " + product);

        	long sumOfSquares = sumOfSquaresOfFactors(factors);
        	System.out.println("Sum of squares of factors: " + sumOfSquares);
    	}
}
