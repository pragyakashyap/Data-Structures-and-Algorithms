package com.pragya;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StackLinkedList stack = new StackLinkedList();
        System.out.println(stack.isEmpty());
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.delete();

    }
}
