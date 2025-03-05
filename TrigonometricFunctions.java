// Program to calculate various trigonometric functions using Math class

import java.util.Scanner;

public class TrigonometricFunctions {
    	// Create calculateTrigonometricFunctions() method to calculate sine, cosine, and tangent
    	public static double[] calculateTrigonometricFunctions(double angle) {
        	// Convert angle from degrees to radians
        	double radians = Math.toRadians(angle);

        	// Calculate sine, cosine, and tangent
        	double sine = Math.sin(radians);
        	double cosine = Math.cos(radians);
        	double tangent = Math.tan(radians);

        	// Return sine, cosine, and tangent
        	return new double[]{sine, cosine, tangent};
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the angle in degrees: ");
        	double angle = sc.nextDouble();

        	// Create an array results to call calculateTrigonometricFunctions() method and store the results
        	double[] results = calculateTrigonometricFunctions(angle);

        	// Print sine, cosine, and tangent
        	System.out.println("Sine: " + String.format("%.2f", results[0]));
        	System.out.println("Cosine: " + String.format("%.2f", results[1]));
        	System.out.println("Tangent: " + String.format("%.2f", results[2]));
    	}
}
