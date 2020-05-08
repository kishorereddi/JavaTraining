package com.training.week3.oops.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        parentObj.primeOrNot();

        Child childObj = new Child();
        childObj.palindromeOrNot(10);
        childObj.primeOrNot();//Inherited method
        childObj.toString();//Indirect child -- Inherited from Object class

        Parent parentChildObj = new Child();
        parentChildObj.primeOrNot();
//        parentChildObj.method2();//Method2() cannot be acc to compiler

//        Child obj = new Parent();//Invalid

        InheritanceExample obj = new InheritanceExample();
        obj.toString();//Inherited toString() from Object class
    }

}
