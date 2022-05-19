package com.demo.spring.iocdi;

public class DigitalCreditPaymentImpl implements DigitalCreditPayment {

	@Override
	public  void payUsingCredit() {
		System.err.println("Digital Pay using Credit");
	}
}
