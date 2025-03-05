// Program to take input for the age of all 10 students and check whether the student can vote based on age

import java.util.Scanner;

public class StudentVoteChecker {
    	// Create canStudentVote() method to check if a student can vote based on age
    	public static boolean canStudentVote(int age) {
        	// Validate the age for a negative number
        	if (age < 0) {
            		return false;
        	}

        	// Check if age is 18 or above
        	if (age >= 18) {
            		return true;
        	}
		else {
            		return false;
        	}
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	int[] studentAges = new int[10];

        	// Loop through the array to take user input for student's age
        	for (int i = 0; i < studentAges.length; i++) {
            		System.out.print("Enter age of student " + (i + 1) + ": ");
            		studentAges[i] = sc.nextInt();
		}

		// Check if the student can vote and print the results
		for (int i = 0; i < studentAges.length; i++) {
            		// Call canStudentVote() method 
            		if (canStudentVote(studentAges[i])) {
                		System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " can vote.");
            		}
			else {
                		System.out.println("Student " + (i + 1) + " with age " + studentAges[i] + " cannot vote.");
            		}
        	}
	}
}
