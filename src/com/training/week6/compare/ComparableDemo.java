package com.training.week6.compare;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {

        System.out.println("B".compareTo("A"));
        System.out.println("C".compareTo("B"));
        System.out.println("C".compareTo("C"));

        TreeSet ts = new TreeSet();
        ts.add("A");//Nothing to compare, will be added to set directly
        ts.add("B");//"B".compareTo("A") //Returns 1 as B has to come after A
        ts.add("C");//"C".compareTo("B") //Returns 1 as C has to come after B
        ts.add("E");//"E".compareTo("C") //Returns 2 as E has to come after C, returns the gap total
        ts.add("D");//"D".compareTo("E") //Returns -1 as D has to come Before E

        System.out.println(ts);

        //Integer Comparable Example
        TreeSet ts2 = new TreeSet();
        ts2.add(30);
        ts2.add(50);
        ts2.add(10);
        ts2.add(20);
        ts2.add(90);

        System.out.println(ts2);

    }
}



/*
System.out.println("Hello");
        System.out.println("B".compareTo("A")); //Returns 1 as B has to come after A
        System.out.println("C".compareTo("B")); //Returns 1 as C has to come after B
        System.out.println("E".compareTo("C")); //Returns 2 as E has to come after C
        System.out.println("D".compareTo("E")); //Returns -1 as D has to come Before E
 */