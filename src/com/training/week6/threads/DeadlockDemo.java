package com.training.week6.threads;

public class DeadlockDemo {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        ThreadDemo1 thread1 = new ThreadDemo1();
        ThreadDemo2 thread2 = new ThreadDemo2();
        thread1.start();
        thread2.start();
    }

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 - Holding lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1 - waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread1 - Holding lock1 and lock2");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread2 - Holding lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 - waiting for lock1");
                synchronized (lock1) {
                    System.out.println("Thread2 - Holding lock1 and lock2");
                }
            }
        }
    }
}





