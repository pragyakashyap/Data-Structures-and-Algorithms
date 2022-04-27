package com.pragya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree();
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        tree.insert(15);
        tree.insert(16);
        tree.insert(17);
        tree.insert(18);
        System.out.println(tree.root.value);
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
        tree.levelOrder(tree.root);
        System.out.println();
        tree.search(tree.root,12);
        tree.deleteNode(tree.root,14);
        tree.levelOrder(tree.root);
        System.out.println();
        tree.delete();


    }
}
