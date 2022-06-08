package com.demo.basics.revision;

public class MethodsEx {
	public static void main(String[] args) {
	// sytax for creating an object
	// ClassName objectName = new ClassName();
	// ClassName() is a special method called as constructor.
	// new keyword creates the memory
		
		// calling a method which does not return a value.
		Calculator calculatorObject = new Calculator();
		calculatorObject.sum();
		
		//calling a method which returns a value
		int resultVar = calculatorObject.sum1();
		System.out.println(resultVar);
	}
	
	public void display() {
		System.out.println("display");
	}
}

// class nameOfClass {
//	datatype variableName = value;
//	public void methodName() {
//	}		
//}

// reuse the calculator class
class Calculator {
	int value = 100;
// methods with return value
	public void sum() {
		int result = value + value;
		System.out.println(result);
	}
	// method without return value
	public int sum1() {
		int result = value + value;
		return result;
	}
}