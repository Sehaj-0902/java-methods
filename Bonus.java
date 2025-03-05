// Program to find the bonus of 10 employees based on their years of service as well as the total bonus amount

import java.util.Random;

public class Bonus {
    	// Create generateEmployeeData() method to determine the Salary and years of service and return the same
    	public static int[][] generateEmployeeData() {
        	int[][] employeeData = new int[10][2]; 
        	Random random = new Random();
        	for (int i = 0; i < 10; i++) {
            		employeeData[i][0] = 10000 + random.nextInt(90000); 
            		employeeData[i][1] = random.nextInt(11); 
        	}
        	return employeeData;
    	}

    	// Create calculateBonusAndNewSalary() method to calculate the new salary and bonus 
    	public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        	double[][] bonusData = new double[10][2];
        	for (int i = 0; i < 10; i++) {
            		double bonusPercentage = employeeData[i][1] > 5 ? 0.05 : 0.02;
            		double bonusAmount = employeeData[i][0] * bonusPercentage;
            		double newSalary = employeeData[i][0] + bonusAmount;
            		bonusData[i][0] = newSalary;
            		bonusData[i][1] = bonusAmount;
        	}
        	return bonusData;
    	}

    	// Create displayBonusDetails() method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
    	public static void displayBonusDetails(int[][] employeeData, double[][] bonusData) {
        	double totalOldSalary = 0;
        	double totalNewSalary = 0;
        	double totalBonus = 0;

        	String heading = String.format("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years Served", "New Salary", "Bonus Amount");
        	System.out.print(heading);

	        for (int i = 0; i < 10; i++) {
        	    	String row = String.format("%-10d %-15d %-15d %-15.2f %-15.2f%n", i + 1, employeeData[i][0], employeeData[i][1], bonusData[i][0], bonusData[i][1]);
            		System.out.print(row);
            		totalOldSalary += employeeData[i][0];
            		totalNewSalary += bonusData[i][0];
            		totalBonus += bonusData[i][1];
        	}

        	System.out.println("--------------------------------------------------------------------------------");
        	String totalRow = String.format("%-10s %-15.2f %-15s %-15.2f %-15.2f%n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
        	System.out.print(totalRow);
    	}

    	public static void main(String[] args) {
        	int[][] employeeData = generateEmployeeData();
        	double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        	displayBonusDetails(employeeData, bonusData);
    	}
}
