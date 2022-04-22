package com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	public static void main(String[] args) {
		System.out.println("");
		method();
	}

	private static void method() {
		System.out.println("");
//		int test = 100/0;
//		An representation of file and directory pathnames
		File file = new File("wisdom.txt");
		FileReader fileReader = null;
		try {
//			Writes text to character files 
			fileReader = new FileReader(file);
		} catch (IOException exception) {
			System.err.println(">>>>  " + exception);
		}
//		Creates a buffered character-output stream 
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
//			int test = 100/0;			
			String quoteString = null;
//			while (true) {
//				quoteString = bufferedReader.readLine();
//				if (quoteString == null) {
//					break;
//				} else {
//					System.out.println(quoteString);
//				}
//			};	
//	COMPACT CODE		
			while((quoteString =  bufferedReader.readLine()) != null) {
				System.out.println(quoteString);
			}
		} catch (IOException exception) {
			System.err.println(">>>>  " + exception);
		} finally {
//	clean up operations like closing database connections, files.
			System.out.println(">>>> clean up");
			if (fileReader != null) {
//				many lines of code.....
				try {
					fileReader.close();
				} catch (IOException exception) {
					System.err.println(">>>> closing file " + exception);
				}
//				many lines of code.....
			}
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException exception) {
					System.err.println(">>>> closing file " + exception);
				}
			}
		}
	}

}
