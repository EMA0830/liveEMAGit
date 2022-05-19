package com.demo.package2;

import com.demo.package1.ClassA;

public class NonSubClassD {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.s);
		a.m();
	}
}