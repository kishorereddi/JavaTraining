package com.training.week1.day5;

public class OperatorsDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = ++i;
        System.out.println("i Value:" + i + ", j value: " + j);

        int ii = 10;
        int jj = ii++;
        System.out.println("ii Value:" + ii + ", j value: " + jj);

        i = 10;
        j = --i;
        System.out.println("i Value:" + i + ", j value: " + j);

        ii = 10;
        jj = ii--;
        System.out.println("ii Value:" + ii + ", j value: " + jj);


        // + / - *, %,
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a / b;
        int e = a - b;
        int f = a * b;
        int g = a % b;
        System.out.println(" a: " + a +
                " b: " + b +
                " c: " + c +
                " d: " + d +
                " e: " + e +
                " f: " + f +
                " g: " + g
                );

        String name = " Gosling ";
        String fullName = 10 + 20 +  name + 20 + " James";
        System.out.println(" name : " + name + " Full name : " + fullName);

        //Relational - >, >=, <, <=
        int val1 = 10;
        int val2 = 10;
        //val1 > val2
        //val1 >= val2
        //val1 < val2
        //val1 <= val2
        if(val1 > val2) {

        } else {

        }

        //Equality ==, !=
        int value1 = 10;
        int value2 = 10;
        //if(value1 == value2)
        //value1 != value2

        //Instanceof
        Integer in = 10;
        if(in instanceof Integer) {
            System.out.println("Integer Type");
        }

        //Bitwise
        // & --  Both are true, then true
        // | -- Any of the operand is true - then true,
        // ^ -- Both are different - then true

        // Short Circuit
        // && --  Both are true, then true
        // || -- Any of the operand is true - then true,

        //Implicit TypeCast
        double ddd = 10; //10.0

        //Explicit TypeCast
        short ff = (short)10; //10.0

        //Assignment
        int value11 = 20;
        int value22 = value11;
        OperatorsDemo demo1 = new OperatorsDemo();
        OperatorsDemo demo2 = demo1;

        int assignValue = 10;
        assignValue /= 20;//assignValue = assignValue + 20;
        System.out.println(assignValue);

        assignValue += 20;
        assignValue /= 20;
        assignValue *= 20;
        assignValue -= 20;

        //Ternary Operator - ?:
        int finalValue = i > j ? i : j;

        //new Operator - new
        OperatorsDemo demo1111 = new OperatorsDemo();









    }
}
