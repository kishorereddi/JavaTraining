package com.training.week8.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1, "Student1", 2300.00);
        System.out.println(student);

        FileOutputStream fileOutputStream = new FileOutputStream("StudentDetails.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        FileInputStream fileInputStream = new FileInputStream("StudentDetails.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student) objectInputStream.readObject();
        System.out.println(student1);

    }
}
