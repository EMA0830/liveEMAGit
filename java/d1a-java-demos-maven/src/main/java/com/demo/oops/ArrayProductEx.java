package com.demo.oops;

import com.demo.model.ProductModel;

public class ArrayProductEx {
	public static void main(String[] args) {
		ProductModel[] productModels = new ProductModel[2];
		productModels[0] = new ProductModel("P01", "Laptop", 50);
		productModels[1] = new ProductModel("P02", "Desktop", 100);
		
		ProductStore productStore = new ProductStore("PS01", "PREG1", productModels);
		float discountedPrice = productStore.calculateDiscount(productModels[0], 10);
		System.out.println(discountedPrice);
		discountedPrice = productStore.calculateDiscount(productModels[1], 10);
		System.out.println(discountedPrice);
	}
}

class ProductStore {
	String productStoreName;
	String productStoreRegistrationId;
	ProductModel[] productModels;

	public ProductStore(String productStoreName, String productStoreRegistrationId, ProductModel[] productModels) {
//	super();
		this.productStoreName = productStoreName;
		this.productStoreRegistrationId = productStoreRegistrationId;
		this.productModels = productModels;
	}

	// Function to calculate the discount for a genre of books
	public float calculateDiscount(ProductModel productModel, float discountPercentage) {
		return productModel.getPrice() - (productModel.getPrice() * discountPercentage / 100);
	}
}