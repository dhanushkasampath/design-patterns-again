package com.learn.design_patterns_again.behavioural.no2_template;

public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

/**
 * note 1:
 *
 * There is an abstract class. it contains incomplete methods.
 * Also there is a complete method which call the incomplete methods in a particular order
 *
 * When a particular class(A) extend this abstract class, it has to provide implementation for these incomplete methods.
 *
 * Then at the main method we create an object of A and call the complete method that got inherited by abstract class.
 * Then that will execute in the order defined with the help of implementation provided by class A
 *
 */