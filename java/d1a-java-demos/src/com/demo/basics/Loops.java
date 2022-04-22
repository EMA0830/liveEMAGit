package com.demo.basics;

public class Loops {
	public static void main(String[] args) {
		Loops loops = new Loops();
//		 loops.forloop();
//		loops.whileloop();
//		loops.dowhile();
//		loops.breakmethod();
		loops.continuedemo();
	}

	public void forloop() {
		// init, test, incr/decr
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);
		}
	}

	public void whileloop() {
		// init
		int i = 1;
		// only test
		while (i < 10) {
			System.out.println(i);
			// incr/decr
			i = i + 2;
		}
	}

	public void dowhile() {
		int i = 100;
		do {
			System.out.println(i);
			i= i+2;
		} while (i<10);
	}
	
	public void breakmethod() {
		// missing test
//		for (int i = 1;  ; i = i + 2) {
		for (int i = 1; i <100 ; i = i + 2) {
			System.out.println(i);
			if(i == 11) {
				break;
			}
			//System.out.println(i);
		}
	}
	
	public void continuedemo() {
		for (int i = 1; i<11 ; i = i + 2) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);

		}
	}
}
