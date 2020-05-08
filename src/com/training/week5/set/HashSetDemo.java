package com.training.week5.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("India");
        hashSet.add("Australia");
        hashSet.add("South Africa");
        hashSet.add("India");

        System.out.println(hashSet);
        System.out.println("List contains India or not:" + hashSet.contains("India"));

        // Removing items from HashSet using remove()
        hashSet.remove("Australia");
        System.out.println("List after removing Australia:" + hashSet);

        // Iterating over hash set items
        System.out.println("Iterating over set:");
        Iterator i = hashSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
