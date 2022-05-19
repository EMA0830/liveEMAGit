package com.demo.spring.iocdi2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{	
    public static void main( String[] args )
    {
       PaymentGatewayService paymentGatewayServiceBean = null;
       AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
       paymentGatewayServiceBean = (PaymentGatewayService)applicationContext.getBean("paymentGatewayService");
       paymentGatewayServiceBean.pay();
    }
}
