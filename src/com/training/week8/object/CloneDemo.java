package com.training.week8.object;

import com.training.week6.compare.Student;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(101,"Emp1");
        Employee emp2 = (Employee) emp1.clone();

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
