package com;

public class ExceptionT {
	public static void main(String[] args) {
		System.out.println("");
		testMethod();
	}

	private static void testMethod() {
		System.out.println("");

		try {

		} catch (Exception exception) {
			System.err.println(">>>>  " + exception);
		} finally {
			System.err.println(">>>> ");
		}

	}

}

