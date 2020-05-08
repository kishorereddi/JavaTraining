package com.training.week8.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Sample.txt");
        fileWriter.write(100);
        fileWriter.write("\n");
        fileWriter.write('C');
        fileWriter.write("\n");
        fileWriter.write("Hello");
        fileWriter.write("\n");
        fileWriter.flush();
        fileWriter.close();

        fileWriter = new FileWriter("Sample.txt", true);
        fileWriter.write("Hello");
        fileWriter.flush();
        fileWriter.close();
    }
}
