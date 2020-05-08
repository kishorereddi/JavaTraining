package com.training.week6.threads;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyPriorityThread thread = new MyPriorityThread();
        thread.setPriority(Thread.MAX_PRIORITY);//Setting priority
        thread.start();//Starting the thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());//Fetching priority
    }
}

class MyPriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyPriorityThread : " + i);
        }
        System.out.println("MyPriorityThread Priority : " + Thread.currentThread().getPriority());//Fetching priority
    }
}


