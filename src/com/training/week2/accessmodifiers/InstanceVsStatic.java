package com.training.week2.accessmodifiers;

public class InstanceVsStatic {

    public static int deptNo = 10;

    public int rollNo;

    InstanceVsStatic(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        InstanceVsStatic instanceVsStatic = new InstanceVsStatic(1);

        System.out.println(InstanceVsStatic.deptNo);
        System.out.println(instanceVsStatic.rollNo);

        InstanceVsStatic instanceVsStatic2 = new InstanceVsStatic(2);
        System.out.println(InstanceVsStatic.deptNo);
        System.out.println(instanceVsStatic2.rollNo);
    }
}
