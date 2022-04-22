package com.demo.exceptions;

public class ThrowEx {
	public static void main(String[] args) {
		System.out.println("");
		try {
			int returnValue = testMethod();
			System.out.println(returnValue);
		} catch (NumberFormatException exception) {
			System.out.println("MAIN");
			System.err.println(">>>>  " + exception);
		}

	}

	private static Integer  testMethod() throws NumberFormatException {
		System.out.println("");
		try {
//			Integer.parseInt("123X");
			Integer.parseInt("123");
		} catch (NumberFormatException exception) {
			System.err.println(">>>>  " + exception);
			throw exception;
		} finally {
			System.err.println(">>>> ");
		}
		return 100;
	}

}
