package com.training.week6.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        // Inserting values in the TreeMap
        treeMap.put(25, "TwoFive");
        treeMap.put(20, "Hello");
        treeMap.put(10, "Ten");
        treeMap.put(15, "15");
        treeMap.put(30, "Last");


        System.out.println("Elements successfully inserted in the TreeMap");

        System.out.println("Is key 50 present " + treeMap.containsKey(50));

        // Checking for the value
        System.out.println("Is value Hello present " + treeMap.containsValue("Hello"));

        System.out.println("TreeMap: " + treeMap);

        //For each
        for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
