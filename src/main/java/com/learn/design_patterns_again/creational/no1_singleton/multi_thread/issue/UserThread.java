package com.learn.design_patterns_again.creational.no1_singleton.multi_thread.issue;

public class UserThread extends Thread{

    public void run(){
        for(int i=0; i < 5; i++ ){
            System.out.println("thread name: " + Thread.currentThread().getName() + "|" + Person.getPerson());
        }
    }
}
