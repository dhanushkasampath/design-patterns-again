package com.learn.design_patterns_again.creational.no1_singleton.multi_thread.issue;

public class Person {

    private static Person person;

    private Person(){

    }

    public static Person getPerson(){
        if (person == null) {
            person = new Person();
        }
        return person;
    }
}
