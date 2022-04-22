package com.pragya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CircularSinglyLinkedList CLL = new CircularSinglyLinkedList();
       // CLL.create(5);
//        System.out.println(CLL.head.value);
//        System.out.println(CLL.head.next.value);
        CLL.insert(0,1);
        CLL.insert(1,2);
        CLL.insert(2,3);
        CLL.insert(3,4);
        CLL.insert(4,5);
        CLL.insert(5,6);
        CLL.traverse();
        CLL.search(4);
        CLL.deleteNode(5);
        CLL.traverse();
//        CLL.delete();
//        CLL.traverse();
 }
}
