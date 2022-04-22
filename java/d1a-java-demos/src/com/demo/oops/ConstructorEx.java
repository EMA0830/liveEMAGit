package com.demo.oops;

public class ConstructorEx {
	public static void main(String[] args) {
		// The new keyword creates an instance
		// Product() is the constructor
		// Default constructor has no parameters
		// The constructor is called automatically 
		Product product = new Product();
		product.displayDetails();

//	err cannot invoke constructor explicitly
//		product.Product();
		// parameterized cons
		Product product1 = new Product("P02", "Mobile");
		product1.displayDetails();
	}
}

//Classes encapsulate data members (fields, attributes) and methods (functions, routines)
class Product {
	// member fields
	private String productId;
	private String productName;

	// overloading : multiple methods with same name but different signature (no,
	// order, type of arguments)
	// default constructor
	public  Product() {
		productId = "P01";
		productName = "Laptop";
	}
//	err
//	public void Product() {
//		productId = "P01";
//		productName = "Laptop";
//	}

	// default constructor
	public Product(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

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
		if (!productName.startsWith("P")) {
			System.out.println("Invalid product name");
			return;
		}
		this.productName = productName;
	}

	public void setProductId(String productId) {
		if (productId.length() != 5) {
			System.out.println("Invalid product Id");
			return;
		}
		this.productId = productId;
	}

	// IP apply getter/setter for productName
}
