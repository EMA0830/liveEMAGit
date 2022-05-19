package com.demo.oops;

public class AbstractionWithInterfaceEx {
	public static void main(String[] args) {
		abstractionWithInterface();
	}

	private static void abstractionWithInterface() {
		// create a reference for interface / abstract class
		NetBanking netBanking;
		// Cannot create instance / abstract class
//	netBanking = new NetBanking();
		netBanking = new SavingsAccount();
		netBanking.transferAmount();
	}
}

// Abstraction with interfaces
interface NetBanking {
	// abstract method without a body
	// all methods are abstract
//	public abstract void transferAmount();
	public void transferAmount();

	public void checkAccountBalance();
}

// class implements interface
class SavingsAccount implements NetBanking {
	@Override
	public void transferAmount() {
		System.out.println("Transfer amount from Savings Bank Account using NetBanking");
	}

	@Override
	public void checkAccountBalance() {
		System.out.println("Check balance amount from Savings Bank Account");
	}
}
