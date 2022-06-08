package com.demo.oops;

public class AbstractionWithAbstractClassEx {
	public static void main(String[] args) {
		abstractionWithAbstractClass();
	}

	private static void abstractionWithAbstractClass() {
		// create a reference for interface / abstract class
//		Account account;
		// Cannot create instance / abstract class
//	account = new Account();
//		account = new SavingsAccount1();
		
		Account account = new SavingsAccount1();
		account.displayAccountInfo();
		account.displayBankDetails();
//		account.openFixedDeposit();
	}

}

abstract class Account {
	// Abstract classes represent abstract concepts of ideas.
	// abstract class can have abstract methods and concrete methods (methods with
	// body)
	public abstract void displayAccountInfo();

	public void displayBankDetails() {
		System.out.println("CITI Bank");
	}
}

// Inheritance - the derived class obtains variables and methods from the base class.
// class extends another class
class SavingsAccount1 extends Account {

	@Override
	public void displayAccountInfo() {
		System.out.println("Savings Account");
	}

//	public void openFixedDeposit() {
//		System.out.println("Open Fixed Deposit by Visiting the Bank");
//	}
}