package com.learn.design_patterns_again.behavioural.no3_chain_of_responsibility;

public class PaypalPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
//        if (amount >= 1500) {
//            System.out.println("Paid using paypal: $" + amount);
//        } else {
//            next.handlePayment(amount);// from here we have access to next variable in abstract class
//        }

        //Since this is the last option we just handle it
        System.out.println("Paid using paypal: $" + amount);
    }
}
