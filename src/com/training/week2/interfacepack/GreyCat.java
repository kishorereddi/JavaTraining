package com.training.week2.interfacepack;

public class GreyCat extends Cat {//extends declaration

    //void walk();//Implemented in Cat class
    //void eat();//Implemented in Cat class

    public void color() {
        System.out.println("Grey");
    }

    @Override
    public void method1() {
        System.out.println("grey method1");
    }
}
