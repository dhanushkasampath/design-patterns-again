package com.learn.design_patterns_again.creational.no3_abstract_factory.experienced;

import com.learn.design_patterns_again.creational.no3_abstract_factory.Profession;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("I'm a Teacher");
    }
}
