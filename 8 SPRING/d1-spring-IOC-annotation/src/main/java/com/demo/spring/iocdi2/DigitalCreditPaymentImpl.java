package com.demo.spring.iocdi2;

public class DigitalCreditPaymentImpl implements DigitalPayment {

	@Override
	public  void pay() {
		System.err.println("Digital Pay using Credit");
	}
}
