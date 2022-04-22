package com.pragya;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;
    Node node = new Node();

    // Create a Singly Linked List

    public Node createSinglyLinkedList(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;


    }


    // insert method for singlylinkedlist
    public void insertInLinkedList(int nodevalue, int locationOfNode) {
        Node node = new Node();
        node.value = nodevalue;
        if (head == null) {
            createSinglyLinkedList(nodevalue);
            return;
        } else if (locationOfNode == 0) {
            node.next = head;
            head = node;
        } else if (locationOfNode <= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < locationOfNode - 1) {
                tempNode = node.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;

        }
        size++;


    }


    // Traversal to SinglyLinkedList
    public void traversaltoSinglyLinkedList() {
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                tempNode = tempNode.next;
                if (i != size - 1) {
                    System.out.print("-->");
                }
            }
        }
        System.out.println("\n");

    }

    // Search for a value in Linked List
    public void search(int nodeValue) {
        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Value found at index " + i);
                    return;
                }
                tempNode = tempNode.next;
            }
            System.out.println("Value Not found");
        }
    }

    // Delete a Node from a singly linked list
    public void delete(int location) {
        if (head == null) {
            System.out.println("Linked List not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                head = tail = null;
            }
        } else if (location <= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
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
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete Entire Linked List
    public void deleteLinkedList() {
        head = tail = null;
        System.out.println("Linked list deleted");
    }
}
