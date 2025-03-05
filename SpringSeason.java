// Program to check if it's a Spring Season using a method

import java.util.Scanner;

public class SpringSeason {
	// Create isSpringSeason() method to check if it's a Spring Season
	public static boolean isSpringSeason(int month, int day) {
		// Check if the month is March and the day is between 20 and 31 (inclusive)
		if (month == 3 && day >= 20 && day <= 31) {
			return true;
		}

		// Check if the month is April and the day is between 1 and 30 (inclusive)
		else if (month == 4 && day >= 1 && day <= 30) {
			return true;
		}

		// Check if the month is May and the day is between 1 and 31 (inclusive)
		else if (month == 5 && day >= 1 && day <= 31) {
			return true;
		}

		// Check if the month is June and the day is between 1 and 20 (inclusive)
		else if (month == 6 && day >= 1 && day <= 20) {
			return true;
		}

		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month (1-12): ");
		// Create a variable month to store the input month
		int month = sc.nextInt();

		System.out.print("Enter day (1-31): ");
		// Create a variable day to store the input day
		int day = sc.nextInt();

		// Call isSpringSeason() method and print the results
		if (isSpringSeason(month, day)) {
                	System.out.println("It's a Spring Season");
            	}
		else {
                	System.out.println("Not a Spring Season");
            	}
	}
}
