package com.learn.design_patterns_again.creational.no4_builder;

public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder os(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }
    public PhoneBuilder processor(String processor) {
        this.processor = processor;
        return this;
    }
    public PhoneBuilder screenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    public PhoneBuilder battery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone build() {
        return new Phone(os,ram,processor,screenSize,battery);
    }
}

/**
 * note 1
 * Here what have done is initialized the features of the phone.
 * have setter methods with PhoneBuilder return type.
 *
 * finally created a getPhone() method to return a phone object.
 */