package com.learn.design_patterns_again.behavioural.no1_visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
