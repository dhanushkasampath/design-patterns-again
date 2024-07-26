package com.learn.design_patterns_again.behavioural.no3_chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PaypalPaymentHandler();

        // here making the connection between object
        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        // we initiate the request flow from bank.
        bank.handlePayment(600);
        bank.handlePayment(1200);
        bank.handlePayment(1800);
        bank.handlePayment(60000);
    }
}
