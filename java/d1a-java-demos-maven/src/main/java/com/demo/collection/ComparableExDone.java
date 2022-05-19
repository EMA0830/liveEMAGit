
package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;

// sort by name
public class ComparableExDone {
	public static void main(String[] args) {
		sortArrayList();
		sortPersonByAge();
	}

	private static void sortArrayList() {
		ArrayList shoppingCart = new ArrayList();
		shoppingCart.add("The Monk");
		shoppingCart.add("To Kill A Mockingbird");
		shoppingCart.add("Attitude Is Everything");
		System.out.println(shoppingCart);
//		sort method understands String and knows how to sort.
		Collections.sort(shoppingCart);
		System.out.println(shoppingCart);
		ArrayList scores = new ArrayList();
		scores.add(2);
		scores.add(1);
		System.out.println(scores);
//		sort method understands Integer and knows how to sort.
		Collections.sort(scores);
		System.out.println(scores);
	}

	private static void sortPersonByAge() {
		ArrayList<Person1> list = new ArrayList<Person1>();
		list.add(new Person1("Jack", 34));
		list.add(new Person1("Tom", 42));
		list.add(new Person1("Bond", 28));
		System.out.println(list);
		// sort user defined by fields
		Collections.sort(list);
		System.out.println(list);
	}
//	IP
	private static void sortPersonByName() {
	}
}

//Comparable
class Person1 implements Comparable<Person1> {
	String name;
	int age;

	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

//compareTo
	/**
	 * This function compares this class object to Person1 object passed as an
	 * argument and returns negative integer, zero, or a positive integer as this
	 * object is less than, equal to, or greater than the specified object.
	 */
	@Override
	public int compareTo(Person1 otherPerson) {
		if (this.age == otherPerson.age)
			return 0;
		else
			return (this.age < otherPerson.age) ? -1 : 1;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.age;
	}

}