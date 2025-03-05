// Program to take 2 numbers and print their quotient and remainder

import java.util.Scanner;

public class QuotientRemainder {
    	// Create findRemainderAndQuotient() method to find remainder and quotient
    	public static int[] findRemainderAndQuotient(int number, int divisor) {
        	// Calculate quotient using division operator 
        	int quotient = number / divisor;

        	// Calculate remainder using modulus operator 
        	int remainder = number % divisor;

        	// Return remainder and quotient
        	return new int[]{quotient, remainder};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number: ");
        	int number = sc.nextInt();

        	System.out.print("Enter the divisor: ");
        	int divisor = sc.nextInt();

        	// Create an array result to call findRemainderAndQuotient() method and store the result
        	int[] result = findRemainderAndQuotient(number, divisor);

        	// Print quotient
        	System.out.println("Quotient: " + result[0]);

        	// Print remainder
        	System.out.println("Remainder: " + result[1]);
    	}
}
