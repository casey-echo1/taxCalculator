package org.example;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Problem1(5);
//		Problem2(5);
//		Problem3(15);
//		Problem4(20);
//		Problem5();
//		Problem6();

	}

	public static void Problem1(int x) {
		if (x <= 10) System.out.println("Less than 10");
	}
	public static void Problem2(int x) {
		if (x < 10) System.out.println("Less than 10");
		else if (x > 10) System.out.println("Greater than 10");
	}
	public static void Problem3(int x) {
		if (x < 10) System.out.println("Less than 10");
		else if (x > 10 && x < 20) System.out.println("Greater than 20");
		else System.out.println("Greater than or equal to 20");
	}
	public static void Problem4(int x) {
		if (x < 10 || x > 20) System.out.println("Out of range");
		else System.out.println("In range");
	}
	public static void Problem5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What score did you get?");
		int score = scanner.nextInt();
		scanner.close();

		if (score > 100 || score < 0) System.out.println("Score out of range");
		else if (score > 90) System.out.println("A");
		else if (score > 80) System.out.println("B");
		else if (score > 70) System.out.println("C");
		else if (score > 60) System.out.println("D");
		else System.out.println("F");
	}
	public static void Problem6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number from 1-7:");
		int input = scanner.nextInt();
		scanner.close();

		switch (input) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default: System.out.println("Out of range");

		}
	}


}

