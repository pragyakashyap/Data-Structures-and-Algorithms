package com.pragya;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.createSinglyLinkedList(6);
        SLL.insertInLinkedList(1, 1);
        SLL.insertInLinkedList(2, 2);
        SLL.traversaltoSinglyLinkedList();
        SLL.search(2);
        SLL.delete(0);
        SLL.traversaltoSinglyLinkedList();
        SLL.deleteLinkedList();
        SLL.traversaltoSinglyLinkedList();
    }


}
