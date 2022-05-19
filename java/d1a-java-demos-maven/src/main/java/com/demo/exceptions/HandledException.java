package com.demo.exceptions;

public class HandledException {
	public static void main(String[] args) {
		System.out.println("Program begins");
		int num1 = 100;
		int num2 = 0;
		// the suspicious code is put inside a try block
		int division = 0;
		try {
			division = num1 / num2;
		}
		// write the handler to provide an alternate flow to avoid the program terminating abruptly.	
		catch (ArithmeticException arithmeticException) {
			System.out.println("Do not divide by zero....");
		}
		System.out.println(division);
		System.out.println("Program ends");
	}
}
