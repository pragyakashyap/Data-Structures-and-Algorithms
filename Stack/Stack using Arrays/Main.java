package com.pragya;

public class Main {

    public static void main(String[] args) {
        StackArray stack = new StackArray(3);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.delete();

    }
}
