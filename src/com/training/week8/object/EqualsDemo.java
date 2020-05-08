package com.training.week8.object;

public class EqualsDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Employee1");
        Employee emp2 = new Employee(101, "Employee1");

        System.out.println(emp1.equals(emp2));
    }
}
