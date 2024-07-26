package com.learn.design_patterns_again.creational.no4_builder;

/**
 *
 * note 2:
 * The Builder Design Pattern is a creational pattern that allows for the step-by-step
 * construction of complex objects. It separates the construction of a complex object from
 * its representation so that the same construction process can create different representations.
 *
 */
public class Main {
    public static void main(String[] args) {
        Phone phone=new PhoneBuilder()
            .os("Android")
            .ram(512)
            .build();//here we have only passed the objects we want.
        System.out.print(phone);
    }
}

//? Does builder pattern and requiredArgsConstructor same