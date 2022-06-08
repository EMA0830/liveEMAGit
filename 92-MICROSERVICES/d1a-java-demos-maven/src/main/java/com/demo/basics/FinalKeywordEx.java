package com.demo.basics;

public class FinalKeywordEx {
	public static void main(String[] args) {
		DegreeCertificate degreeCertificate = new DegreeCertificate();
//	The final field DegreeCertificate.cGPA cannot be assigned
//	degreeCertificate.cGPA  = 10;
		degreeCertificate.laminate = true;
		
		House prettyHouse = new House();
		prettyHouse.modifyHall();
		prettyHouse.modifyHall("Lovely colors with Asian Paints....");
	}
}

final class DegreeCertificate {
	// the final variable cant be modified
	final float cGPA = 9.9f;
	boolean laminate = false;
}

//The type DegreeCertificateForgery cannot subclass the final class DegreeCertificate
//class DegreeCertificateForgery extends DegreeCertificate{
//	
//}

class House {
	public void useHall() {
		System.out.println("Hall to watch movies.....");
	}

//	public final void modifyHall() {
// final methods can be overloaded.
	final public void modifyHall() {
		System.out.println("Simple modification");
	}
	final public void modifyHall(String preferences) {
		System.out.println("Modification " + preferences);
	}
}

class RentedHouse extends House {
	public void useHall() {
		super.useHall();
		System.out.println("Do exercise with music");
	}
//	Cannot override the final method from House
//	 public void modifyHall() {
//		System.out.println("Cut the door and make a table....");
//	}
}