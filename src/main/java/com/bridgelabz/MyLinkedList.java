package com.bridgelabz;

public class MyLinkedList {
    public static void main(String[] args){
        LinkedList linkedList1= new LinkedList();
        linkedList1.add(70);
        linkedList1.add(30);
        linkedList1.add(56);
        linkedList1.printList();
    }
}
 class LinkedList{
    Node head;

    class Node {

            int data;
            Node next;
            Node(int data){
                this.data = data;
                next = null;
            }
        }
        public void add (int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
        }
        public void printList(){
            System.out.println("LinkedList:");
            Node temp=head;

            while (temp != null){
                System.out.println(temp.data+" -> ");
                temp = temp.next;
            }
        }
}
