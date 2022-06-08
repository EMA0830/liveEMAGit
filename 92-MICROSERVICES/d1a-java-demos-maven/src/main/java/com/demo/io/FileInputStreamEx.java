package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
//	An representation of file and directory pathnames
		File file = new File("message.txt");
//	A FileInputStream obtains input bytes from a file in a file system. 
//		Checked Exception (compile force checks) : Developer can handle it.
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
//			Reads a byte of data from this input stream
			int byteVal = fileInputStream.read();
// 	 -1 if the end of the file is reached
			while (byteVal !=-1) {
//				System.out.print(byteVal);
//				Type mismatch: cannot convert from int to char
//				char charVal = byteVal;
//			do a type casting
				char charVal = (char)byteVal;
				byteVal = fileInputStream.read();
				System.err.print(charVal);
			}
			fileInputStream.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Sir/Mam, please check if the file is in place....");
			System.err.println(fileNotFoundException);
		} catch (IOException ioException) {
			System.out.println("Sir/Mam, please ensure the file is not corrupt....");
			System.err.println(ioException);
		}
	}
}
