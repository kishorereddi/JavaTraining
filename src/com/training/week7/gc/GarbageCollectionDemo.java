package com.training.week7.gc;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        obj1 = null;

        System.gc();

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        for(int i = 0; i< 200; i ++) {
            GarbageCollectionDemo temp = new GarbageCollectionDemo();
        }

        //Some useful methods
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());

        runtime.gc();

        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("After GC, Free Memory: " + runtime.freeMemory());

    }
}
