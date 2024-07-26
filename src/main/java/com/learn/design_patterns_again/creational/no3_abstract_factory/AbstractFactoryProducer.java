package com.learn.design_patterns_again.creational.no3_abstract_factory;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeProfessionFactory();
        } else {
            return new ExperiencedProfessionFactory();
        }
    }
}
