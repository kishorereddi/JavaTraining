package com.training.week6.threads;

public class YieldDemo {
    public static void main(String[] args) {
        YieldThread thread = new YieldThread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

class YieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.yield();
            System.out.println("YieldedThread : " + i);
        }
    }
}
