package com.learn.design_patterns_again.behavioural.no2_template;

public class FootBall extends Game {
    @Override
    void initialize() {
        System.out.println("FootBall game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("FootBall game started");
    }

    @Override
    void endPlay() {
        System.out.println("FootBall game ended");
    }
}

/**
 * note 2:
 *
 * This class has extended the abstract class Game.
 * So it has to implement all the abstract methods.
 */