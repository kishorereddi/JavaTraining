package com.training.week2.interfacepack;

public abstract class Cat implements Animal, Interface2 {//Interface Implementation

    Cat() {
    }

    public void walk() {
        System.out.println("walk()");
    }

    public void eat() {
        System.out.println("eat()");
    }

    /*public void color() {

    }*/

}
