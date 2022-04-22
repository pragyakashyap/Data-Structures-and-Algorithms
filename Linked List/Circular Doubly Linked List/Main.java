package com.pragya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CircularDpublyLinkedList CDLL = new CircularDpublyLinkedList();
       // CDLL.createCDLL(7);
        //System.out.println(CDLL.head.value);
        CDLL.insertNode(0,0);
        CDLL.insertNode(1,1);
        CDLL.insertNode(2,2);
        CDLL.insertNode(3,3);
        CDLL.insertNode(4,4);
        CDLL.insertNode(5,5);
        CDLL.traverseCDLL();
        CDLL.reverseTraversalCDLL();
        CDLL.search(5);
        CDLL.search(8);
        CDLL.deleteNode(0);
        CDLL.traverseCDLL();
        CDLL.delete();
        CDLL.traverseCDLL();

    }
}
