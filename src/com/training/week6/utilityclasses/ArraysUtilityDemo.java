package com.training.week6.utilityclasses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysUtilityDemo {
    public static void main(String[] args) {

        Integer a[] = new Integer[3];
        a[0] = 100;
        a[1] = 10;
        a[2] = 30;

        List list = Arrays.asList(a);
        System.out.println(list);

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        String strArr[] = {"Hi", "A", "Hello", "World"};

        List strList = Arrays.asList(strArr);
        System.out.println("StringList : " + strList);

        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }

        /*
        Public static void sort(Primitive []) //Sorts any primitive array
        Public static void sort(Object [])//Sorts any Object array
        Public static void sort(Object [], Comparator c) //Sorts any Object array with given comparator
        Public static int birnarySearch(Array [], Primitive key) //Searches key in given array
        Public static List asList(Primitive/Object []) //Creates equivalant List object for the given array
*/
    }
}
