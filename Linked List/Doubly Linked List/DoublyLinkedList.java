package com.pragya;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;
    DoublyNode node = new DoublyNode();

    // Creation
    public DoublyNode createDLL(int value) { // DLL --> DOUBLY LINKED LIST
        node.value = value;
        node.prev = node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    /*
    Insertion :
        * At the beginning
        * At last
        * Anywhere in the linked list
     */

    public void insertDLL(int location, int value) {
        DoublyNode node = new DoublyNode();
        node.value = value;
        if (head == null) {
            createDLL(value);
        } else if (location == 0) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
            size++;
        } else if (location <= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            node.prev = tempNode;
            tempNode.next.prev = node;
            tempNode.next = node;
            size++;
        }
    }

    // Traversal
    public void traverse() {
        if (head == null) {
            System.out.println("LINKED LIST DOES NOT EXIST");
            return;
        }
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            tempNode = tempNode.next;
            if (i != size - 1) {
                System.out.print("->");
            }
        }
        System.out.println("\n");
    }

    // Reverse Traversal
    public void reverseTraverse() {
        DoublyNode tempNode = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            tempNode = tempNode.prev;
            if (i != size - 1) {
                System.out.print("<-");
            }

        }
        System.out.println("\n");
    }

    // Search a Node Value in Doubly Linked list
    public boolean searchDLL(int value) {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                System.out.println("Value found at index " + i);
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println("VALUE NOT FOUND");
        return false;
    }

    // Deleting a Node from a DLL
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            head.prev = null;
            if (size == 1) {
                head = null;
                tail = null;
            }
            size--;
        } else if (location <= size - 1) {
            tail = tail.prev;
            tail.next = null;
            if (size == 1) {
                head = tail = null;
            }
            size--;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next.prev = tempNode;
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete the entire doubly linked list
    public void delete() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = tail = null;
            System.out.println("Linked list deleted");
            return;
        }
        System.out.println("LINKED LIST DOES NOT EXIST");
    }
}

