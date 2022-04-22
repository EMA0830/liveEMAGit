package com.demo.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.demo.model.ProductModel;

public class ObjectInputStreamEx2 {

	public static void main(String[] args) {// An representation of file and directory pathnames
		File file = new File("products.dat");
		try {
			// write bytes to a file
			FileInputStream fileInputStream = new FileInputStream(file);
			// write an object to a file
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			// Read an object from the ObjectInputStream
			// Nested try catch
			while (true) {
				try {
					Object object = objectInputStream.readObject();
					// access model by downcasting
					ProductModel productModel = (ProductModel) object;
					productModel.displayDetails();
				} catch (EOFException eofException) {
//					System.out.println("End of File");
					break;
				} catch (ClassNotFoundException e) {
					System.out.println(" ClassNotFoundException ");
					break;
				}
			}
			objectInputStream.close();

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Sir/Mam, please check if the file is in place....");
			System.err.println(fileNotFoundException);
		} catch (IOException ioException) {
			System.out.println("Sir/Mam, please ensure the object is serializable or file is not corrupt....");
			System.err.println(ioException);
		}
	}
}
