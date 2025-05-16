package com.myfirstsb.first;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(Double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
