package com.training.week2.accessmodifiers;

public class FinalVariablesDemo {
    public static final int deptNo = 10;

    public int rollNo;

    FinalVariablesDemo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        FinalVariablesDemo finalVariablesDemo = new FinalVariablesDemo(1);

        System.out.println(FinalVariablesDemo.deptNo);
        System.out.println(finalVariablesDemo.rollNo);

        FinalVariablesDemo finalVariablesDemo2 = new FinalVariablesDemo(2);
        System.out.println(FinalVariablesDemo.deptNo);
        System.out.println(finalVariablesDemo2.rollNo);

        printMethod(FinalVariablesDemo.deptNo, finalVariablesDemo, finalVariablesDemo2);
    }

    private static void printMethod(final int deptNo, FinalVariablesDemo finalVariablesDemo,
                                    FinalVariablesDemo finalVariablesDemo2) {
        final int var2;

        System.out.println("Method Values: ");
        System.out.println(deptNo);
        System.out.println(finalVariablesDemo.rollNo);

        System.out.println(deptNo);
        System.out.println(finalVariablesDemo2.rollNo);

    }


}
