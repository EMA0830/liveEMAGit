package com.demo.basics.string;
// IP Count the number of "shells" & "sells"
// "She sells sea shells by the sea shore. The shells she sells are surely seashells. So if she sells shells on the seashore, I'm sure she sells seashore shells."
public class StringEx {
	public static void main(String[] args) {
		System.out.println("");
//		waysToConstructStrings();
		usingStringMethods();
	}

	private static void waysToConstructStrings() {
		//IP find differences in various methods
		// literal
		String nameString = "Rambo";
		System.err.println(nameString);
		// new keyword
		String nameString2 = new String("John");
		System.err.println(nameString2);
		// StringBuffer
		StringBuffer stringBuffer = new StringBuffer("StringBuffer");
		System.err.println(stringBuffer);
		// StringBuilder
		StringBuilder stringBuilder = new StringBuilder("StringBuilder");
		System.err.println(stringBuilder);	
		// byte array
		byte[] byteArray = { 97, 98, 99, 65, 66, 67 };
		String fromByteString = new String(byteArray);
		System.err.println(fromByteString);
		String fromByteString2 = new String(byteArray,1,3);
		System.err.println(fromByteString2);
		char charArray[] = { 'a','e','i','o','u'};
		String fromCharString = new String(charArray);
		System.err.println(fromCharString);
		String fromStringBuffer = new String(stringBuffer);
		System.err.println(fromStringBuffer);
		String fromStringBuilder = new String(stringBuilder);
		System.err.println(fromStringBuilder);
	}

	private static void usingStringMethods() {
		String nameString = "RamboJumbo";
		String fruitString[] = {"apple","APPLE", "bpple"};
		System.err.println(nameString.length());
		System.err.println(nameString.charAt(2));
		System.err.println(nameString.substring(2, 4));
		String nameString2 = new String("John");
		System.err.println(nameString.concat(nameString2));
		System.err.println(nameString.indexOf('m'));
		System.err.println(nameString.lastIndexOf("m"));
		System.out.println((int)'a');
		System.err.println(fruitString[0].compareTo(fruitString[2]));
		System.err.println(fruitString[2].compareTo(fruitString[0]));
		System.err.println(fruitString[0].compareTo("apple"));
		System.err.println(fruitString[0].compareTo(fruitString[1]));
		System.err.println(fruitString[0].equals(fruitString[1]));
		System.err.println(fruitString[0].equalsIgnoreCase(fruitString[1]));
		System.err.println(fruitString[0].toUpperCase());
	}
}
