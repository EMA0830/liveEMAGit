package com.demo.collection;

import java.util.ArrayList;
// sort by name
public class ComparableExDo {
	public static void main (String [] args){
		ArrayList<Person> list = new ArrayList<Person>();
		list.add (new Person("Jack", 34));
		list.add (new Person("Tom", 42));
		list.add (new Person("Bond", 28));
		
//Collections.sort();
		System.out.println (list);
	}
}
//Comparator
class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
//compareTo
	/**
	 * This function compares this class object
	 * to person object passed as an argument
	 * and returns negative integer, zero, or a positive integer 
	 * as this object is less than, equal to, or greater than the specified object.
	 */

	@Override
	public String toString(){
		return this.name + ":" + this.age;
	}
}