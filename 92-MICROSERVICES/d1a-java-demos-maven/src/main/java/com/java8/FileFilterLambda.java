package com.java8;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
	public static void main(String[] args) {
		System.out.println("");
//		java7Way();
//		java7WayUsingAnonymousClass();
		useLambdaExpression();
	}

	private static void java7Way() {
		// files ending .java
		System.out.println("");
//		An representation of file and directory pathnames
		File directoryFile = new File(
				"C:\\Users\\Enzo\\Desktop\\liveJFSW\\liveJFSWGit\\java\\d1a-java-demos\\src\\com\\demo\\exceptions");
//		list file in dir
//		JavaFileFilter javaFileFilter = new JavaFileFilter();
		// filter out files ending with .java
//		File[] files = directoryFile.listFiles(javaFileFilter);
		File[] files = directoryFile.listFiles(new JavaFileFilter());
		// iterate through the files
		for (File file : files) {
			System.out.println(file.getName());
		}
	}

	private static void java7WayUsingAnonymousClass() {
		// files ending .java
		System.out.println("");
//		An representation of file and directory pathnames
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\liveJFSW\\liveJFSWGit\\java\\d1a-java-demos");
//		list file in dir
//		CFileFilter cFileFilter = new CFileFilter();
		// filter out files ending with .java
//		File[] files = directoryFile.listFiles(cFileFilter);
// syntax 1
//		anonymous class
//		FileFilter txtFileFilter = new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".txt");
//			}
//		};
//		File[] files = directoryFile.listFiles( txtFileFilter);

//	syntax 3
		File[] files = directoryFile.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});
		// iterate through the files
		for (File file : files) {
			System.out.println(file.getName());
		}
	}

	private static void useLambdaExpression() {
		// files ending .java
		System.out.println("");
//		An representation of file and directory pathnames
		File directoryFile = new File("C:\\Users\\Enzo\\Desktop\\liveJFSW\\liveJFSWGit\\java\\d1a-java-demos");
// syntax 1 
//		FileFilter txtFileFilter = (File pathname) -> {
//			return pathname.getName().endsWith(".txt");
//		};
//		File[] files = directoryFile.listFiles(txtFileFilter);

// syntax 2
//		FileFilter txtFileFilter = (pathname) -> pathname.getName().endsWith(".txt");
//		File[] files = directoryFile.listFiles(txtFileFilter);
//
//		// iterate through the files
//		for (File file : files) {
//			System.out.println(file.getName());
//		}

//	syntax 3
//		File[] files = directoryFile.listFiles((pathname) -> pathname.getName().endsWith(".txt"));
//		// iterate through the files
//		for (File file : files) {
//			System.out.println(file.getName());
//		}	

//		syntax 4
		// iterate through the files
		for (File file : directoryFile.listFiles((pathname) -> pathname.getName().endsWith(".dat"))) {
			System.out.println(file.getName());
		}
	}
}

// Functional Interface has 1 abstract method
class JavaFileFilter implements FileFilter {
	// true for files ending with .java
	@Override
	public boolean accept(File pathname) {
		return pathname.getName().endsWith(".java");
	}
}