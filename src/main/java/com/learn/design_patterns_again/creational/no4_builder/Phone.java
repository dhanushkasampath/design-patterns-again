package com.learn.design_patterns_again.creational.no4_builder;

public class Phone {
    private final String os;
    private final int ram;
    private final String processor;
    private final double screenSize;
    private final int battery;

    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        super();
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
                + ", battery=" + battery + "]";
    }
}
