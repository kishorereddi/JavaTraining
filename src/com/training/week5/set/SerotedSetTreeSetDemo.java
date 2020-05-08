package com.training.week5.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SerotedSetTreeSetDemo {
    public static void main(String[] args) {

        SortedSet ss = new TreeSet();
        ss.add(0);
        ss.add(1);
        ss.add(2);
        ss.add(3);
        ss.add(4);
        ss.add(5);
        ss.add(6);

        System.out.println("First : " + ss.first());
        System.out.println("Last : " + ss.last());

        System.out.println("Less than 3 :  " + ss.headSet(3));
        System.out.println("More than 4:  " + ss.tailSet(4));
        System.out.println("Between 2 and 5:  " + ss.subSet(2,5));

    }
} 