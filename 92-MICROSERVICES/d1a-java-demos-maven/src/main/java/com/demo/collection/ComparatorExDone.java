
package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// sort by name
public class ComparatorExDone {
	public static void main(String[] args) {
		sortPersonByAgeOrName();
	}

	private static void sortPersonByAgeOrName() {
		ArrayList<Person2> list = new ArrayList<Person2>();
		list.add(new Person2("Jack", 34));
		list.add(new Person2("Ann", 42));
		list.add(new Person2("Bond", 28));
		System.out.println(list);
		// sort user defined by fields
		AgeComparator ageComparator = new AgeComparator();
		Collections.sort(list, ageComparator);
		System.out.println(list);
		
		Collections.sort(list, new NameComparator());
		System.out.println(list);
	}

//	IP
	private static void sortPersonByName() {
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.age;
	}
}

class NameComparator  implements Comparator<Person2> {

	@Override
	public int compare(Person2 Person2, Person2 person2) {
		return Person2.name.compareTo(person2.name);
	}
}
class AgeComparator  implements Comparator<Person2> {

	@Override
	public int compare(Person2 Person2, Person2 person2) {
		return Person2.age - person2.age;
	}
}