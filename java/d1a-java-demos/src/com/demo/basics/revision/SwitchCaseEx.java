package com.demo.basics.revision;

public class SwitchCaseEx {
	public static void main(String[] args) {
		// days are 1(Sunday) - 7(Saturday)
		// the case should have a value and not a condtion
		int day = 3;
		switch (day) {
		case 1: {
			System.out.println("Sunday");
			break;
		}
		case 2: {
			System.out.println("Monday");
			break;
		}
		case 3: {
			System.out.println("Tuesday");
			break;
		}
//		other cases
		case 5: {
			System.out.println("Thursday");
			break;
		}
		default:
			System.out.println("Invalid");
		}
		System.out.println("done");
	}

}
