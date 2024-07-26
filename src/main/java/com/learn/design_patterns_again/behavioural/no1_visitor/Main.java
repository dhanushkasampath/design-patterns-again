package com.learn.design_patterns_again.behavioural.no1_visitor;

public class Main {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
