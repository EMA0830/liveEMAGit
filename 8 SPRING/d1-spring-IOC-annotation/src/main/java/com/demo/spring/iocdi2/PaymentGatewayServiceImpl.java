package com.demo.spring.iocdi2;

public class PaymentGatewayServiceImpl implements PaymentGatewayService {
//	instance created
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
//	Inversion of Control / Dependency Injection 
//	Spring Framework takes care of providing the dependency
	DigitalPayment digitalPayment;
	public void setDigitalPayment(DigitalPayment digitalCreditPayment) {
		this.digitalPayment = digitalCreditPayment;
	}
	@Override
	public void pay() {
		digitalPayment.pay();
	}
}
