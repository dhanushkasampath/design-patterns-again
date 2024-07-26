package com.learn.design_patterns_again.creational.no3_abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.print();
    }
}
