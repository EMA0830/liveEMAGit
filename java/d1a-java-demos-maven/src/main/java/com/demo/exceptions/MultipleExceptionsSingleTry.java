package com.demo.exceptions;

public class MultipleExceptionsSingleTry {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
		Calculator201 casioCalculator = null;
		try {
			// exits from here
			System.out.println(cookies[-1]);
			System.out.println(cookies[6]);
//		casioCalculator.add(5, 10);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException exception) {
			System.out.println("chk idx or nulls");
			System.err.println(exception);
		}
		System.out.println("complete");
	}
}

class Calculator201 {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}