package com.training.week5.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");

        linkedHashSet.add("A");
        linkedHashSet.add("E");

        System.out.println("Size of LinkedHashSet = " + linkedHashSet.size());
        System.out.println("Original LinkedHashSet:" + linkedHashSet);
        System.out.println("Removing D from LinkedHashSet: " + linkedHashSet.remove("D"));
        System.out.println("Trying to Remove Z which is not " + "present: " + linkedHashSet.remove("Z"));
        System.out.println("Checking if A is present=" + linkedHashSet.contains("A"));
        System.out.println("Updated LinkedHashSet: " + linkedHashSet);
    }
}
