// Program to generates five 4 digit random values and then find their average value, and their minimum and maximum value

import java.util.Arrays;

public class GenerateRandomValue {
	// Create generate4DigitRandomArray() method to generate an array of 4-digit random numbers
    	public static int[] generate4DigitRandomArray(int size) {
        	int[] randomNumbers = new int[size];
        	for (int i = 0; i < size; i++) {
            		randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        	}
        	return randomNumbers;
    	}

	// Create findAverageMinMax() method to find average, minimum and maximum values of an array
    	public static double[] findAverageMinMax(int[] numbers) {
        	double sum = 0, min = numbers[0], max = numbers[0];

        	for (int i = 0; i < numbers.length; i++) {
            		sum += numbers[i];
            		min = Math.min((int) min, numbers[i]);
            		max = Math.max((int) max, numbers[i]);
        	}
		double average = sum / numbers.length;
        	return new double[] {average, min, max};
    	}

    	public static void main(String[] args) {
        	int[] randomNumbers = generate4DigitRandomArray(5);

        	System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));

        	double[] results = findAverageMinMax(randomNumbers);

        	System.out.println("Average: " + results[0]);
        	System.out.println("Minimum: " + (int) results[1]); 
        	System.out.println("Maximum: " + (int) results[2]);
    	}
}
