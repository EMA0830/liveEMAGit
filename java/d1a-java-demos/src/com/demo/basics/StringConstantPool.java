package com.demo.basics;

public class StringConstantPool {
	public static void main(String[] args) {
		// STRING CONSTANT POOL
		stringConstantPool();
		heapMemory();
//		testEquals();
	}

	public static void stringConstantPool() {
		// Program 1: Comparing two references to objects
		// created using literals.

		String companyString = "FictitiousCompany";
		String companyNameString = "FictitiousCompany";
		// Note that this == compares whether
		// companyString and companyNameString refer to same object or not

		if (companyString == companyNameString) {
			System.out.println("Objects are identical");
		} else
			System.out.println("Objects are non identical");
	}

	public static void heapMemory() {
		// Program 2: Comparing two references to objects
		// created using new operator.
		String companyString = new String("FictitiousCompany");
		String companyNameString = new String("FictitiousCompany");

		// Note that this == compares whether
		// s1 and s2 refer to same object or not

		if (companyString == companyNameString) {
			System.out.println("Objects are identical");
		} else
			System.out.println("Objects are non identical");
	}

	public static void testEquals() {
		String companyString = "FictitiousCompany";
		String companyNameString = "FictitiousCompany";

		if (companyString == companyNameString) {
			System.out.println("Objects are same");
		}
		if (companyString.equals(companyNameString)) {
			System.out.println("Objects are equal");
		}
//		     reference = instance
//			 variable = object
		String companyString1 = new String("FictitiousCompanyChennai");
		String companyNameString1 = new String("FictitiousCompanyChennai");

		if (companyString1 == companyNameString1)
			System.out.println("Objects are same");
		else
			System.out.println("Objects are not same");
		if (companyString1.equals(companyNameString1)) {
			System.out.println("Objects are equal");
		}
	}
}
