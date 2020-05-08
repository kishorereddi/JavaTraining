package com.training.week1.day4;

public class CommandLineArguDemo {
    public static void main(String[] args) {
        if(args.length > 0) {
            for(int i = 0; i < args.length; i++) {
                System.out.println("Command Line Argument Index:" + i + ", Corresponding value: " + args[i]);
            }
        } else {
            System.out.println("No elements found!");
        }
    }
}

//b.	Run: java Example 10 20 30