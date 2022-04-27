package com.pragya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTreeArray tree= new BinaryTreeArray(9);
        System.out.println(tree.isFull());
        tree.insert("N1");
        tree.insert("N2");
        tree.insert("N3");
        tree.insert("N4");
        tree.insert("N5");
        tree.insert("N6");
        tree.insert("N7");
        tree.insert("N8");
        tree.insert("N9");
        tree.preOrder(1);
        System.out.println();
        tree.postOrder(1);
        System.out.println();
        tree.inOrder(1);
        System.out.println();
        tree.levelOrder(1);
        System.out.println();
        tree.search("N9");
        tree.deleteNode("N3");
        tree.levelOrder(1);
        System.out.println();
        tree.delete();
    }
}
