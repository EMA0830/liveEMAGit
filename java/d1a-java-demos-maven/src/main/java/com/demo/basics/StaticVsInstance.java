package com.demo.basics;

public class StaticVsInstance {
	public static void main(String[] args) {
		System.out.println(Dog.count);
		// instance (object)
		Dog goodDog1 = new Dog();
		goodDog1.name = "Fido";
		Dog.count = 1;
		
		Dog goodDog2 = new Dog();
		goodDog2.name = "Rover";
//		Dog.count = 2;
		Dog.count += 1;

		Dog goodDog3 = new Dog();
		goodDog3.name = "Spot";
		Dog.count += 1;
//		Dog.count = 3;
		

		
		System.out.println(goodDog1.name);
		System.out.println(goodDog2.name);
		System.out.println(goodDog3.name);
		
		System.out.println(Dog.count);
//		System.out.println(goodDog1.count);
//		System.out.println(goodDog2.count);
//		System.out.println(goodDog3.count);
		
		// Spot gets sold
		System.out.println("Spot gets sold!");
//		Dog.count =2;
		Dog.count -= 1;
		System.out.println(Dog.count);
//		System.out.println(goodDog1.count);
//		System.out.println(goodDog2.count);
//		System.out.println(goodDog3.count);	
	}
}

class Dog {
	// instance
	String name;
	// static
	static int count;
}