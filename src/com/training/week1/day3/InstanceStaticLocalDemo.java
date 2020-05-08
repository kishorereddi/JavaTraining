package com.training.week1.day3;

public class InstanceStaticLocalDemo {

    //Static
    //Non Static - Instance
    //Local
    static {
        int j = 10;
    }
    public static void main(String a[]) {
        int i = 10;//Primitive //Static
        printValue(i);
        InstanceStaticLocalDemo demo = new InstanceStaticLocalDemo(); //Reference //Static
//        demo.printValue(i);

    }
    public static void printValue(int ii) {
        System.out.println("I Value: "+  ii);//Lc

    }
    public void printValue1(int i) {
        InstanceStaticLocalDemo demo1 = new InstanceStaticLocalDemo(); //Reference //Instance  //Local
        System.out.println("I Value: "+  i); //Primitive //Instance //Local
    }
}
