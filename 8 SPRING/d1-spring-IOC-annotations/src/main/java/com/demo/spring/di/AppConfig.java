package com.demo.spring.di;

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
		paymentGatewayService.setDigitalCreditPayment(digitalCreditPayment());
		return paymentGatewayService;
	}
}
