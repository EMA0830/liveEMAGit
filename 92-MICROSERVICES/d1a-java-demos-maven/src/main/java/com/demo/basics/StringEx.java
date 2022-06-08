package com.demo.basics;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
//		shortestString();
//		stringComparisonReversal();
//		palindrome();
		acceptStringsToArray();
	}

	private static void palindrome() {
		// IMPLEMENT THIS BY COMPARING EACH CHARACTER USING charAt(index) method of String
//		String palindromeString = "malayalam";
		String palindromeString = "tamil";
		// pass the string to the constructor
		StringBuilder stringBuilderObject = new StringBuilder(palindromeString);
		StringBuilder stringBuilderReversed = stringBuilderObject.reverse();
		String reversedString = stringBuilderReversed.toString();

		if (palindromeString.equals(reversedString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	private static void shortestString() {
		String seatArray[] = new String[3];
		seatArray[2] = "Dad";
		seatArray[1] = "Daughter";
		seatArray[0] = "Pet Tommy";

		String shortestString = seatArray[0];
		for (int ctr = 1; ctr < seatArray.length; ctr++) {
			if (shortestString.length() > seatArray[ctr].length()) {
				// longest string
//			if(shortestString.length() < seatArray[ctr].length()) {
				shortestString = seatArray[ctr];
			}
		}
		System.out.println(shortestString);
	}

	private static void stringComparisonReversal() {
		String placeString = "Chennai";
		System.out.println(placeString);

		// Display the characters
		for (int ctr = 0; ctr < placeString.length(); ctr++) {
			System.out.println("Char at " + (ctr + 1) + " is " + placeString.charAt(ctr));
		}
		System.out.println("String Reversal");
		// reverse the string
		for (int ctr = placeString.length() - 1; ctr >= 0; ctr--) {
			System.out.println("Char at " + (ctr + 1) + " is " + placeString.charAt(ctr));
		}
//twoDimArray();

		// compare two strings
//		String placeString2 = "Mumbai";
		String placeString2 = "Asia";
		int result = placeString.compareTo(placeString2);
		if (result == 0) {
			System.out.println("Places are equal");
		} else if (result < 0) {
			System.out.println("Smaller");
		} else {
			System.out.println("Greater");
		}
		System.out.println(result);
	}

	private static void twoDimArray() {
		// singleDimArray();
		String seatArray[][] = new String[2][5];
		seatArray[0][0] = "Dad";
		seatArray[0][1] = "Mom";
		seatArray[0][2] = "Son";
		seatArray[0][3] = "Daughter";
		seatArray[0][4] = "Pet Tommy";

		seatArray[1][0] = "Unlcle";
		seatArray[1][1] = "Aunty";
		seatArray[1][2] = "Uncle's Son";
		seatArray[1][3] = "Uncle's Daughter";
		seatArray[1][4] = "Pet Fluffy";

		for (int row = 0; row <= 1; row++) {
			for (int seat = 0; seat <= 4; seat++) {
				System.out.print(seatArray[row][seat] + "\t");
			}
			System.out.println();
		}
	}
	private static void acceptStringsToArray() {
		String colors[] = new String[3];
		// passing the keyboard (System.in) to the constructor of the Scanner.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three colors");
		for (int ctr = 0; ctr <= 2; ctr++) {
			colors[ctr] = scanner.nextLine();
		}
		System.out.println("Colors");
		for (int ctr = 0; ctr <= 2; ctr++) {
			System.out.println(colors[ctr]);
		}
	}
}

//String is Immutable   "Red" + "Red" = "RedRed" (new String) 