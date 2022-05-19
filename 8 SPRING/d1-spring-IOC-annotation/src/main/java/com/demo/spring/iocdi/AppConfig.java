package com.demo.spring.iocdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//for spring / configure Spring Beans
// configuration
@Configuration
public class AppConfig {
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	@Bean
	public DigitalCreditPayment digitalCreditPayment() {
		DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
		return digitalCreditPayment;
	}
	
//	PaymentGatewayService paymentGatewayService = new PaymentGatwayServiceImpl();
//	DigitalCreditPayment digitalCreditPayment = new DigitalCreditPaymentImpl();
	@Bean
	public PaymentGatewayService paymentGatewayService() {
		PaymentGatewayServiceImpl paymentGatewayService = new PaymentGatewayServiceImpl();
//		Dependency Injection (DI) / digitalCreditPayment injected into the setter of paymentGatewayService
//		Setter Based Dependency Injection
		paymentGatewayService.setDigitalCreditPayment(digitalCreditPayment());
		return paymentGatewayService;
	}
}
