package com.demo.package1;
public class NonSubClassB {
	public static void main(String[] args) {
		

		ClassA a = new ClassA();
		
// private
//		The field ClassA.s is not visible
//		The field ClassA.s is not visible
		System.out.println(a.s);
		a.m();
	}
}