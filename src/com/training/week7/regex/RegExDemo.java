package com.training.week7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("ABabdddbabababdfd");
        while(matcher.find()) {
            System.out.println("Start Index: " + matcher.start() + ", End Index: " +
                    matcher.end() + ", Matched String: " + matcher.group());
        }
    }
}
