package com.learn.design_patterns_again.behavioural.no2_template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game started");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game ended");
    }
}
