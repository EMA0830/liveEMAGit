:beginner: _**BASICS**_  

- Explain JDK, JRE and JVM?

JDK|	JRE |	JVM
|-|-|-|
It stands for Java Development Kit.	|It stands for Java Runtime Environment.|	It stands for Java Virtual Machine.
It is the tool necessary to compile, document and package Java programs.|	JRE refers to a runtime environment in which Java bytecode can be executed.|	It is an abstract machine.| It is a specification that provides a run-time environment in which Java bytecode can be executed.
It contains JRE + development tools.	|It’s an implementation of the JVM which physically exists. |	JVM follows three notations: Specification, Implementation, and Runtime Instance.

- Explain public static void main(String args[]) in Java.
  
main() in Java is the entry point for any Java program. It is always written as public static void main(String[] args)
public: Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.
static: It is a keyword in java which identifies it is class-based. main() is made static in Java so that it can be accessed without creating the instance of a Class. In case, main is not made static then the compiler will throw an error as main() is called by the JVM before any objects are made and only static methods can be directly invoked via the class. 
void: It is the return type of the method. Void defines the method which will not return any value.
main: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.
String args[]: It is the parameter passed to the main method.

- Why Java is platform independent?
  
Java is called platform independent because of its byte codes which can run on any system irrespective of its underlying operating system.

- Why Java is not 100% Object-oriented?

Java is not 100% Object-oriented because it makes use of eight primitive data types such as boolean, byte, char, int, float, double, long, short which are not objects.

- What are wrapper classes in Java?

Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class. Refer to the below image which displays different primitive type, wrapper class and constructor argument.


- What are constructors in Java?
In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created.

There are two types of constructors:

Default Constructor: In Java, a default constructor is the one which does not take any inputs. In other words, default constructors are the no argument constructors which will be created by default in case you no other constructor is defined by the user. Its main purpose is to initialize the instance variables with the default values. Also, it is majorly used for object creation. 

Parameterized Constructor: The parameterized constructor in Java, is the constructor which is capable of initializing the instance variables with the provided values. In other words, the constructors which take the arguments are called parameterized constructors.

- What is the difference between equals() and == in Java?
Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.

“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects.

- When can you use the super keyword?
  
In Java, the super keyword is a reference variable that refers to an immediate parent class object.
When you create a subclass instance, you’re also creating an instance of the parent class, which is referenced to by the super reference variable.

The uses of the Java super Keyword are- 

To refer to an immediate parent class instance variable, use super.
The keyword super can be used to call the method of an immediate parent class.
Super() can be used to call the constructor of the immediate parent class.

- Can you call a constructor of a class inside another constructor?

Yes, we can call a constructor of a class inside another constructor. This is also called as constructor chaining. Constructor chaining can be done in 2 ways-

Within the same class: For constructors in the same class, the this() keyword can be used.
From the base class: The super() keyword is used to call the constructor from the base class.
The constructor chaining follows the process of inheritance. The constructor of the sub class first calls the constructor of the super class. Due to this, the creation of sub class’s object starts with the initialization of the data members of the super class. The constructor chaining works similarly with any number of classes. Every constructor keeps calling the chain till the top of the chain.

- Contiguous memory locations are usually used for storing actual values in an array but not in ArrayList. Explain.

An array generally contains elements of the primitive data types such as int, float, etc. In such cases, the array directly stores these elements at contiguous memory locations. While an ArrayList does not contain primitive data types. An arrayList contains the reference of the objects at different memory locations instead of the object itself. That is why the objects are not stored at contiguous memory locations.

- How is the creation of a String using new() different from that of a literal?
When we create a string using new(), a new object is created. Whereas, if we create a string using the string literal syntax, it may return an already existing object with the same name.

- Define a Java Class.
A class in Java is a blueprint which includes all your data.  A class contains fields (variables) and methods to describe the behavior of an object. Let’s have a look at the syntax of a class.

class Abc {
member variables // class body
methods}

-  What is an object in Java and how is it created?
An object is a real-world entity that has a state and behavior. An object has three characteristics:

      State
      Behavior
      Identity
An object is created using the ‘new’ keyword. For example:

ClassName obj = new ClassName();

- What is Object Oriented Programming?
Object-oriented programming or popularly known as OOPs is a programming model or approach where the programs are organized around objects rather than logic and functions. In other words, OOP mainly focuses on the objects that are required to be manipulated instead of logic. This approach is ideal for the programs large and complex codes and needs to be actively updated or maintained.

- What are the main concepts of OOPs in Java?
Object-Oriented Programming or OOPs is a programming style that is associated with concepts like:

Inheritance: Inheritance is a process where one class acquires the properties of another.
Encapsulation: Encapsulation in Java is a mechanism of wrapping up the data and code together as a single unit.
Abstraction: Abstraction is the methodology of hiding the implementation details from the user and only providing the functionality to the users. 
Polymorphism: Polymorphism is the ability of a variable, function or object to take multiple forms.

- Differentiate between the constructors and methods in Java?

| Methods	 | Constructors |
|-|-|
| Used to represent the behavior of an object	| Used to initialize the state of an object |
| Must have a return type	| Do not have any return type
| Needs to be invoked explicitly	| Is invoked implicitly
| No default method is provided by the compiler	| A default constructor is provided by the compiler if the class has none
| Method name may or may not be same as class name	| Constructor name must always be the same as the class name

- What is final keyword in Java?
final is a special keyword in Java that is used as a non-access modifier. A final variable can be used in different contexts such as:

final variable
When the final keyword is used with a variable then its value can’t be changed once assigned. In case the no value has been assigned to the final variable then using only the class constructor a value can be assigned to it.
final method
When a method is declared final then it can’t be overridden by the inheriting class.

final class
When a class is declared as final in Java, it can’t be extended by any subclass class but it can extend other class.

- What is the difference between break and continue statements?
	continue

| break | continue |
|-|-|
| Can be used in switch and loop (for, while, do while) statements	| Can be only used with loop statements | 
| It causes the switch or loop statements to terminate the moment it is executed	| It doesn’t terminate the loop but causes the loop to jump to the next iteration
| It terminates the innermost enclosing loop or switch immediately	| A continue within a loop nested with a switch will cause the next loop iteration to execute

- What is the difference between this() and super() in Java?
In Java, super() and this(), both are special keywords that are used to call the constructor. 

| this() | super() |
|-|-|	
| this() represents the current instance of a class	| super() represents the current instance of a parent/base class
| Used to call the default constructor of the same class	| Used to call the default constructor of the parent/base class |
| Used to access methods of the current class	| Used to access methods of the base class
  Used for pointing the current class instance	| Used for pointing the superclass instance
| Must be the first line of a block	| Must be the first line of a block
