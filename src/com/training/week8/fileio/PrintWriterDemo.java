package com.training.week8.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter("PrintWriterFile.txt");
        printWriter.write(100); //Regular 3 write methods and all primitive type print methods
        printWriter.write("Hundred");
        printWriter.print(100.01);
        printWriter.print(100.000);
        printWriter.println(true);
        printWriter.println("HELLO");

        printWriter.flush();
        printWriter.close();

        System.out.println("File writing completed!");
    }
}
