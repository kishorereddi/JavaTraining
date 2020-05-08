package com.training.week6.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {//For Predefined classes
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new MyComparator());//Descending Order Sorting
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(90);

        System.out.println(treeSet);
    }

    static class MyComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            if (i1 < i2) {
                return +1;
            } else if (i1 > i2) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
