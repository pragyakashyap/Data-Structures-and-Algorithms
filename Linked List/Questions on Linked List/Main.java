package com.pragya;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList LL = new LinkedList();
//        LL.create(8);
//        LL.insert(1);
//        LL.insert(3);
//        LL.insert(4);
//        LL.insert(7);
//        LL.traverse();
        LinkedList llA = new LinkedList();
        LinkedList llB = new LinkedList();
//        llA.insert(7);
//        llA.insert(1);
//        llA.insert(6);
//        llB.insert(5);
//        llB.insert(9);
//        llB.insert(2);
        Questions q = new Questions();
//        q.deleteDups(LL);
//        LL.traverse();
//        System.out.println(q.nthToLast(LL,2).value);
//        LinkedList a = q.partition(LL,3);
//       a.traverse();

        LinkedList sumList = q.sumList(llA, llB);
        sumList.traverse();


        llA.insert(3);
        llA.insert(1);
        llA.insert(5);
        llA.insert(9);

        llB.insert(2);
        llB.insert(4);
        llB.insert(6);


        llA.traverse();
        llB.traverse();

        q.addSameNode(llA, llB, 7);
        q.addSameNode(llA, llB, 2);
        q.addSameNode(llA, llB, 1);

        System.out.println(q.findIntersection(llA, llB).value);


    }
}
