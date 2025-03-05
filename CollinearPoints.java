// Program to find the 3 points that are collinear using the slope formula and area of triangle formula

import java.util.Scanner;

public class CollinearPoints {
    	// Create areCollinearUsingSlope() method to check if points are collinear using the formula of slope
    	public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        	return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    	}

    	// Create areCollinearUsingArea() method to check if points are collinear using the formula of area of triangle 
    	public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        	int area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        	return area == 0;
    	}

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take input for three points
        	System.out.print("Enter x1: ");
        	int x1 = sc.nextInt();
		System.out.print("Enter y1: ");
        	int y1 = sc.nextInt();

        	System.out.print("Enter x2: ");
        	int x2 = sc.nextInt();
		System.out.print("Enter y2: ");
        	int y2 = sc.nextInt();

        	System.out.print("Enter x3: ");
        	int x3 = sc.nextInt();
		System.out.print("Enter y3: ");
        	int y3 = sc.nextInt();

        	// Check collinearity of points using slope
        	if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            		System.out.println("The points are collinear using slope formula");
        	} 
        	else {
            		System.out.println("The points are not collinear using slope formula");
        	}
      

        	// Check collinearity of points using area of triangle
        	if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            		System.out.println("The points are collinear using area of triangle formula");
        	} 
        	else {
            		System.out.println("The points are not collinear using area of triangle formula");
        	}

    	}
}
