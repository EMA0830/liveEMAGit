package com.demo.basics;

public class VariableScopeEx {
//	memeber variable scope
	String testString = null;
	UserDefinedClass userDefinedClass = null;

	public static void main(String[] args) {

	}
}

class UserDefinedClass {
//	method parameter scope
	public void test(String testString1, UserDefinedClass userDefinedClass1) {
//		local variable scope
		String testString2 = null;
		UserDefinedClass userDefinedClass2;
		try {
			System.out.println("exception handling");
//			exception handler parameter scope
		} catch (Exception exception) {

		}
	}
}