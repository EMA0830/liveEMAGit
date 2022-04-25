package com.demo.io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FontReader {
	public static void main(String[] args) {
//		System.out.println("CSVReader");
//		int recordCount = countOfProductRecords("products.csv");
//		System.err.println(recordCount);
//		System.err.println(countOfProductRecordsArrayList("products.csv"));
//		System.err.println(countOfProductRecordsSet("products.csv"));
		// loadRecordsIntoArray("fonts.txt");
		printRecords("fonts.txt");
	}

	// This method reads a file and returns the count of lines in the file
	// omit any headers present in the file

	public static int countOfProductRecords(String fileName) {
		int recordCount = -1;
		System.out.println("");

		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				scanner.nextLine();
//				String productString = scanner.nextLine();
//				System.out.println(productString);
				recordCount++;
			}
		} catch (Exception exception) {
			System.err.println(">>>>  " + exception);
		}
		return recordCount;
	}

	public static int countOfProductRecordsArrayList(String fileName) {
		int recordCount = -1;
		System.out.println("");

		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			List productsList = new ArrayList();
			while (scanner.hasNextLine()) {
				productsList.add(scanner.nextLine());
			}
			recordCount = productsList.size() - 1;
		} catch (Exception exception) {
			System.err.println(">>>>  " + exception);
		} finally {
			System.err.println(">>>> ");
		}
		return recordCount;
	}

	public static int countOfProductRecordsSet(String fileName) {
		int recordCount = -1;
		System.out.println("");

		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			Set productsSet = new HashSet();
			while (scanner.hasNextLine()) {
				productsSet.add(scanner.nextLine());
			}
			System.out.println(productsSet);
			recordCount = productsSet.size() - 1;
		} catch (Exception exception) {
			System.err.println(">>>>  " + exception);
		} finally {
			System.err.println(">>>> ");
		}
		return recordCount;
	}

	public static void printRecords(String fileName) {
		// arrays are of fixed size
		// ProductModel[] productModels = new
		// ProductModel[countOfProductRecords("products.csv")];
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			int idx = 0;
			// ignore the first row
			String headerString = scanner.nextLine();

			while (scanner.hasNextLine()) {
				String lineString = scanner.nextLine();
				if(lineString.contains("<p>"))
				System.err.println("<u>" + lineString + "</u>");
				else {
					System.out.println(lineString);
				}
			}
		} catch (Exception exception) {
			System.out.println(">>>>  " + exception);
			exception.printStackTrace();
		}
	}

	public static void loadRecordsIntoArray(String fileName) {
		// arrays are of fixed size
		ProductModel[] productModels = new ProductModel[countOfProductRecords("products.csv")];
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			int idx = 0;
			// ignore the first row
			String headerString = scanner.nextLine();

			while (scanner.hasNextLine()) {
				String recordString = scanner.nextLine();
				String fields[] = recordString.split(",");
				// fetch all products into the product model
				ProductModel productModel = new ProductModel(fields[0], fields[1], Float.parseFloat(fields[2]));
				productModels[idx] = productModel;
				idx++;
//				String productString = scanner.nextLine();
//				System.out.println(productString);
			}
//			String fieldNames[] = headerString.split(",");
//			for(String fieldNameString : fieldNames) {
//				System.out.print(fieldNameString + "\t\t");
//			}
//			System.out.println();

			System.out.println("Product Id\t\tProduct Name\t\tPrice");

			for (ProductModel productModel : productModels) {
//				System.err.println("Iterate");
				System.out.println(productModel);
			}
		} catch (Exception exception) {
			System.err.println(">>>>  " + exception);
			exception.printStackTrace();
		}
	}
}
