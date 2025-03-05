// Program to find the youngest and tallest friend among 3 friends Amar, Akbar and Anthony based on their ages and heights

import java.util.Scanner;

public class YoungestTallestFriends {
	// Create findYoungest() method to find the youngest friend
	public static String findYoungest(int[] ages) {
        	int youngestIndex = 0;
        	for (int i = 1; i < ages.length; i++) {
            		if (ages[i] < ages[youngestIndex]) {
                		youngestIndex = i;
            		}
        	}
        	if (youngestIndex == 0) {
            		return "Amar";
        	}
		else if (youngestIndex == 1) {
            		return "Akbar";
        	}
		else {
            		return "Anthony";
        	}
    	}

	// Create findTallest() method to find the tallest friend
	public static String findTallest(double[] heights) {
        	int tallestIndex = 0;
       		for (int i = 1; i < heights.length; i++) {
            		if (heights[i] > heights[tallestIndex]) {
                		tallestIndex = i;
            		}
        	}
        	if (tallestIndex == 0) {
            		return "Amar";
        	}
		else if (tallestIndex == 1) {
            		return "Akbar";
        	}
		else {
            		return "Anthony";
        	}
    	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create ages array to store ages of 3 friends
		int[] ages = new int[3];

		// Create heights array to store heights of 3 friends
		double[] heights = new double[3];

		// Take age input of Amar, Akbar, and Anthony
		System.out.print("Enter Amar's age: ");
        	ages[0] = sc.nextInt();

		System.out.print("Enter Akbar's age: ");
        	ages[1] = sc.nextInt();

		System.out.print("Enter Anthony's age: ");
        	ages[2] = sc.nextInt();

		// Take height input of Amar, Akbar, and Anthony
		System.out.print("Enter Amar's height: ");
        	heights[0] = sc.nextDouble();

		System.out.print("Enter Akbar's height: ");
        	heights[1] = sc.nextDouble();

		System.out.print("Enter Anthony's height: ");
        	heights[2] = sc.nextDouble();

		// Call findYoungest() method
		String youngest = findYoungest(ages);

		// Call findTallest() method
        	String tallest = findTallest(heights);

		// Print youngest friend
        	System.out.println("Youngest friend: " + youngest);

		// Print tallest friend
        	System.out.println("Tallest friend: " + tallest);
	}
}
