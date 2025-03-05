// Program to divide N number of chocolates among M children

import java.util.Scanner;

public class DistributeChocolates {
	// Create distributeChocolates() method to distribute chocolates and find remainder
    	public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        	// Calculate chocolates each child gets using division operator
        	int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        	// Calculate remaining chocolates using modulus operator
        	int remainingChocolates = numberOfChocolates % numberOfChildren;

        	// Return chocolates per child and remaining chocolates
        	return new int[]{chocolatesPerChild, remainingChocolates};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of chocolates: ");
        	int numberOfChocolates = sc.nextInt();

        	System.out.print("Enter the number of children: ");
        	int numberOfChildren = sc.nextInt();

        	// Create an array result to call distributeChocolates() method and store the result
        	int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);

        	// Print chocolates each child gets
        	System.out.println("Chocolates each child gets: " + result[0]);

        	// Print remaining chocolates
        	System.out.println("Remaining chocolates: " + result[1]);
    	}
}
