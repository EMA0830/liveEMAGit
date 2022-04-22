package com.demo.exceptions;

public class UnhandledExceptionUserInput {
	public static void main(String[] args) {
		System.out.println("Program begins");
		int num1 = 100;
		int num2 = 0;
//		 java.lang.ArithmeticException: / by zero
		// Unchecked Exception (compiler does not force check) : Developer can hanlde it.
		int division = num1 / num2;
		// the lines below are ignored
//		program terminates abruptly
//		this is never a preferable situation.
		System.out.println(division);
		System.out.println("Program ends");
	}
}
