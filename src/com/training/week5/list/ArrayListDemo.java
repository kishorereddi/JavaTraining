package com.training.week5.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Java");
        arrayList.add(10.12);
        arrayList.add(true);
        arrayList.add(null);

//        Collections.sort(arrayList);TODO

        ArrayList arrayList2 = new ArrayList(20);

        ArrayList arrayList3 = new ArrayList(arrayList);

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("Value from Index: " +  i  + " -- " + arrayList.get(i));
        }

    }
}
