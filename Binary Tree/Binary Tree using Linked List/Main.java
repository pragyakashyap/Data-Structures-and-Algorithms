package com.pragya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTreeLL tree= new BinaryTreeLL();
        tree.insert("N1");
        tree.insert("N2");
        tree.insert("N3");
        tree.insert("N4");
        tree.insert("N5");
        tree.insert("N6");
        tree.insert("N7");
        tree.insert("N8");
        tree.insert("N9");
        tree.preOrder(tree.root);
        System.out.println();
        tree.search("N11");
        tree.deleteNode("N4");
        tree.levelOrder(tree.root);
        System.out.println();
        tree.delete();

        /* Manually inserting the nodes in the tree. Instead of this we can use the insert function.
       BinaryNode N1 = new BinaryNode();
       N1.value ="N1";
        BinaryNode N2 = new BinaryNode();
        N2.value ="N2";
        BinaryNode N3 = new BinaryNode();
        N3.value ="N3";
        BinaryNode N4 = new BinaryNode();
        N4.value ="N4";
        BinaryNode N5 = new BinaryNode();
        N5.value ="N5";
        BinaryNode N6 = new BinaryNode();
        N6.value ="N6";
        BinaryNode N7 = new BinaryNode();
        N7.value ="N7";
        BinaryNode N8 = new BinaryNode();
        N8.value ="N8";
        BinaryNode N9 = new BinaryNode();
        N9.value ="N9";

        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;

        tree.root = N1;
        tree.preOrder(N1);
     System.out.println();
     tree.inOrder(N1);
     System.out.println();
     tree.postOrder(N1);
     System.out.println();
     tree.levelOrder(N1);
         */



    }
}
