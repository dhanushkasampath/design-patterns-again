package com.learn.design_patterns_again.behavioural.no1_visitor;

public class Computer implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
