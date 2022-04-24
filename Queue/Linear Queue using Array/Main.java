package com.pragya;

public class Main {

    public static void main(String[] args) {
        // write your code here
        QueueArray queue = new QueueArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        queue.delete();
        
    }
}
