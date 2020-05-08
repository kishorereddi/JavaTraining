package com.training.week3.oops;

class OverridingParent {
    protected Object method1(String str) {
        return "parent-method1(String)";
    }
}
class OverridingChild extends OverridingParent {
    protected String method1(String str) {
        return "child-method1(String)";
    }
}

public class OverridingExample {
    OverridingExample(int i) {
        System.out.println("Hello - Example");
    }
    public static void main(String[] args) {
        OverridingChild obj = new OverridingChild();
        System.out.println(obj.method1("Hello"));//Child overriden logic
    }
}
