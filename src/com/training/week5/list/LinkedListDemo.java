package com.training.week5.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        LinkedList linkedList1 = new LinkedList(Collection c);
        linkedList.add(10);
        linkedList.add("Java");
        linkedList.add(10.25);
        linkedList.addFirst(1);
        linkedList.addLast(10.26);
        linkedList.add(5, 10.27);
        linkedList.removeLast();
        linkedList.removeLast();
        linkedList.removeFirst();

        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println("Value from Index: " +  i  + " -- " + linkedList.get(i));
        }
    }
}
