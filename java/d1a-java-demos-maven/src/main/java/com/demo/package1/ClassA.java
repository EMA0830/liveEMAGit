package com.demo.package1;

public class ClassA {
	
	//MOST RESTRICTED TO LEAST RESTRICTED [PRIVATE >> DEFAULT >> PROTECTED >> PUBLIC ]
	//MOST ACCESSIBLE TO LEAST ACCESSIBLE [PUBLIC >> PROTECTED >> DEFAULT >> PRIVATE ]
	// DEFAULT ACCESS SPECIFIER HAS NO KEYWORD
	 public String s = "test";
	 public void m() {
		System.out.println("m() " + s);
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.s);
		a.m();
	}
}