package org.example;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		int status = getStatus();
		double income = getIncome();

		final int[][] brackets = {
			{8350, 33950, 82250, 171550, 372950}, // Single
			{16700, 67900, 137050, 208850, 372950}, // Married Filing Jointly
			{8350, 33950, 68525, 104425, 186475}, // Married Filing Separately
			{11950, 45500, 117450, 190200, 372950} // Head of Household
		};
		final double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

		double tax = calculateTax(status, income, brackets, rates);
		System.out.printf("Tax is: $%.2f%n", tax);

	}

	private static double calculateTax(int status, double income, int[][] brackets, double[] rates) {
		double tax = 0;
		int[] bracket = brackets[status];

		for (int i = 0; i < brackets.length; i++) {
			if (income < bracket[i]) {
				tax += income * rates[i];
				return tax;
			} else {
				tax += bracket[i] * rates[i];
				income -= bracket[i];
			}
		}
			tax += income * rates[rates.length - 1];
			return tax;
	}


	public static double getIncome() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your income:");
		return input.nextDouble();
	}
	public static int getStatus() {
		int status = -1;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your filing status:");
			System.out.println("0 : Single");
			System.out.println("1 : Married filing jointly or qualified widow");
			System.out.println("2 : Married filing separately");
			System.out.println("3 : Head of household");
			status = input.nextInt();
			if (status < 0 || status > 3) System.out.println("Invalid status");
		} while (status < 0 || status > 3);
		return status;
	}

}
