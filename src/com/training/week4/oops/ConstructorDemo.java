package com.training.week4.oops;

public class ConstructorDemo {

    ConstructorDemo() {//default (no-arg) constructor
        System.out.println("ConstructorDemo()");
    }

    ConstructorDemo(int i) {
        System.out.println("ConstructorDemo(i)");
    }

    public void method1() {
        System.out.println("method1()");
    }

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo();
        System.out.println(demo);
        ConstructorDemo demo1 = new ConstructorDemo();
        System.out.println(demo1);
        ConstructorDemo demo2 = new ConstructorDemo();
        System.out.println(demo2);
        //ConstructorDemo demo1 = new ConstructorDemo(10);

    }

}
