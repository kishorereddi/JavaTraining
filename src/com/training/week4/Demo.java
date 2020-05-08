package com.training.week4;

class MySingleton {

    private MySingleton() {
    }

    private static MySingleton singleton1 = null;

    public static MySingleton giveMeObject() {
        if (singleton1 == null) {
            singleton1 = new MySingleton();
        }
        return singleton1;
    }
}

public class Demo {
    public static void main(String[] args) {
        MySingleton singleton1 = MySingleton.giveMeObject();
        System.out.println(singleton1);
        MySingleton singleton2 = MySingleton.giveMeObject();
        System.out.println(singleton2);

        int[] intArray = {10, 20, 30};
        intArray[0] =  50;
        intArray[1] =  60;
        intArray[2] =  70;

    }
}
