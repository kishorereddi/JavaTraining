package com.training.week7.exception;

public class MostCommonExceptions {
    public static void main(String[] args) {
        int i[] = new int[10];
        try {
            System.out.println(i[100]);
        } catch(ArrayIndexOutOfBoundsException aiEx) {
            System.out.println("Exception: Array size is: " + i.length + ", but tried to read element from index: " + aiEx.getMessage());
        }

        String str = null;
        try {
            System.out.println(str.length());
        } catch(NullPointerException npe) {
            System.out.println("Exception: Trying perform operation on a null value");
        }

        Object obj = new Object();
        try {
            String str2 = (String) obj;
        } catch(ClassCastException cce) {
            System.out.println("Exception: Exception while type casting, message: " + cce.getMessage());
        }

        try {
            int ten = Integer.parseInt("TEN");
        } catch(NumberFormatException nfe) {
            System.out.println("Exception: Exception while formatting, message: " + nfe.getMessage());
        }
    }
}
