package com.training.week4.oops;

class Singleton {
    private static Singleton object;

    private Singleton() {
        System.out.println("Singleton()");
    }

    public static Singleton getInstance() {
        if (object == null) {
            System.out.println("Creating new object...");
            object = new Singleton();
        } else {
            System.out.println("No action, returning already created object...");
        }
        return object;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        Singleton s3 = Singleton.getInstance();
        System.out.println(s3);
    }
}
