package com.training.week2.interfacepack;

public class InterfaceClient {
    public static void main(String[] args) {
        Animal animal = getMeObject("black");//New Implementations can be fetched here
        animal.eat();//Newly added/Modified Logic will be called here
        animal.walk();
        animal.color();
        animal.method1();
    }

    public static Animal getMeObject(String input) {
        Animal animal = null;
        if (input.equals("black")) {
            animal = new BlackCat();
        } else {
            animal = new GreyCat();
        }
        return animal;
    }
}
