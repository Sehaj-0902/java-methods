// Program to find maximum number of handshakes among N number of students using a method

import java.util.Scanner;

public class MaximumHandshakes {
	// Create maxHandshakes() method to calculate maximum number of handshakes
	public static int maxHandshakes(int numberOfStudents) {
		// Calculate and return maximum possible handshakes
		return (numberOfStudents * (numberOfStudents - 1)) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take user input for number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();

		// Create a variable handshakes to call the maxHandshakes() method and store the result
		int handshakes = maxHandshakes(numberOfStudents);

		System.out.println("The maximum handshakes possible among " + numberOfStudents + " students = " + handshakes);
	}
}
