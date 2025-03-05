// Program to find the BMI and display the height, weight, BMI and status of each individual

import java.util.Scanner;

public class CalculateBMI {
    	// Create calculateBMI() method to calculate BMI 
    	public static void calculateBMI(double[][] personData) {
        	for (int i = 0; i < personData.length; i++) {
            		double weight = personData[i][0];
            		double heightCm = personData[i][1];
            		double heightM = heightCm / 100.0; // Convert cm to meters
            		double bmi = weight / (heightM * heightM);
            		personData[i][2] = bmi;
        	}
    	}

    	// Create determineBMIStatus() method to determine BMI status
    	public static String[] determineBMIStatus(double[][] personData) {
        	String[] bmiStatus = new String[personData.length];
        	for (int i = 0; i < personData.length; i++) {
            		double bmi = personData[i][2];
            		if (bmi < 18.5) {
                		bmiStatus[i] = "Underweight";
            		}
			else if (bmi < 25) {
               			bmiStatus[i] = "Normal weight";
            		}
			else if (bmi < 30) {
                		bmiStatus[i] = "Overweight";
            		}
			else {
                		bmiStatus[i] = "Obese";
            		}
        	}
        	return bmiStatus;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	double[][] personData = new double[10][3];

        	// Take user input for weight and height
        	for (int i = 0; i < personData.length; i++) {
            		System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            		personData[i][0] = sc.nextDouble();
            		System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            		personData[i][1] = sc.nextDouble();
        	}

        	// Call calculateBMI() method to calculate BMI
        	calculateBMI(personData);

        	// Call determineBMIStatus() method to determine BMI status
        	String[] bmiStatus = determineBMIStatus(personData);

        	// Print the results
        	System.out.println("\nBMI Analysis Results:");
        	for (int i = 0; i < personData.length; i++) {
           		System.out.println("Person " + (i + 1) + ":");
			System.out.println("Weight: " + personData[i][0] + " kg, Height: " + personData[i][1] + " cm");
			System.out.println("BMI: " + String.format("%.2f", personData[i][2]) + ", Status: " + bmiStatus[i]);
		}
    	}
}
