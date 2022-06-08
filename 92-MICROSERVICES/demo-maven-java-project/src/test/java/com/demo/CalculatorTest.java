package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;

public class CalculatorTest {
	Calculator calculatorObject;
	@BeforeEach
	public void setUp() {
		System.out.println("Setup");
		calculatorObject = new Calculator();
	}
	@Test
	public void testAdd() {
		System.out.println("testAdd");		
		assertEquals(15, calculatorObject.add(5, 10));
		assertNotEquals(150, calculatorObject.add(5, 10));
	}
	@Test
	public void testSutract() {
		System.out.println("testSutract");		
		assertEquals(-5, calculatorObject.subtract(5, 10));
		assertNotEquals(-150, calculatorObject.subtract(5, 10));
	}
@AfterEach
	public void tearDown() {
	System.out.println("tearDown");
		calculatorObject = null;
	}
}
