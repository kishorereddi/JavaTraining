package com.training.flowcontrol;

class WhileDemo {
    public static void main(String[] args) {

        int sum = 0, i = 1;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}