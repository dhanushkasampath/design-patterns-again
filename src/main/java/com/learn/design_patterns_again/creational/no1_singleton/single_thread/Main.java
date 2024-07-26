package com.learn.design_patterns_again.creational.no1_singleton.single_thread;

public class Main {
    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        Person person3 = Person.getPerson();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}

/**
 *
 * note 1 :
 *
 * In the Person class we have created a private constructor.
 * So that a new object can not be created from other classes using the new keyword.
 *
 * So what we have done is, we have given a public method to return the person instance
 * if there is no already assigned object -> create a new object and return.
 * if there is an object -> return that object
 *
 * So in the calling method we can make sure it always get a unique object.
 * that can be confirmed by looking at the hashcode of the object. its unique even though we
 * created many instances using that public method.
 *
 *
 *
 * But this approach would not work when there is multiple threads associated.
 * we need a static block for that.
 *
 */