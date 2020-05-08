package com.training.week1.day3;

public class StaticInstanceDemo {

    public static void main(String s []) {
        InstanceStaticLocalDemo demo =  new InstanceStaticLocalDemo();
        InstanceStaticLocalDemo demo2 =  new InstanceStaticLocalDemo();
        InstanceStaticLocalDemo.printValue(10);

        demo.printValue1(20);
    }

}
