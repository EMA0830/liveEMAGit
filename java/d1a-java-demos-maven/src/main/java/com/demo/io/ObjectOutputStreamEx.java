package com.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.demo.model.ProductModel;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {// An representation of file and directory pathnames
		File file = new File("products.dat");
		try {
			// write bytes to a file
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			// write an object to a file
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			// create model
			ProductModel productModel = new ProductModel("P001", "Wings of Fire", 50.50f);
			// write / serializing the object
			Object productModelObject = productModel;
			objectOutputStream.writeObject(productModelObject);
			
			//XP
//			int i = 100; //primitive
//			Integer integer = i; // primitive to wrapper (auto boxing)
//			int i1 = integer; // unboxing
//			// boxing : primitive to wrapper
//			// unboxing : wrapper to primitive
//			Object object = integer; // wrapper to object
//			objectOutputStream.writeObject(object); // object is written
			
			productModel = new ProductModel("P002", "Start with Why?", 30.50f);
			objectOutputStream.writeObject(productModel);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Sir/Mam, please check if the file is in place....");
			System.err.println(fileNotFoundException);
		} catch (IOException ioException) {
			System.out.println("Sir/Mam, please ensure the object is serializable or file is not corrupt....");
			System.err.println(ioException);
		}
	}
}
