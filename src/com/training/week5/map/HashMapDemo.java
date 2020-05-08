package com.training.week5.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("One",1);
        hashMap.put("Three",3);
        hashMap.put("Two",2);
        hashMap.put("Four",4);
        hashMap.put("Five",5);
        hashMap.remove("Three");

        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println(hashMap);

        Set keySet = hashMap.entrySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
