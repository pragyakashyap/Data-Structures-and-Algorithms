package com.pragya;

public class CircularDpublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // Create CDLL
    DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
    void insertNode(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size - 1) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traverse CDLL
    void traverseCDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exist.");
        }
        System.out.println();
    }

    // Reverse Traversal
    void reverseTraversalCDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }

        } else {
            System.out.println("The CDLL does not exist!");
        }
        System.out.println();
    }

    // Search
    public void search(int value) {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                System.out.println("Value found at index" + i);
                return;
            }
            tempNode = tempNode.next;
        }
        System.out.println("value not found");

    }

    //delete a node
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
            if (size == 1) {
                head.prev = head.next = null;
                head = tail = null;
                size--;
            }
        } else if (location == size - 1) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
            if (size == 1) {
                head.next = null;
                head.prev = null;
                head = tail = null;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;

        }
    }

    //delete the entire list
    public void delete() {
        if (head == null) {
            System.out.println("Linked list does not exist");
            return;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("Deleted");
        }
    }


}
