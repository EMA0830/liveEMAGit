package com.demo.exceptions;

public class SingleCatchMultipleExceptions {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
		Calculator20 casioCalculator = null;
		// 0 or 1 catch only for a try
		try {
		// exits from here
//		System.out.println(cookies[-1]);
		System.out.println(cookies[6]);
		casioCalculator.add(5, 10);
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("chk idx");
		}
		catch ( NullPointerException exception) {
			System.out.println("chk null");
		}
		System.out.println("complete");
	}
}

class Calculator20 {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}