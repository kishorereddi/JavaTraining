package com.training.week6.threads;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable runnableObj = new MyRunnable();//Instantiation of MyRunnable class
        Thread thread = new Thread(runnableObj);//Instantiation of a new thread
        thread.start();//Starting the thread
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Main Thread: " + i);
        }
    }
}

/*
•	Thread t = new Thread();
•	Thread t = new Thread(Runnable r);
•	Thread t = new Thread(String name);
•	Thread t = new Thread(Runnable r, String name);

 */

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyThread: " + i);
        }
    }
}
