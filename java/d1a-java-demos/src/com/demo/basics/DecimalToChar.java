package com.demo.basics;

public class DecimalToChar {
public static void main(String[] args) {
	decimalToChar();
}
private static void decimalToChar() {
	for (int decimal = 97; decimal <= 122; decimal++) {
		char small = (char) decimal;
		char capital = (char) (decimal - 32);
		System.out.println(small + " > " + capital);
	}
}
}
