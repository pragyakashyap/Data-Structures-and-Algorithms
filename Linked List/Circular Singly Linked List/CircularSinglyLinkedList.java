package com.pragya;

public class CircularSinglyLinkedList {
    Node head;
    Node tail;
    int size;

    // Creation
    public Node create(int value){
        Node node = new Node();
        node.value=value;
        node.next=node;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    // Insertion
    public void insert(int location,int value){
        Node node = new Node();
        node.value=value;
        if(head==null){
            System.out.println("Linked List Does not exist . Hence Creating ...");
            create(value);
        }else if (location==0){
            node.next=head;
            head=node;
            tail.next=node;
            size++;
        }else if(location<=size){
            node.next=tail.next;
            tail.next=node;
            tail=node;
            size++;
        }else{
            Node tempNode =head;
            int index=0;
            while(index<location){
                tempNode=tempNode.next;
                index++;
            }
            node.next=tempNode.next;
            tempNode.next=node;
            size++;
        }
    }

    // Traverse
    public void traverse(){
        if(head!=null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                tempNode = tempNode.next;
                if (i != size - 1) {
                    System.out.print("->");
                }
            }
            System.out.println("\n");
        }
        else{
            System.out.println("LINKED LIST DOES NOT EXIST");
        }

    }

    // Search for a node
    public void search(int value){
        if(head!=null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value==value){
                    System.out.println("Value found at index "+i);
                    return;
                }
                tempNode=tempNode.next;
            }
            System.out.println(" Value not found");
        }
        else {
            System.out.println("LINKED LIST DOES NOT EXIST");
        }

    }

    // Deletion of a node
    public void deleteNode(int location){
        if(head==null){
            System.out.println("LINKED LIST NOT EXIST");
            return;
        }else if(location==0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                head.next=null;
                head=tail=null;
                size--;
            }
        } else if (location == size-1) {
            Node tempNode = head;
            int index=0;
            while(index<size-1){
                tempNode=tempNode.next;
                index++;
            }

            if(tempNode==head){
                head.next=null;
                head=tail=null;
                size--;
                return;
            }
            tempNode.next=head;
            tail=tempNode;
            size--;

        }else{
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }

    }

    // Delete entire list
    public void delete(){
        if(head==null){
            System.out.println("LINKED LIST NOT EXIST");
        }else{
            tail.next=null;
            head=null;
            tail=null;


        }
    }

}
