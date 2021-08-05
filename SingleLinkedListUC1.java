package com.linkedlist;

public class SingleLinkedListUC1 {
	  //Represent a node of the singly linked list
    public static class Node{
        private int data;
        private Node next;

        public Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    private Node head = null;
    private Node tail = null;

    //addNode() will add a new node to the list, Create a new node, Checks if the list is empty by using head address
    public void addNode(int x){
        Node newNode = new Node(x);

        if (head == null){
            head = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        tail = newNode;
    }

    //displayList() will display all the nodes
    public void displayList(){
        Node temp = head;
        if (head == null){
            System.out.println("Singly Linked List is Empty");
        }
        System.out.println("Node's of Singly Linked List :");
        while (temp != null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        SingleLinkedList slList = new SingleLinkedList();

        //Add nodes to the list
        slList.addNode(56);
        slList.addNode(30);
        slList.addNode(70);

        //Call the Displays Method
        slList.displayList();
    }
}