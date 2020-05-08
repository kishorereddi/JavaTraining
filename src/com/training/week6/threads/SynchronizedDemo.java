package com.training.week6.threads;

class Display {
    public synchronized void wish(String name) {
        for(int i=0; i<10; i++) {
            System.out.println("Hello : " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThreadSynchronized extends Thread {
    Display display;
    String name;
    MyThreadSynchronized(Display display, String name) {
        this.display = display;
        this.name = name;
    }
    public void run() {
        display.wish(name);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display display = new Display();
        MyThreadSynchronized thread1 = new MyThreadSynchronized(display, "thread1");
        MyThreadSynchronized thread2 = new MyThreadSynchronized(display, "thread2");

        thread1.start();
        thread2.start();

    }
}