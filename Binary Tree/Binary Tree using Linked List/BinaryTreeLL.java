package com.pragya;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;
    // Create
    BinaryTreeLL(){
        this.root=null;
    }

    /*
    Traversal : In order Traversal , Pre order and post order
     */
    public void preOrder(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In order : Left->root->right
    public void inOrder(BinaryNode node){
        if(node==null)return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    // POst order  left->right->root
    public void postOrder(BinaryNode node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");

    }

    // Level order  --> Breadth first search
    public void levelOrder(BinaryNode root){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    public int search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value==value){
                System.out.println("Node Found");
                return presentNode.height;
            }
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        System.out.println("Not found");
        return -1;
    }

    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value=value;
        if(root==null){
            root=newNode;
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left==null){
                presentNode.left=newNode;
                break;
            }
            else if(presentNode.right==null){
                presentNode.right=newNode;
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    /*
    Deleting a node from binary tree
        --> Get deepest node
        -->replace deepest node with the node needs to be deleted
        -->then delete the deepest node
     */

    // 1.Get Deepest Node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode=queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    // Delete Deepest Node
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode,presentNode = null;
        while(!queue.isEmpty()){
            previousNode=presentNode;
            presentNode=queue.remove();
            if(presentNode.left==null){
                previousNode.right=null;
                return;
            }else if(presentNode.right==null){
                presentNode.left=null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete Given Node
    public void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value==value){
                presentNode.value=getDeepestNode().value;
                deleteDeepestNode();
                return;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("node does not exist");
    }

    // Delete binary tree
    public void delete(){
        root=null;
        System.out.println("Binary tree deleted");
    }




}
