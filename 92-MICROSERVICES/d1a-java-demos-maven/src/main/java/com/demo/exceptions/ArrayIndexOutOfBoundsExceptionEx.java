package com.demo.exceptions;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
//		 java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 7
		try {
		System.out.println(cookies[-1]); }
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
		System.err.println("check index");
		System.err.println(arrayIndexOutOfBoundsException);
		System.err.println(arrayIndexOutOfBoundsException.getMessage());
		}
//		program continues the normal flow
		System.out.println(cookies[6]);
	}
}
