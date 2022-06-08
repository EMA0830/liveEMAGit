package com.demo.basics;

public class VariableTypes {
	// instance variable automatically initialized
	int var1;
	// class or static variable automatically initialized
	static int var2;

	public static void main(String[] args) {
		int var3;
//		Cannot make a static reference to the non-static field var1
//		System.out.println(var1);
		// instance
		VariableTypes variableTypesObject = new VariableTypes();
		System.out.println(variableTypesObject.var1);
		System.out.println(var2);
//		The local variable var3 may not have been initialized
//		System.out.println(var3);
	}
}
