package com.training.week7.exception;

public class PrintException {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("toString(): " + e.toString());
            System.out.println("getMessage(): " + e.getMessage());
        }
    }
}

/*
printStackTrace(): Name of the exception and Description Then complete Stack Trace
toString(): Name of the exception + Description
getMessage(): Only description
*/