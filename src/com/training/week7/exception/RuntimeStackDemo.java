package com.training.week7.exception;

public class RuntimeStackDemo {
    public static void main(String[] args) {
        RuntimeStackDemo demo = new RuntimeStackDemo();
        System.out.println("Called method1() from main()");
        demo.method1();
    }

    public void method1() {
        System.out.println("Called method2() from method1()");
        method2();
    }

    public void method2() {
        System.out.println("Called method3() from method2()");
        method3();
    }

    private void method3() {
        System.out.println("method3() - body");
        String s = null;
        System.out.println(s.length());
    }
}
