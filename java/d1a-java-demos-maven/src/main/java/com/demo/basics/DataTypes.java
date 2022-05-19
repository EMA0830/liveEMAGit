package com.demo.basics;

public class DataTypes {
	static byte byteVarDefault; // default value assigned

	public static void main(String[] args) {
		// primitive datatypes

		// task :print default values for all the primitive types
		byte byteVar = 127;
//		Type mismatch: cannot convert from int to byte
//		byte byteVar = 128;
		short shortVar = 32767;
		int intVar = 2147483647;
		long longVar = 60l;
		float floatVar = 20f;
		double doubleVar = 20.123d;

		boolean booleanVar = false;
		char charVar = 'W';

		System.out.println(byteVarDefault);
		System.out.println(byteVar + byteVar);
		System.out.println("Value Of byte Variable is " + byteVar);
		System.out.println("Value Of short Variable is " + shortVar);
		System.out.println("Value Of int Variable is " + intVar);
		System.out.println("Value Of long Variable is " + longVar);
		System.out.println("Value Of float Variable is " + floatVar);
		System.out.println("Value Of double Variable is " + doubleVar);
		System.out.println("Value Of boolean Variable is " + booleanVar);
		System.out.println("Value Of char Variable is " + charVar);
		// explore
		// abstract data types
		String myString = "hello";
		String myString1 = new String("hello");
		char testChar = myString1.charAt(2);
		System.out.println(testChar);
		double doubleVar1 = 500;
	}
}
