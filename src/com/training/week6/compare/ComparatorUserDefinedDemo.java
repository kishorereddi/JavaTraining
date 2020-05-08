package com.training.week6.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorUserDefinedDemo {
    public static void main(String[] args) {
//        TreeSet studentsSet = new TreeSet();
        TreeSet studentsSet = new TreeSet(new MyStudentComparator());
        studentsSet.add(new Student(100));
        studentsSet.add(new Student(50));
        studentsSet.add(new Student(10));
        studentsSet.add(new Student(270));
        studentsSet.add(new Student(10090));

        System.out.println(studentsSet);
    }

    static class MyStudentComparator implements Comparator {
        @Override
        public int compare(Object object1, Object object2) {
            Student student1 = (Student) object1;
            Student student2 = (Student) object2;
            if (student1.getStudentId() < student2.getStudentId()) {
                return +1;
            } else if (student1.getStudentId() > student2.getStudentId()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
