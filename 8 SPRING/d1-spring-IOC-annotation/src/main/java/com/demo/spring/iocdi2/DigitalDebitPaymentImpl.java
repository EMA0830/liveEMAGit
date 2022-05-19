package com.demo.spring.iocdi2;

public class DigitalDebitPaymentImpl implements DigitalPayment {

	@Override
	public  void pay() {
		System.err.println("Digital Pay using Debit");
	}
}
