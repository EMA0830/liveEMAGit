package com.demo.exceptions;

import java.util.Scanner;
// exceptions occur during run-time.
public class UnhandledException {
	public static void main(String[] args) {
		System.out.println("Program begins");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
//		 java.lang.ArithmeticException: / by zero
		int division = num1 / num2;
		// the lines below are ignored
//		program terminates abruptly
//		this is never a preferable situation.
		System.out.println(division);
		System.out.println("Program ends");
	}
}
