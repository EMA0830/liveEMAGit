package com.demo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
	public static void main(String[] args) {
		System.out.println("");
//		storeObjectsInMap();
		contryCodes();
		contryCodesTreeMap();
	}

	private static void storeObjectsInMap() {
		System.out.println("");
//		Map is a raw type holds objects
		Map mapOfObjects = new HashMap();
		String objectString = "Object String";
		Integer objectInteger = 1;
		mapOfObjects.put(objectInteger, objectString);
		mapOfObjects.put(2, new Exception());

		Collection shoppingCart = new ArrayList();
		shoppingCart.add("The Monk");
		shoppingCart.add("To Kill A Mockingbird");

		mapOfObjects.put(3, shoppingCart);
		mapOfObjects.put(shoppingCart, 4);
//		{1=Object String, 2=java.lang.Exception, 3=[The Monk, To Kill A Mockingbird], [The Monk, To Kill A Mockingbird]=4}
		System.err.println(mapOfObjects);
//		Map <String,String>dictionaryMap = new HashMap<String,String>();
	}

	private static void contryCodes() {
		System.out.println("");
//		Map is a generic  type holds <String,Integer> 
		Map<String, Integer> countryCodes = new HashMap<String, Integer>();
//		The method put(String, Integer) in the type Map<String,Integer> is not applicable for the arguments (int, String)
//		countryCodes.put(81, "Japan");
//		The method put(String, Integer) in the type Map<String,Integer> is not applicable for the arguments (Exception, int)
//		countryCodes.put(new Exception(), 1);
		System.err.println(countryCodes.isEmpty());
		countryCodes.put("Japan", 81);
		System.err.println(countryCodes.isEmpty());
		countryCodes.put("India", 91);
		countryCodes.put("France", 0);
//		no duplicate key allowed
		countryCodes.put("France", 33);
		// duplicate values allowed
		countryCodes.put("nocounty", 33);
		System.out.println(countryCodes);
		System.err.println(countryCodes.size());
//		countryCodes.clear();
		System.out.println(countryCodes);
		String searchKeyString = countryCodes.containsKey("France") ? "KeyFound" : "KNotFound";
		System.out.println(searchKeyString);
		System.out.println(countryCodes.containsValue(33) ? "VF" : "VNF");
	}

	private static void contryCodesTreeMap() {
		System.out.println("");
//		Map is a generic  type holds <String,Integer> 
		Map<String, Integer> countryCodes = new TreeMap<String, Integer>();
//		The method put(String, Integer) in the type Map<String,Integer> is not applicable for the arguments (int, String)
//		countryCodes.put(81, "Japan");
//		The method put(String, Integer) in the type Map<String,Integer> is not applicable for the arguments (Exception, int)
//		countryCodes.put(new Exception(), 1);
		System.err.println(countryCodes.isEmpty());
		countryCodes.put("Japan", 81);
		System.err.println(countryCodes.isEmpty());
		countryCodes.put("India", 91);
		countryCodes.put("France", 0);
//		no duplicate key allowed
		countryCodes.put("France", 33);
		// duplicate values allowed
		countryCodes.put("nocounty", 33);
		System.out.println(countryCodes);
		System.err.println(countryCodes.size());
//		countryCodes.clear();
		System.out.println(countryCodes);
		String searchKeyString = countryCodes.containsKey("France") ? "KeyFound" : "KNotFound";
		System.out.println(searchKeyString);
		System.out.println(countryCodes.containsValue(33) ? "VF" : "VNF");
	}
}
