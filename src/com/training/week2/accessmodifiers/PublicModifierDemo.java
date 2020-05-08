package com.training.week2.accessmodifiers;

import com.training.flowcontrol.ReturnDemo;

public class PublicModifierDemo {
    public static void main(String[] args) {
//        System.out.println("Default member 'b' value: " + DataTypesDemo.b);//Default members not visible/accessible outside package
//    }
//}
        System.out.println("Hello ClassDeclarationDemo");
        ReturnDemo demo = new ReturnDemo();//Public class from different package
        int total = demo.getMeFirst100NumbersTotal();//Public member is visible, which is being called
        System.out.println("Total of ReturnDemo class logic: " + total);

        //<default> class accessing
        Dog dog = new Dog();



    }
}
