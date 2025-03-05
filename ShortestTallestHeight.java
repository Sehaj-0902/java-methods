// Program to find the shortest, tallest, and mean height of players present in a football team

import java.util.Random;

public class ShortestTallestHeight {
    	// Create findSum() method to find total sum of heights
    	public static int findSum(int[] heights) {
        	int sum = 0;
        	for (int i = 0; i < heights.length; i++) {
            		sum += heights[i];
        	}
       	 	return sum;
    	}

    	// Create findMean() method to find mean height
    	public static double findMean(int[] heights) {
        	return (double) findSum(heights) / heights.length;
    	}

    	// Create findShortest() method to find shortest height
    	public static int findShortest(int[] heights) {
        	int shortest = heights[0];
        	for (int i = 0; i < heights.length; i++) {
            		if (heights[i] < shortest) {
               	 		shortest = heights[i];
            		}
        	}
        	return shortest;
    	}

    	// Create findTallest() method to find tallest height
    	public static int findTallest(int[] heights) {
        	int tallest = heights[0];
        	for (int i = 0; i < heights.length; i++) {
        		if (heights[i] > tallest) {
                		tallest = heights[i];
            		}
        	}
        	return tallest;
    	}

    	public static void main(String[] args) {
        	int[] heights = new int[11];
        	Random random = new Random();

        	for (int i = 0; i < heights.length; i++) {
            		heights[i] = random.nextInt(101) + 150;
        	}

        	System.out.print("Heights of players: ");
        	for (int height : heights) {
            		System.out.print(height + " ");
        	}
        	System.out.println();

		// Print mean height, shortest height, tallest height
        	System.out.println("Mean height: " + findMean(heights) + " cm");
	        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        	System.out.println("Tallest height: " + findTallest(heights) + " cm");
    	}
}
