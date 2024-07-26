package com.learn.design_patterns_again.creational.no2_factory;

public class Main {

    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession profession = professionFactory.getProfession("Doctor");
        profession.print();
    }
}

