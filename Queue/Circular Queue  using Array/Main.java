package com.pragya;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CircularQueue queue = new CircularQueue(4);
        System.out.println(queue.isEmpty());
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        queue.delete();


    }
}
