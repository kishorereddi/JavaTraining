package com.training.week6.utilityclasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtilityDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(30);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList,50));
/*
        Public static void sort(List l): //Sorts the given collection
        Public static void sort(List l, Comparator c)://Sorts the given collection using given comparator
        Public static void search(List l, Object obj)//Searches given object in the list
        Public static void reverse(List l)://Reverses the given list*/

    }
}
