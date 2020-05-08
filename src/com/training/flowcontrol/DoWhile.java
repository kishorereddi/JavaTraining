package com.training.flowcontrol;

import java.util.Scanner;

class DoWhile {
    public static void main(String[] args) {

        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum = sum + number;
        } while (validateCondition(number));

        System.out.println("Sum = " + sum);
    }

    private static boolean validateCondition(Double number) {
        if(number != 0.0) {
            return true;
        } else {
            return false;
        }
    }
}