package com.pragya;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryTreeNode root;
    BinaryTree(){
        root=null;
        System.out.println("BST created");
    }

    // Insert a node
    private BinaryTreeNode insertNode(BinaryTreeNode currentNode,int Value){
        if (currentNode == null) {
            BinaryTreeNode newNode = new BinaryTreeNode();
            newNode.value=Value;
            return newNode;
        }else if(Value<=currentNode.value){
            currentNode.left=insertNode(currentNode.left,Value);
            return currentNode;
        }else{
            currentNode.right=insertNode(currentNode.right,Value);
            return currentNode;
        }
    }

    public void insert(int value){
        root = insertNode(root,value);
        System.out.println(value+" inserted");
    }

    // Traversal
    /*
    Pre Order TraversalI
     */
    public void preOrder(BinaryTreeNode node){
        if(node==null) {
            return ;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /*
    In Order
     */
    public void inOrder(BinaryTreeNode node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    /*
    PostOrder
     */
    public void postOrder(BinaryTreeNode node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    // LevelOrder Traversal
    public void levelOrder(BinaryTreeNode root){
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    /*
    Search for a node
     */

    public void search(BinaryTreeNode node,int value) {
        if(node==null){
            return;
        }else if(node.value==value){
            System.out.println("Found");
        }
        else if(value>node.value){
            search(node.left,value);
        }else{
            search(node.right,value);
        }
    }

    // Delete a Node
    public BinaryTreeNode minNode(BinaryTreeNode root){
        if(root.left==null){
            return root;
        }else{
            return minNode(root.left);
        }
    }

    public BinaryTreeNode deleteNode(BinaryTreeNode root,int value){
        if(root==null){
            System.out.println("Not found");
            return null;
        }else if(value<root.value){
            root.left=deleteNode(root.left,value);
        }else if(value>root.value){
            root.right = deleteNode(root.right,value);
        }else{
            if(root.left!=null  && root.right!=null){
                BinaryTreeNode temp = root;
                BinaryTreeNode minNodeForRight= minNode(temp.right);
                root.value=minNodeForRight.value;
                root.right=deleteNode(root.right,minNodeForRight.value);
            }else if(root.left!=null){
                root=root.left;
            }else if(root.right!=null){
                root=root.right;
            }else{
                root=null;
            }
        }
        return root;
    }

    // Delete a BST (Binary search tree)

    public void delete(){
        root=null;
        System.out.println("BST deleted");
    }
}
