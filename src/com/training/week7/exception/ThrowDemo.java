package com.training.week7.exception;

public class ThrowDemo {
    public static void main(String args[]) throws MyException {
        throw new MyException("Someone hacked the system interest rate is zero");
    }
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
