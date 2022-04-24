package com.pragya;

public class QueueLinkedList {
    LinkedList list;

    // create
    QueueLinkedList() {
        this.list = new LinkedList();
        System.out.println("Queue created");
    }

    // is empty
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Enqueue
    public void enqueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Inserted!");
    }

    // dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return -1;
        } else {
            int result = list.head.value;
            list.deletionOfNode(0);
            return result;
        }
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Linked list is deleted");
            return -1;
        } else {
            return list.head.value;
        }
    }

    //delete
    public void delete() {
        list.head = null;
        list.tail = null;
        System.out.println("deleted!");

    }

}
