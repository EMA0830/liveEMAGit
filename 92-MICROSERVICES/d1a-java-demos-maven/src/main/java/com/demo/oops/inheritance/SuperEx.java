package com.demo.oops.inheritance;

public class SuperEx { 
	public static void main(String[] args) {
		Derived derived = new Derived(); // 1
		System.err.println(derived.messageString); //9
		derived.display(); //10
	}
}

class Base {
	
	public String messageString = "hi"; //5 From Derived //12
	
	public Base() {
		System.out.println("Base");
	}

	public Base(String message) { //4 
		this.messageString = message; //6
	}

	public void display() {
		System.out.println(messageString);
	}
}

class Derived extends Base{
	public String messageString = "hii"; //7
	public Derived() { // 2
		super(); // base class default constructor
//		super("FromDerived"); //3
		System.out.println("Derived"); //8
//		Constructor call must be the first statement in a constructor
//		super(); // base class default constructor
	}

	public void display() { //10
		System.out.println(super.messageString); //11
//		super.display();
//		System.out.println(messageString);
	}
}