package com.learn.design_patterns_again.creational.no2_factory;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("I'm a teacher");
    }
}
