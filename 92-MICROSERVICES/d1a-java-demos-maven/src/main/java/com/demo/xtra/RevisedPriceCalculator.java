package com.demo.xtra;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RevisedPriceCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product : ");
		String product = scanner.nextLine();
		System.out.println("Enter Price : ");
		String priceInStringFormat = scanner.nextLine();
		double sellingPrice = Double.parseDouble(priceInStringFormat);
		// System.in represents the keyboard
		double revisedPrice = sellingPrice * 1.05f;
		System.out.println(revisedPrice);
		
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		String formattedValue = decimalFormat.format(revisedPrice);
		System.out.println(formattedValue);
		
		String formatRevisedPrice = Double.toString(revisedPrice);
		formatRevisedPrice = formatRevisedPrice.substring(0,7);
		System.out.println(" Product costs  $ " + formatRevisedPrice);
	}
}
