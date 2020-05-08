package com.training.week6.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");//Get the current thread and attach a name
        MyThread thread = new MyThread();
        thread.start();
        thread.setName("Print Numbers Thread");//Give a name using thread object
        thread.setPriority(Thread.MAX_PRIORITY);
        try {
            thread.currentThread().yield();
            thread.join();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread: " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);//The thread executed this line will be in sleep state for 500 milli seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread: " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
}


