package com.training.week5.cursors;

import java.util.*;

public class AllCursorsDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement("Java");
        vector.addElement("Java2");
        vector.addElement("Java3");

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {//Checking whether next element is present
            System.out.println("Elements fetching using Enumeration: " + enumeration.nextElement());//Read the element
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Java");
        arrayList.add(null);
        arrayList.add(10.12);
        arrayList.add(true);
        System.out.println("Size of arrayList is : " + arrayList.size());

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("Elements fetching using Iterator: " + obj);
            if (obj == "Java") {
                iterator.remove();
                System.out.println(obj + " got removed using Iterator, current size of arrayList is : " + arrayList.size());
            }
        }


        ArrayList arrlist = new ArrayList();
        arrlist.add("A");
        arrlist.add("B");
        arrlist.add("C");
        arrlist.add("D");

        ListIterator listIterator = arrlist.listIterator();

        listIterator.add("F");

        while (listIterator.hasNext()) {
            System.out.println("Elements fetching using ListIterator: " + listIterator.next());
        }

        ListIterator listIterator2 = arrlist.listIterator();

        System.out.println(listIterator2.hasNext());
        System.out.println(listIterator2.nextIndex());
        System.out.println(listIterator2.next());

        System.out.println(listIterator2.hasPrevious());
        System.out.println(listIterator2.previousIndex());
        System.out.println(listIterator2.previous());
    }
}
