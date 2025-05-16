package com.myfirstsb.first;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(Double amount){
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
