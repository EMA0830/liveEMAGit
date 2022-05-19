package com.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
//	An representation of file and directory pathnames
		File file = new File("message.txt");
//	A FileInputStream obtains input bytes from a file in a file system. 
//		Checked Exception (compile force checks) : Developer can handle it.
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			String messageString = "James Gosling invented Java.\r\nJava is amazing and it helps us in our career.";
//			string > byte array
			byte [] stringInBytes = messageString.getBytes();
//			write a byte of data from this input stream
			fileOutputStream.write(stringInBytes);
			fileOutputStream.flush();
			fileOutputStream.close();
			System.out.println("I've completed....");
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Sir/Mam, please check if the file is in place....");
			System.err.println(fileNotFoundException);
		} catch (IOException ioException) {
			System.out.println("Sir/Mam, please ensure the file is not corrupt....");
			System.err.println(ioException);
		}
	}
}

