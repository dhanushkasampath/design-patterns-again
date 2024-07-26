package com.learn.design_patterns_again.creational.no1_singleton.multi_thread.solution;

public class Person {

    private static volatile Person person;

    private Person(){

    }

    public static Person getPerson(){
        if (person == null) {
            synchronized (Person.class) {
                person = new Person();
            }
        }
        return person;
    }
}
