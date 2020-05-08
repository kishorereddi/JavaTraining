package com.training.week8.fileio;

import java.io.File;

public class DirectoryHierarchy {
    public static void main(String[] args) {
        File rootDirectory = new File("C:\\Users\\prasad\\Downloads\\KK-Java\\JavaTraining");
        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
            File arr[] = rootDirectory.listFiles();//Read all files and folders
            System.out.println("Files from root directory : " + rootDirectory);
            findSubDirectoryRecursively(arr, 0, 0);
        }
    }

    static void findSubDirectoryRecursively(File[] arr, int index, int level) {
        // terminate condition
        if (index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        // for files
        if (arr[index].isFile())
            System.out.println(arr[index].getName());

            // for sub-directories
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName() + "]");

            // recursion for sub-directories
            findSubDirectoryRecursively(arr[index].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        findSubDirectoryRecursively(arr, ++index, level);
    }
} 