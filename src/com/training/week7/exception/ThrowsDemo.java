package com.training.week7.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            try {
                FileReader fileReader = new FileReader("tempFile");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void method1() throws FileNotFoundException {
        File file = new File("NewPropFile.propdsdfs");
        FileReader fileReader = new FileReader(file);
        System.out.println("main method");
    }

}
