package com.pragya;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    // Create
    public void create(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    // Insert
    public void insert(int nodeValue) {
        if (head == null) {
            create(nodeValue);
            return;
        }
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }

    //Traverse
    public void traverse() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            tempNode = tempNode.next;
            if (i != size - 1) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    // Delete


}
