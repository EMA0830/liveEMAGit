package com.demo.oops;

public class ConstructorChainingEx {
	public static void main(String[] args) {
		new Derived1();
//new Derived1("test");
	}
}


class Base1 {
	public Base1() {
		System.out.println("Base1");
	}
	
}

class Derived1 extends Base1{
	public Derived1() {
		super();
		System.err.println("Derived1()");
	}
	public Derived1(String msgString) {
//		for constructors in the same class, the this() keyword can be used.
		this();
		System.err.println(msgString);
	}
}