package com.training.week2.abstractex;

abstract class Animal {
    public abstract int getNoOfLegs();
}

class Cat extends Animal {

    @Override
    public int getNoOfLegs() {
        return 4;
    }
}