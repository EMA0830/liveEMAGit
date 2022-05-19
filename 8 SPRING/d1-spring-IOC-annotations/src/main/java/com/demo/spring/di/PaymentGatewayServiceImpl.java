package com.demo.spring.di;

public class PaymentGatewayServiceImpl implements PaymentGatewayService {
//	instance created
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	DigitalCreditPayment digitalCreditPayment;
	public void setDigitalCreditPayment(DigitalCreditPayment digitalCreditPayment) {
		this.digitalCreditPayment = digitalCreditPayment;
	}
	@Override
	public void creditPay() {
		digitalCreditPayment.payUsingCredit();
	}
}
