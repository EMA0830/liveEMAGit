package com.demo.package1;

public class SubClassC extends ClassA{
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.s);
		a.m();
	}
}
