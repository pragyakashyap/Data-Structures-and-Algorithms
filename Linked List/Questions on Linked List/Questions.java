package com.pragya;

import java.util.HashSet;

public class Questions {

    /*
    Question 1 : Write a method to delete duplicates from an unsorted linked list
     */
    void deleteDups(LinkedList LL) {
        HashSet<Integer> hs = new HashSet();
        Node currentNode = LL.head;
        Node prev = null;
        while (currentNode != null) {
            int curValue = currentNode.value;
            if (hs.contains(curValue)) {
                prev.next = currentNode.next;
                LL.size--;
            } else {
                hs.add(curValue);
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    /*
    Question 2: Implement an algorithm to find the nth to last element of a singly linked list
     */
    Node nthToLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    /*
    Question 3. write a code to partition a linked list around a value x such that all nodes less than x come before all nodes
    greater than or equal to x
     */
    LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;

    }

    /*
    Question 4.You have two numbers represented by a linked list where each node contains a single digit. The digits are stored
    in reverse order such that the 1's digit is at the head of the list. write a function that adds the two numbers and return the
    sum as a linked list
    7->1>6 -- List1
    5->9->2  -- List 2
    Sum List -- 2->1->9
     */

    LinkedList sumList(LinkedList llA, LinkedList llB) {
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null) {
            int result = carry;
            if (n1 != null) {
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insert(result % 10);
            carry = result / 10;
        }
        return resultLL;
    }

    /*
    Intersection of two linked list
     */

    // getKthNode
    Node getKthNode(Node head, int k) {
        Node current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    // Intersection Method
    Node findIntersection(LinkedList list1, LinkedList list2) {
        if (list1.head == null || list2.head == null) return null;
        if (list1.tail != list2.tail) {
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size) {
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }

        longer = getKthNode(longer, Math.abs(list1.size - list2.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;

    }

    // Add same node
    void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;

    }
}
