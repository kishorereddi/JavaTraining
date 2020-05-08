package com.training.flowcontrol;

public class ReturnDemo {
    //Syntax
    //Main Logic/Logic1
    //Calls Method1()
    //method1() logic - return
    //Main Logic/Logic2 - executed upon return
    public int getMeFirst100NumbersTotal() {
        int sum = 0, i = 1;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public void returnOnCondition(int i) {
        if (i < 9) {
            System.out.println("Return is getting called, i value: " + i);
            return;
        } else {
            ++i;
            System.out.println("Return will not be called, i value: " + i);
        }
    }

    public static void returnOnConditionStatic(int i) {
        if (i < 9) {
            System.out.println("Return is getting called, i value: " + i);
            return;
        } else {
            ++i;
            System.out.println("Return will not be called, i value: " + i);
        }
    }

    public static void main(String[] args) {
        ReturnDemo demo = new ReturnDemo();//Object Creation
        demo.returnOnCondition(5);//Performing an action
        int sum = demo.getMeFirst100NumbersTotal();
        System.out.println("Main method execution completed, sum: " + sum);
        returnOnConditionStatic(10);
    }
} 