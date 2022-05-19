package com.demo.basics.revision;

public class ClassObjectEx {
	public static void main(String[] args) {
		Fruit fruit = null;
//		memory is created using the new keyword
		fruit = new  Fruit();
		fruit.setName("Strawberry");
		fruit.setColor("red");

		Fruit fruit2 = new Fruit();
		fruit2.setName("Raspberry");
		fruit2.setColor("purple");
		
		System.out.println("The color of " + fruit.getName()+ " is " + fruit.getColor());
		System.out.println("The color of " + fruit2.getName()+ " is " + fruit2.getColor());
	}
}

class Fruit {
	// instance variable
	// this keyword is used to refer to the instance variable
	private String name;
	private String color;

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

}