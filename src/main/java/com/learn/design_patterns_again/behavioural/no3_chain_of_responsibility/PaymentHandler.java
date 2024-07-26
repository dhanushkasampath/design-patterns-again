package com.learn.design_patterns_again.behavioural.no3_chain_of_responsibility;

/**
 * note 1:
 *
 * Creating an abstract method. So we can have both complete and incomplete members
 */
public abstract class PaymentHandler {

    // Protected access modifier says that this variable can only be access within the same package and subclasses of this class
    protected PaymentHandler next;

    // This is a complete method. no need to override this in implementation classes
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    // This is the incomplete class that should implement the particular responsibility
    public abstract void handlePayment(double amount);
}
