package com.demo.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) {
		System.out.println("");
		method();
	}

	private static void method() {
		System.out.println("");
//		An representation of file and directory pathnames
		File file = new File("wisdom.txt");
		FileWriter fileWriter = null;
		try {
//			Writes text to character files 
			fileWriter = new FileWriter(file);
		} catch (IOException exception) {
			System.err.println(">>>>  " + exception);
		}
//		Creates a buffered character-output stream 
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		try {
			bufferedWriter.write("Anything that can go wrong will go wrong.\r\n");
			bufferedWriter.write("Good karma comes back to you, bad karma stays with you....");
//			good practice
			bufferedWriter.flush();
//			fileWriter = null;
		} catch (IOException exception) {
			System.err.println(">>>>  " + exception);
		} finally {
//	clean up operations like closing database connections, files.
			System.out.println(">>>> clean up");
			if (fileWriter != null) {
//				many lines of code.....
				try {
					fileWriter.close();
				} catch (IOException exception) {
					System.err.println(">>>> closing file " + exception);
				}
//				many lines of code.....
			}
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException exception) {
					System.err.println(">>>> closing file " + exception);
				}
			}
		}
	}

}
