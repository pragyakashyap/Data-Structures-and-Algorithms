package com.pragya;

public class StackLinkedList {
    LinkedList list;

    StackLinkedList() {
        list = new LinkedList();
        System.out.println("Stack created!");
    }

    // IS EMPTY
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        list.insert(value, 0);
        System.out.println("Inserted successfully!");
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Linked list does not exist");
            return -1;
        } else {
            int result = list.head.value;
            list.deleteNode(0);
            return result;
        }
    }

    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Linked list does not exist");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete
    public void delete() {
        list.head = null;
        System.out.println("deleted");
    }
}
