package com.demo.collection;

import java.util.HashSet;
import java.util.Set;

public class ArrayListEx {
	public static void main(String[] args) {
//		ArrayList shoppingCart = new ArrayList();
//		List shoppingCart = new ArrayList();
		Set shoppingCart = new HashSet();
//		Iterable shoppingCart = new ArrayList();
		// insertion order
		String itemString = "Start With Why";
		Object itemObject = itemString;
		shoppingCart.add(itemObject);
		shoppingCart.add((Object) "Attitude Is Everything");
		shoppingCart.add("The Monk");
		shoppingCart.add("To Kill A Mockingbird");
		shoppingCart.add("The Monk");
		System.out.println(shoppingCart);

//		explore the lambda
		shoppingCart.forEach((item) -> {
			if (item.equals("The Monk")) {
				System.err.println("Found Item : " + item);
			}
		});
	}
}
