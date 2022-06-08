package com.java8;

import java.io.File;

public interface FunctionalInterfaceEx {
	
}
// [Functional Interface type] FileFilter txtFileFilter 
// [Lambda expression] (pathname) -> pathname.getName().endsWith(".txt")
// Lambda exp assigned to functional interface.
//	FileFilter txtFileFilter = (pathname) -> pathname.getName().endsWith(".txt");

@FunctionalInterface
// contains only on abstract method
interface CFunctionalInterface {
	public abstract void test();
//	public abstract void test1();
}


@FunctionalInterface
interface SFileFilter {

    /**
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     *
     * @param  pathname  The abstract pathname to be tested
     * @return  <code>true</code> if and only if <code>pathname</code>
     *          should be included
     */
    boolean accept(File pathname);
}
