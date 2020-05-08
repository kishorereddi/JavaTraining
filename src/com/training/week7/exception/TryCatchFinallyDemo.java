package com.training.week7.exception;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        new ArithmeticException("Pass interate rate");
        new MyException("Invalid flow");
        try {
            System.out.println("try-line1");
            String str = null;
            System.out.println(str.length());
            System.out.println(10/0);
        } catch(ArithmeticException ae) {
            System.out.println("ae catch-line1");
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println("ae last-line");
        } catch(NullPointerException npe) {
            System.out.println("npe catch-line1");
            npe.printStackTrace();
            System.out.println(npe.getMessage());
            System.out.println("npe last-line");
        } finally {
            System.out.println("finally-line1");
            System.out.println("finally-line2");
        }
        System.out.println("Bye");

/*
        Checked & Unchecked exceptions:

        Ex: ArithmeticException
        System.out.println(10/0);

        Ex: FileNotFoundException
        File file = new File("NewPropFile.prop");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/

    }
}
