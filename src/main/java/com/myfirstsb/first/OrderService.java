package com.myfirstsb.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
@Scope(value = "prototype") // will create an object every time you call for it; if this code is not
                            // included the object will be created pre-hand
public class OrderService {
    private PaymentService paymentService;

    // public OrderService(PaymentService paymentService, int x){}
    //
    // @Autowired // Autowired if multiple constructors
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10.0);
    }

    // public void setPaymentService(PaymentService paymentService) {
    // this.paymentService = paymentService;
    // }

}
