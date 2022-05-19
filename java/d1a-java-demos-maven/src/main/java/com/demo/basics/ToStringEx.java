package com.demo.basics;

public class ToStringEx {
	public static void main(String[] args) {
		ProductModel productModel = new ProductModel("P001", "Wings of Fire", 50.50f);
//		productModel.displayDetails();
//		String productModelString = productModel.toString();
//		System.out.println(productModelString);
		System.err.println(productModel);
	}
}

//class ProductModel extends Object{
class ProductModel{
	// member fields
	private String productId;
	private String productName;
	private float price;

	// overloading : multiple methods with same name but different signature (no,
	// order, type of arguments)
	// default constructor
	public ProductModel() {
		productId = "P01";
		productName = "Laptop";
		price = 500.50f;
	}

	public ProductModel(String productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// member functions
	public void displayDetails() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
	}
	@Override
	public String toString() {
//		String productModelString = "Pid : " + productId + "\nName : " + productName + "\nPrice : " + price;
		String productModelString =  productId + "\t" + productName + "\t" + price;
		return productModelString;
	}
}
