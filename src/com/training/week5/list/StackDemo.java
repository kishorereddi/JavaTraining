package com.training.week5.list;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

 /*       //methods
        1. Object push(Object o): adds object into stack
        2. Object pop(): remove and returns last object
        3. Object peek(): returns last object
        4. boolean empty(): returns true if stack is empty, else returns false
        5. int search(Object o): searches given object in the stack and returns index
*/
        stack.push("10");
        stack.push("20");
        stack.push("30");
        Object returnValue = stack.pop();
        System.out.println(stack);
        System.out.println(returnValue);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(stack.search("20"));
    }
}
