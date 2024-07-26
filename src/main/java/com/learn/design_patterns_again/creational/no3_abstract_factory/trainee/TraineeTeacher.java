package com.learn.design_patterns_again.creational.no3_abstract_factory.trainee;

import com.learn.design_patterns_again.creational.no3_abstract_factory.Profession;

public class TraineeTeacher implements Profession {
    @Override
    public void print() {
        System.out.println("I'm an Teacher");
    }
}
