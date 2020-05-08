package com.training.week2.interfaceimpl;

public class SameSignatureMethodsDemo implements Interface1, Interface2 {

    @Override
    public void method1(int i) {
        System.out.println("method1() implemented");
    }

    @Override
    public void method2(int i, int j) {
        System.out.println("method2() - 2 param");
    }

    @Override
    public void method2(int i, int j, int k) {
        System.out.println("method2() - 3 param");
    }

    @Override
    public int method3(int i, int j, int k) {
        System.out.println("method3() - 3 param");
        return 10;
    }

    @Override
    public String method3(int i, String j, int k) {
        System.out.println("method3() - 3 param");
        return "10";
    }

    public static void main(String[] args) {
        System.out.println(Interface2.i);
        SameSignatureMethodsDemo demo = new SameSignatureMethodsDemo();
        demo.method1(10);
        demo.method2(10, 20);
        demo.method2(10, 20, 30);

    }
}
