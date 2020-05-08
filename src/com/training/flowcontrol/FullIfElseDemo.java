package com.training.flowcontrol;

class FullIfElseDemo {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("Positive.");
        } else if (number < 0) {
            System.out.println("Negative.");
        } else {
            System.out.println("Number is 0.");
        }
    }
}