package com.training.week7.gc;

public class FinalizeDemo {
    public static void main(String[] args) {
        FinalizeDemo example = new FinalizeDemo();
        example = null;
        FinalizeDemo example2 = new FinalizeDemo();
        example2 = null;
        FinalizeDemo example3 = new FinalizeDemo();
        example3 = null;
        System.gc();
    }

    @Override
    public void finalize() {
        System.out.println("finalize() called for an instance of FinalizeDemo");
    }
}