package com.training.week8.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("BufferedWriterDemo.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello World!");
        bufferedWriter.newLine();
        bufferedWriter.write("Last line");
        bufferedWriter.flush();
        bufferedWriter.close();//It automatically closes underlying writer i.e. fileWriter

        System.out.println("File writing completed at: " + file.getAbsolutePath());
    }
}
