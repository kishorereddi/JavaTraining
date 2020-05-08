package com.training.week6.compare;

import java.util.ArrayList;
import java.util.Collections;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();//Generics
        numbersList.add(10);
        numbersList.add(13);
        numbersList.add(11);

        System.out.println("List: " + numbersList);
        Collections.sort(numbersList);

        for(int i = 0; i < numbersList.size(); i++) {
            System.out.println("Value from Index: " +  i  + " -- " + numbersList.get(i));
        }
    }
}
