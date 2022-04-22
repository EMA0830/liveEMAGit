package com.demo.exceptions;

public class MultipleExceptions {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
		try {
			System.out.println(cookies[-1]);
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Check the index");
			String messageString = exception.getMessage();
			System.out.println("More Info : " + messageString);
		}

		// create an object for the calculator
		Calculator1 casioCalculator = null;
//		new keyword creates the memory
		casioCalculator = new Calculator1();
		try {
			casioCalculator.add(5, 10);
		} catch (NullPointerException nullPointerException) {
			System.out.println("Check if you have created and instance of Calculator using new keyword...");
			System.out.println("no chocolates in the box.... sorry");
//			casioCalculator = new Calculator1();
//			casioCalculator.add(5, 10);
		}
		System.out.println("complete");
	}
}

class Calculator1 {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}