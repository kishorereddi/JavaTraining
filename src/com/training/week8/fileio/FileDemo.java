package com.training.week8.fileio;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("NewPropFile.prop");

        System.out.println("Exists : " + f.exists());
        System.out.println("File name :" + f.getName());
        System.out.println("Path : " + f.getPath());
        System.out.println("Absolute path : " + f.getAbsolutePath());
        System.out.println("Parent : " + f.getParent());

        if (f.exists()) {
            System.out.println("Is writeable : " + f.canWrite());
            System.out.println("Is readable : " + f.canRead());
            System.out.println("Is a directory : " + f.isDirectory());
            System.out.println("File Size in bytes : " + f.length());
        } else {
            System.out.println("File not found");
        }
        System.out.println("-------------------");
        File dir = new File("C:\\Users\\prasad\\Downloads\\KK-Java\\JavaTraining\\");
        System.out.println("Reading File List from a specific directory:");
        if (f.exists()) {
            String[] fileList = dir.list();
            for(String fileOrDirName : fileList) {
                System.out.println(fileOrDirName);
            }
        } else {
            System.out.println("Directory not found");
        }
    }
}
