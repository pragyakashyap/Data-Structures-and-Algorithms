package com.pragya;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DoublyLinkedList dll = new DoublyLinkedList();
        //dll.createDLL(12);
        //System.out.println(dll.head.value);


        dll.insertDLL(0, 13);
        dll.insertDLL(1, 14);
        dll.insertDLL(2, 15);
        dll.insertDLL(3, 16);
        dll.insertDLL(4, 17);
        dll.insertDLL(5, 18);
        dll.traverse();
        dll.reverseTraverse();
        dll.searchDLL(12);
        dll.searchDLL(14);
        dll.deleteNode(0);
        dll.deleteNode(4);
        dll.traverse();
        dll.delete();
        dll.traverse();


    }
}
