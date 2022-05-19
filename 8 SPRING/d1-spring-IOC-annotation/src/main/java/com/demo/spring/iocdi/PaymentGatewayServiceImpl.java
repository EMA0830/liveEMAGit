package com.demo.spring.iocdi;

public class PaymentGatewayServiceImpl implements PaymentGatewayService {
//	instance created
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
//	Inversion of Control / Dependency Injection 
//	Spring Framework takes care of providing the dependency
	DigitalCreditPayment digitalCreditPayment;
	public void setDigitalCreditPayment(DigitalCreditPayment digitalCreditPayment) {
		this.digitalCreditPayment = digitalCreditPayment;
	}
	@Override
	public void creditPay() {
		digitalCreditPayment.payUsingCredit();
	}
}
