package com.demo.basics.revision;

public class ArrayOfApples {
public static void main(String[] args) {
	//an array that can store 3 apples
	String [] apples = new String[3];
	apples[0] = "red";
	apples[1] = "green";
	apples[2] = "yellow";
	
	for(int count = 0; count < apples.length; count++) {
		System.out.println(apples[count]);
	}
}
}

