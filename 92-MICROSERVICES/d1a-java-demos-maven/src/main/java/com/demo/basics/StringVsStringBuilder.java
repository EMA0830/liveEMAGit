package com.demo.basics;
// PERFORMANCE
public class StringVsStringBuilder {
	 public static void main(String[] args)
	    {
	        long now = System.currentTimeMillis();
	        slow();
	        System.out.println("slow elapsed " + (System.currentTimeMillis() - now) + " ms");

	        now = System.currentTimeMillis();
	        fast();
	        System.out.println("fast elapsed " + (System.currentTimeMillis() - now) + " ms");
	    }

	    private static void fast()
	    {
	        StringBuilder s = new StringBuilder();
	        for(int i=0;i<100000;i++)
	            s.append("*");      
	    }

	    private static void slow()
	    {
	    	//String is immutable
	        String s = "";
	        for(int i=0;i<100000;i++)
	            s+="*";
	    }
}
