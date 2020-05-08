package com.training.week5.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Vector vector1 = new Vector(20);
//        Vector vector3 = new Vector(Collection c);
        Vector vector2 = new Vector(20, 50);
        // 20 - initialCapacity
        //50 - capacity increment
        vector.addElement("Java");
        vector.addElement("Java2");
        vector.addElement("Java3");
        vector.removeElement(0);
        vector.removeElement("Java");
//        vector.removeAllElements();

        for(int i = 0; i < vector.size(); i++) {
            System.out.println("Value from Index: " +  i  + " -- " + vector.get(i));
        }

    }
}
