package com.pragya;

public class CircularQueue {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    //Create
    CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Created ..");
    }

    // is empty
    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    //is full
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else if (beginningOfQueue == 0 && topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    // Enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Array is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            arr[topOfQueue + 1] = value;
            topOfQueue++;
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;

        }
    }

    // dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    //peek
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
        System.out.println("deleted!");
    }
}
