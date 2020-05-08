package com.training.week4.oops;

class MethodHidingParent {
    public static String method1(String str) {
        return "parent-method1(String)";
    }
}

class MethodHidingChild extends MethodHidingParent {
    public static String method1(String str) {
        return "child-method1(String)";
    }
}
/*
    1. Encapsulation(Security)
        Data Hiding
        Abstraction
    2. Inheritance(Reusability)
        Extends
    3. Polymorphism(Flexibility)
        Method Overloading
        Method Overriding
*/

public class MethodHidingDemo {
    public static void main(String[] args) {
        MethodHidingChild obj = new MethodHidingChild();
        System.out.println(obj.method1("Hello"));
    }
}
