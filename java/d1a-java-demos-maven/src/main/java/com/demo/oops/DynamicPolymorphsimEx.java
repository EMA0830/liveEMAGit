package com.demo.oops;

public class DynamicPolymorphsimEx {
	public static void main(String[] args) {
		
		//Static Polymorphism
		Printer printer = new Printer();
		printer.print("Book");

		//Overrding [The derived method executes by supressing the base class method.
		WiredPrinter wiredPrinter = new WiredPrinter();
		wiredPrinter.print("Chapter");

		WirelessPrinter wirelessPrinter = new WirelessPrinter();
		wirelessPrinter.print("Page");
		System.out.println("***********************");
		// Give a print and you do not know which printer is going to print the job.
		// Dynamic Polymorphism
		Printer randomPrinter = null;
		//System defined class from java.uitl package
		// static methods can be directly accessed using the class
		double random = Math.random();
		if(random <= 0.5) {
//			System.out.println("one" + random);
			randomPrinter = new WiredPrinter();
		}
		else {
//			System.out.println("two" + random);
			randomPrinter = new WirelessPrinter();
		}
		randomPrinter.print("Comic");
	}
}

// user defined class
class Printer {
	public void print(String item) {
		System.out.println("Getting Print Job Ready !!!");
		System.out.println("Printing all pages in black & white of " + item);
		System.out.println("Completing the print job!\n");
	}
}

class WiredPrinter extends Printer {
	// overridding (providing a specialized behaviour)
	public void print(String item) {
		System.out.println("Connecting to the computer through USB cable ....");
		super.print(item);
//			System.out.println("Getting Print Job Ready !!!");
//			System.out.println("Printing all pages in black & white of " + item);
//			System.out.println("Completing the print job!");
	}
}

class WirelessPrinter extends Printer {
	public void print(String item) {
		System.out.println("Connecting to the computer through bluetooth or wifi ....");
		super.print(item);
	}
}
