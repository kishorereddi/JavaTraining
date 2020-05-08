package com.training.week8.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("Sample.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println(fileReader.read());//Unicode of first character
        char[] charArray = new char[(int)(file.length())];
        fileReader.read(charArray);
        for(char ch : charArray) {
            System.out.println(ch);
        }
        fileReader.close();
    }
}
