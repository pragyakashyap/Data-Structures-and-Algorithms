package com.pragya;

public class StackArray {
    int[] arr;
    int topOfStack;

    //Creating stack
    StackArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created successfully");
    }

    // IsEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    //IS FULL
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("Array is Full !");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value inserted successfully!");
        }
    }

    //POP
    public int pop() {
        if (isEmpty()) {
            System.out.println("Array is empty!");
            return -1;
        } else {
            int result = arr[topOfStack];
            topOfStack--;
            return result;
        }
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("array is empty!");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    // delete
    public void delete() {
        arr = null;
        System.out.println("deleted!");
    }

}
