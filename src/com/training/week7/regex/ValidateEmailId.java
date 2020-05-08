package com.training.week7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailId {
    public static void main(String[] args) {
        //https://rubular.com/
        args[0] = "Mobile  Number: +111234567890, Email id is: 121322ABC@yahoo.com";
        if(args.length ==1) {
            Pattern pattern = Pattern.compile("[a-zA-Z]+[\\s]+[a-zA-Z]+[:][\\s]+([+][0-9]+[0-9]{10})[,][\\s]+[a-zA-Z]+[\\s]+[a-zA-Z]+[\\s]+[a-zA-Z]+[:][\\s]+([a-zA-Z0-9]{8}[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+)");
            Matcher matcher = pattern.matcher(args[0]);
            if(matcher.find()) {
                System.out.println(args[0] + " - Email validated successfully!");
                System.out.println("Ph: " + matcher.group(1) );
                System.out.println("Mail: " + matcher.group(2) );
            } else {
                System.out.println(args[0] + " - Email validation failed, enter valid email");
            }
        } else {
            System.out.println("Enter only email id!!");
        }
    }
}













//[a-zA-Z][a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+