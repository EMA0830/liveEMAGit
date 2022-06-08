package com.demo.collection;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		
		//research
//		Stack<Exception> methodCallStack = new Stack<>();
//		methodCallStack.add(new Exception());
//		methodCallStack.add(new RuntimeException());
//		methodCallStack.add(NonWritableChannelException );
//		methodCallStack.add("controller");
//		methodCallStack.add("service");
//		methodCallStack.add("rep");
		
		Stack<String> methodCallStack = new Stack<>();
		methodCallStack.add("main 1");
		methodCallStack.add("controller 2");
		methodCallStack.add("service 3");
		methodCallStack.add("rep 4");
		System.out.println(methodCallStack);
		System.out.println(methodCallStack.search("rep 4"));
		System.out.println(methodCallStack.search("controller 2"));
		System.out.println(methodCallStack.pop());
		System.out.println(methodCallStack);
		

		System.out.println(methodCallStack.peek());	
		System.out.println(methodCallStack.peek());	
		System.out.println(methodCallStack);
		while(!methodCallStack.empty()) {
			String methodString = methodCallStack.pop();
			System.out.println(methodString);
		}
		
		System.out.println(methodCallStack);
		
		methodCallStack.add("main");
		methodCallStack.add("controller");
		methodCallStack.add("service");
		methodCallStack.add("rep");
		

	}
}
