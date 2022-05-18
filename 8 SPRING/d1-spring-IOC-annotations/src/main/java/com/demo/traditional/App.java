package com.demo.traditional;


public class App 
{
    public static void main( String[] args )
    {
       PaymentGatewayService paymentGatewayService = new PaymentGatewayServiceImpl();
       paymentGatewayService.creditPay();
    }
}
