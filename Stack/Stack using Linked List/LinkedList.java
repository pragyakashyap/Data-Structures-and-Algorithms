package com.pragya;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    // Create
    public Node create(int value) {
        Node node = new Node();
        node.value = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert a node in the linked list
    public void insert(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            System.out.println("Linked list does not exist. hence creating ..");
            create(value);
        } else if (location == 0) {
            node.next = head;
            head = node;
            size++;
        } else if (location == size - 1) {
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
            size++;
        }
    }

    // delete a node
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                head = tail = null;
                return;
            }
        } else if (location == size - 1) {
            Node tempNode = head;
            for (int i = 0; i < location; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location; i++) {
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
    }

}
