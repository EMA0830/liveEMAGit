package com.demo.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.traditional.PaymentGatewayService;
import com.demo.traditional.PaymentGatewayServiceImpl;
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
		PaymentGatewayService paymentGatewayService = new PaymentGatewayServiceImpl();
		return paymentGatewayService;
	}
}
