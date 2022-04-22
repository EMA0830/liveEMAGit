package com.demo;

public class App {
	public static void main(String[] args) {
		//testAdd();
		Calculator calculatorObject = new Calculator();
		int result = calculatorObject.add(5, 10);
		System.out.println(result);
		result = calculatorObject.subtract(5, 10);
		System.out.println(result);
	}

	private static void testAdd() {
		Calculator calculatorObject = new Calculator();
		int result = calculatorObject.add(5, 10);
		if(result == 150 ) {
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test Failed");
		}
	}
}

