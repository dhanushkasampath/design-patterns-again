package com.learn.design_patterns_again.behavioural.no2_template;

public class Main {
    public static void main(String[] args) {
        Game cicketGame = new Cricket();
        cicketGame.play();

        System.out.println();

        Game footBallGame = new FootBall();
        footBallGame.play();
    }

}
