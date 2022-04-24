package com.pragya;

public class QueueArray {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;

    // Create Queue
    QueueArray(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Queue created!");
    }

    // Is Full
    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    //is Empty
    public boolean isEmpty() {
        if (beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    //Enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Array is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;

        }
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // delete
    public void delete() {
        arr = null;
        System.out.println("deleted");
    }
}

