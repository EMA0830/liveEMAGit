package com.demo.basics.revision;

public class IfElseEx {
	public static void main(String[] args) {
// syntax
//	if(condition) {
//		
//	}else if(condition){
//		
//	} 
//	else {
//		
//	}
		int age = 20;
		if (age < 20) {
			System.out.println("teen ager");
		} else {
			System.out.println("adult");
		}

		int grade = 55;
		// at any point zero or only one block will get executed
		if (grade >= 85) {
			System.out.println("Top");
		} else if (grade >= 70) {
			System.out.println("Middle");
		} else {
			System.out.println("Low");
		}

//syntax for switch 
//		switch(condition) {
//		case value1 :
//		{
//			
//		}
//		case :Value2 :
//		{
//			
//		}
//		default: {
//			
//		}
//		}
	}
}
