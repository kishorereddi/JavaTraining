package com.training.week6.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put("One", 1);
        hashtable.put("Three", 3);
        hashtable.put("Two", 2);
        hashtable.put("Four", 4);
        hashtable.put("Five", 5);
        hashtable.remove("Three");

        System.out.println("Keys: " + hashtable.keySet());
        System.out.println("Values: " + hashtable.values());
        System.out.println(hashtable);

        Set keySet = hashtable.entrySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
