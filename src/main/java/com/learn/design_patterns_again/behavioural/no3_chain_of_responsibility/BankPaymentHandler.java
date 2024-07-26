package com.learn.design_patterns_again.behavioural.no3_chain_of_responsibility;

public class BankPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Paid using bank account: $" + amount);
        } else {
            next.handlePayment(amount);// from here we have access to next variable in abstract class
        }
    }
}
