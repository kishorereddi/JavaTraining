package com.training.week5.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("One",1);
        linkedHashMap.put("Three",3);
        linkedHashMap.put("Two",2);
        linkedHashMap.put("Four",4);
        linkedHashMap.put("Five",5);
        linkedHashMap.remove("Three");

        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
        System.out.println(linkedHashMap);

        Set keySet = linkedHashMap.entrySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
