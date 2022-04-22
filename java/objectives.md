:dart: **Optimize the Code Using Lambda Expressions and Functional Interfaces**  


`From Java 8, lambda expressions allows to treat functionality also as an argument to a method and therefore pass code as parameter. Reducing the amount of code is one of the main advantage of implemeting a lambda expression. Learn how to reduce the lines of code by applying lambda expressions for the functions that are used not more than once.

:writing_hand: **_versions of java_**  
- java 5, java 7, java 8, java 11, java 17
- https://en.wikipedia.org/wiki/Java_version_history

:book: **java 8 featrues**

:writing_hand: **_Lambda Expressions and Functional Interfaces_**  
- treat functionality as an argument to a method
-  pass code as parameter
  
:heavy_plus_sign: **Advantages** 
- Reducing the amount of code

:rocket: **Activity**  

reduce the lines of code by applying lambda expressions for the functions that are used not more than once.

:bulb: sytax science

```java
// anonymous class
FileFilter txtFileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		}
```
```java
// lambda expression
FileFilter txtFileFilter = (File pathname) -> {pathname.getName().endsWith(".txt")};
FileFilter txtFileFilter = (File pathname) -> pathname.getName().endsWith(".txt");
```
