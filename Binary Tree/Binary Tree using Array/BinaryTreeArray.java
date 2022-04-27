package com.pragya;

public class BinaryTreeArray {
    String[] arr;
    int lastUsedIndex;
    BinaryTreeArray(int size){
        this.arr= new String[size+1];
        this.lastUsedIndex=0;
    }

    //isFull
    boolean isFull(){
        return arr.length - 1 == lastUsedIndex;
    }

    // Inserting a node
    public void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1]=value;
            lastUsedIndex++;
            System.out.println("Inserted");
        }else{
            System.out.println("Array is full");
        }

    }

    // Pre-order traversal
    public void preOrder(int index){
        if(index >lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrder(2*index);
        preOrder(2*index+1);
    }

    // In Order
    public void inOrder(int index){
        if(index>lastUsedIndex)return;
        inOrder(2*index);
        System.out.print(arr[index]+" ");
        inOrder(2*index+1);
    }

    public void postOrder(int index){
        if(index>lastUsedIndex){
            return;
        }
        postOrder(2*index+1);
        postOrder(2*index);
        System.out.print(arr[index]+" ");
    }

    // Level Order traversal
    public void levelOrder(int index){
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Search
    public int search(String value){
        for(int i=0; i<=lastUsedIndex;i++){
            if(arr[i]==value){
                System.out.println("Value found");
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    // Delete a node
    public void deleteNode(String value){
        int location = search(value);
        if(location==-1){
            return;
        }
        arr[location]=arr[lastUsedIndex];
        lastUsedIndex--;
    }

    // Delete the tree
    public void delete(){
        arr=null;
        System.out.println("deleted");
    }

}
