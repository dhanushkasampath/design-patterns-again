package com.learn.design_patterns_again.behavioural.no3_chain_of_responsibility;

public class CreditCardPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Paid using credit card: $" + amount);
        } else {
            next.handlePayment(amount);// from here we have access to next variable in abstract class
        }
    }
}
