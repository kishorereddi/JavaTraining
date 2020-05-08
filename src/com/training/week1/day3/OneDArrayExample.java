package com.training.week1.day3;

public class OneDArrayExample {
    public static void main(String[] args) {
//        int[] a;//Declared

        //Array Construction
        int a[] = new int[3];

        //Initialization
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}