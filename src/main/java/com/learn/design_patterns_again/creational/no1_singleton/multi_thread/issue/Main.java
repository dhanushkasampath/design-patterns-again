package com.learn.design_patterns_again.creational.no1_singleton.multi_thread.issue;

public class Main {
    public static void main(String[] args) {
        UserThread userThread1 = new UserThread();
        userThread1.start();

        UserThread userThread2 = new UserThread();
        userThread2.start();
    }
}

/**
 *
 * note 2:
 *
 * Here we have created 2 threads.
 * when we run again and again it may call the new Person method.
 * that's the issue.
 *
 */