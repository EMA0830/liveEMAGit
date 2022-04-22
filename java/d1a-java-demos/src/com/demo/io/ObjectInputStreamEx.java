package com.demo.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.demo.model.ProductModel;

public class ObjectInputStreamEx {

	public static void main(String[] args) {// An representation of file and directory pathnames
		File file = new File("products.dat");
		try {
			// write bytes to a file
			FileInputStream fileInputStream = new FileInputStream(file);
			// write an object to a file
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			// Read an object from the ObjectInputStream
			Object object = objectInputStream.readObject();
			// access model by downcasting
			ProductModel productModel = (ProductModel) object;
			productModel.displayDetails();

			object = objectInputStream.readObject();
			productModel = (ProductModel) object;
			productModel.displayDetails();

			object = objectInputStream.readObject();
			productModel = (ProductModel) object;
			productModel.displayDetails();

			objectInputStream.close();

		} catch (EOFException eofException) {
			System.out.println(
					"Sir/Mam, please ensure that you have more objects and are not at the end of the file....");
//			System.out.println(eofException);
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Sir/Mam, please check if the file is in place....");
			System.err.println(fileNotFoundException);
		} catch (IOException ioException) {
			System.out.println("Sir/Mam, please ensure the object is serializable or file is not corrupt....");
			System.err.println(ioException);
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println(classNotFoundException);
		}

	}
}
