package com.training.week2.accessmodifiers;

public final class FinalClassDemo {
    public void printHello() {
        System.out.println("Hello Final");
    }
}

class FinalClassExt /*extends FinalClassDemo*/ { //Cannot extend - compile time error
}

