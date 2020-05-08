package com.training.week5.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTreeSetDemo {
    public static void main(String[] args) {

        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        // Get a reverse view of the navigable set 
        NavigableSet<Integer> reverseNs = ns.descendingSet();//Returns Reverse of the sortedSet

        // Print the normal and reverse views 
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);

        System.out.println("lower(3): " + ns.lower(3));//lower(Object o): Return next lowest element from collection
        System.out.println("higher(3): " + ns.higher(3));//higher(Object o): Return next highest element from collection

        System.out.println("pollFirst(): " + ns.pollFirst());//Returns first element and removes from collection
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());////Returns last element and removes from collection
        System.out.println("Navigable Set:  " + ns);

    }
} 