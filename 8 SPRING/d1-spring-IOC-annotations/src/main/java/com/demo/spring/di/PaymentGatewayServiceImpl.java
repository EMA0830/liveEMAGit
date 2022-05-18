package com.demo.spring.di;

public class PaymentGatewayServiceImpl implements PaymentGatewayService {
//	instance created
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	DigitalCreditPayment digitalCreditPayment;
	@Override
	public void creditPay() {
		digitalCreditPayment.payUsingCredit();
	}
}
