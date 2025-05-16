package com.myfirstsb.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstApplication.class, args);
        var orderService = context.getBean(OrderService.class);
//        var orderService = new OrderService(new StripePaymentService());
//
//        orderService.placeOrder();
//
//        var orderServiceForPaypal = new OrderService(new PaypalPaymentService());
        orderService.placeOrder();
    }

}

