package com.demo.basics;

public class ArraysEx {
	public static void main(String[] args) {
		singleDimArray();
//		twoDArray();

	}

	private static void twoDArray() {
		String seatArray[][] = new String[2][5];
		seatArray[0][0] = "Dad";;
		seatArray[0][1]= "Mom";
		seatArray[0][2]= "Son";
		seatArray[0][3] = "Daughter";
		seatArray[0][4] = "Pet Tommy";
		
		seatArray[1][0] = "Unlcle";
		seatArray[1][1]= "Aunty";
		seatArray[1][2]= "Uncle's Son";
		seatArray[1][3] = "Uncle's Daughter";
		seatArray[1][4] = "Pet Fluffy";
		
		for(int row = 0; row <=1; row++) {
			for(int seat = 0; seat <=4; seat++) {
				System.out.print(seatArray[row][seat] + "\t");
			}
			System.out.println();
		}
	}

	
	private static void singleDimArray() {
		String seatArray[] = new String[5];
		seatArray[0] = "Dad";
		seatArray[1] = "Mom";
		seatArray[2] = "Son";
		seatArray[3] = "Daughter";
		seatArray[4] = "Pet Tommy";

		for (int seatCount = 0; seatCount < seatArray.length; seatCount++) {
			System.out.println("Seat " + (seatCount + 1) + " for " + seatArray[seatCount]);
		}
		
//		int alternateNumbers[] = {1,2,3,4,5,6,7};
		int alternateNumbers[] = new int[7];
		for(int i = 0; i <=6; i++) {
			alternateNumbers[i] = (i+1);
		}
		int total= 0, multiple = 1;
		for(int i = 0; i<alternateNumbers.length; i+=2) {
			total+= alternateNumbers[i];
		}
		for(int i = 1; i<alternateNumbers.length; i+=2) {
			multiple *= alternateNumbers[i];
		}
		System.out.println("Total : " + total);
		System.out.println("Mul " + multiple);
	}
}
