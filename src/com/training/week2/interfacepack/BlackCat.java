package com.training.week2.interfacepack;

public class BlackCat extends Cat implements Cloneable {//extends declaration

    //void walk();//Implemented in Cat class
    //void eat();//Implemented in Cat class

    public void color() {
        System.out.println("Black");
        double piValue = Animal.PI;
    }

    @Override
    public void method1() {
        //Added new logic
        System.out.println("method1");
    }

}
