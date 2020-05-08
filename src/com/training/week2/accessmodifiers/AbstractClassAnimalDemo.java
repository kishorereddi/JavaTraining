package com.training.week2.accessmodifiers;

public abstract class AbstractClassAnimalDemo {
    public abstract void walk();//Abstract method declaration
}

class Dog extends AbstractClassAnimalDemo {
    @Override
    public void walk() {//Abstract method implementation
        System.out.println("Dog Walking....");
    }

    public static void main(String argsp[]) {
//        AbstractClassAnimalDemo demo = new AbstractClassAnimalDemo();//Instantiation not possible
        Dog dog = new Dog();
        dog.walk();
    }
}
