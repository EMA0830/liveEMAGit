package com.demo.spring.iocdi2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//for spring / configure Spring Beans
// configuration
@Configuration
public class AppConfig {
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	@Bean
	public DigitalPayment digitalPayment() {
		DigitalPayment digitalPayment = null;
		if(Math.random() > 0.5 ) {
			digitalPayment = new DigitalCreditPaymentImpl();
		}
		else {
			digitalPayment = new DigitalDebitPaymentImpl();
		}
		return digitalPayment;
	}
	
//	PaymentGatewayService paymentGatewayService = new PaymentGatwayServiceImpl();
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	@Bean
	public PaymentGatewayService paymentGatewayService() {
		PaymentGatewayServiceImpl paymentGatewayService = new PaymentGatewayServiceImpl();
//		Dependency Injection (DI) / digitalCreditPayment injected into the setter of paymentGatewayService
//		Setter Based Dependency Injection
		paymentGatewayService.setDigitalPayment(digitalPayment());
		return paymentGatewayService;
	}
}
