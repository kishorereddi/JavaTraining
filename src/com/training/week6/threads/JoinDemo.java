package com.training.week6.threads;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread thread = new JoinThread();
        thread.start();
        thread.join();//Main method want to join with Jointhread, main method execution will start after JoinThread
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

class JoinThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("JoinThread : " + i);
        }
    }
}

