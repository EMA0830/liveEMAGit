package com.demo.traditional;

public class PaymentGatewayServiceImpl implements PaymentGatewayService {
//	instance created
	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	@Override
	public void creditPay() {
		digitalCreditPayment.payUsingCredit();
	}
}
