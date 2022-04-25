package com.demo.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HTMLStyleAdder {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("para.txt"));
		while (scanner.hasNextLine()) {
			String lineString = scanner.nextLine();
			System.out.println(lineString.contains("<p>") ? "<u>" + lineString.trim() + "</u>" : lineString.trim());
		}
//		printRecordsShort("para.txt");
	}

//
//	public static void printRecords(String fileName) {
//		// arrays are of fixed size
//		// ProductModel[] productModels = new
//		// ProductModel[countOfProductRecords("products.csv")];
//		try {
//			File file = new File(fileName);
//			Scanner scanner = new Scanner(file);
//			while (scanner.hasNextLine()) {
//				String lineString = scanner.nextLine();
//				if (lineString.contains("<p>")) {
//					System.err.println("<u>" + lineString.trim() + "</u>");
//				} else {
//					System.err.println(lineString.trim());
//				}
//			}
//		} catch (Exception exception) {
//			System.err.println(">>>>  " + exception);
//			exception.printStackTrace();
//		}
//	}
//	public static void printRecordsShort(String fileName) throws IOException {
//		Scanner scanner = new Scanner(new File(fileName));
//		while (scanner.hasNextLine()) {
//			String lineString = scanner.nextLine();
//			System.out.println(lineString.contains("<p>") ? "<u>" + lineString.trim() + "</u>" : lineString.trim());
//		}
//	}
}
