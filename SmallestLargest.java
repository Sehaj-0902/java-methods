// Program to find the smallest and the largest of the 3 numbers

import java.util.Scanner;

public class SmallestLargest {
	// Create finSmallestAndLargest() method to find smallest and largest number
    	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        	int smallest = number1;
        	int largest = number1;

		// Check smallest number
        	if (number2 < smallest) {
            		smallest = number2;
        	}
        	if (number3 < smallest) {
            		smallest = number3;
        	}

		// Check largest number
        	if (number2 > largest) {
            		largest = number2;
        	}
        	if (number3 > largest) {
            		largest = number3;
        	}

		// Return smallest and largest number
        	return new int[]{smallest, largest};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the first number: ");
        	int number1 = sc.nextInt();

        	System.out.print("Enter the second number: ");
        	int number2 = sc.nextInt();

        	System.out.print("Enter the third number: ");
        	int number3 = sc.nextInt();

		// Create an array result to call findSmallestAndLargest() method and store the result
        	int[] result = findSmallestAndLargest(number1, number2, number3);

		// Print smallest number
        	System.out.println("Smallest number: " + result[0]);

		// Print largest number
        	System.out.println("Largest number: " + result[1]);
    	}
}

