// Program to check if it's a Leap Year

import java.util.Scanner;

public class LeapYear {
    	// Create isLeapYear() method to check if a year is a leap year
    	public static boolean isLeapYear(int year) {
        	if (year < 1582) {
			return false;
		}

		// Check if the year is a leap year
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = sc.nextInt();

		// Print results
		if (isLeapYear(year)) {
			System.out.println(year + " is a Leap Year.");
		}
		else {
			System.out.println(year + " is not a Leap Year.");
		}
	}
}
