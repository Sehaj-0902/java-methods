// Program to take input marks of students in 3 subjects physics, chemistry, and maths and compute the total, average, and the percentage score

import java.util.Scanner;

public class StudentScores {
    	// Create generateScores() method to generate random scores
    	public static int[][] generateScores(int n) {
        	int[][] scores = new int[n][3];
        	for (int i = 0; i < n; i++) {
            		scores[i][0] = (int) (Math.random() * 50) + 50;
            		scores[i][1] = (int) (Math.random() * 50) + 50;
            		scores[i][2] = (int) (Math.random() * 50) + 50;
        	}
        	return scores;
    	}

    	// Create calculateResults() method to calculate total, average, and percentage
    	public static double[][] calculateResults(int[][] scores) {
        	double[][] results = new double[scores.length][3];
        	for (int i = 0; i < scores.length; i++) {
            		int total = scores[i][0] + scores[i][1] + scores[i][2];
            		double avg = total / 3.0;
            		double percent = (total / 300.0) * 100;
            		results[i][0] = total;
            		results[i][1] = Math.round(avg * 100.0) / 100.0;
            		results[i][2] = Math.round(percent * 100.0) / 100.0;
        	}
        	return results;
    	}

    	// Create printResults() method to print results
    	public static void printResults(int[][] scores, double[][] results) {
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "% Percentage");
        	for (int i = 0; i < scores.length; i++) {
           		System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f%n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        	}
    	}

	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of students: ");
                int n = sc.nextInt();

                // Call the methods
                int[][] scores = generateScores(n);
                double[][] results = calculateResults(scores);
                printResults(scores, results);
        }

}
