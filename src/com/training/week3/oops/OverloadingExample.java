package com.training.week3.oops;

class MethodsClass {
    public void method1(String str) {
        System.out.println("method1(String)");
    }

    public void method1(StringBuffer str) {
        System.out.println("method1(StringBuffer)");
    }

    //Method Overriding

    public void method1(Object str) {
        System.out.println("method1(String)");
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MethodsClass methodsClass = new MethodsClass();
        methodsClass.method1("Hello");
        methodsClass.method1(new StringBuffer("Hello"));
        //methodsClass.method1(null);//Invalid
    }
}
