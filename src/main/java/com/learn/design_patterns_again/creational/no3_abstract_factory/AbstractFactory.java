package com.learn.design_patterns_again.creational.no3_abstract_factory;

public interface AbstractFactory {
    Profession getProfession(String type);//here type should be trainee or experienced
}
