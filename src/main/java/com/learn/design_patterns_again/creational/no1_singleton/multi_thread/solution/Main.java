package com.learn.design_patterns_again.creational.no1_singleton.multi_thread.solution;

public class Main {
    public static void main(String[] args) {
        UserThread userThread1 = new UserThread();
        userThread1.start();

        UserThread userThread2 = new UserThread();
        userThread2.start();

        // After executing this method we can see that only one single object is created for the entire application
    }
}

/**
 * note 3:
 *
 * Here we have created 2 threads.
 * when we run again and again it may call the new Person method.
 * that's the issue.
 *
 * The solution is we can modify the class that we want to be singleton as follows
 *   1. make the private variable volatile
 *   2. added the logic in synchronized block without synchronizing the whole getSatellite() method
 *
 */