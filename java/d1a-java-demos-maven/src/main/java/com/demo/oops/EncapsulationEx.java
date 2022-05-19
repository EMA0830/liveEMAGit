package com.demo.oops;

public class EncapsulationEx {
 public static void main(String[] args) {
	Product1 product = new Product1();
	product.displayDetails();
	product.setProductId("p123");
	product.setProductName("Apple");
	product.displayDetails();
	product.setProductId("p1234");
	product.setProductName("PApple");
	product.displayDetails();
}
}

//Classes encapsulate data members (fields, attributes) and methods (functions, routines)
class Product1 {
	// member fields
	private String productId = null;
	private String productName = null;
	// member functions
	public void displayDetails() {
		System.out.println(productId);
		System.out.println(productName);
	}

	public String getProductName() {
		return productName;
	}

	public void getProductId() {
		System.out.println("The Product Id is : " + productName);
	}
	
	public void setProductName(String productName) {
		if(! productName.startsWith("P")) {
			System.out.println("Invalid product name");
			return;
		}
		this.productName = productName;
	}
	public void setProductId(String productId) {
		if(productId.length() != 5) {
			System.out.println("Invalid product Id");
			return;
		}
		this.productId = productId;
	}
	
	// IP apply getter/setter for productName
}
