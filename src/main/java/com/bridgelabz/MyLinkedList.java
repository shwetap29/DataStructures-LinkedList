package com.bridgelabz;

public class MyLinkedList {
    public static void main(String[] args){
        LinkedList linkedList1= new LinkedList();
        linkedList1.append(70);
        linkedList1.append(30);
        linkedList1.append(56);
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
        /*
        //Method To Add elements To linked List
        public void add (int data){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
        }
        */
        // Method Of Append
     public void append(int data) {
         Node newNode = new Node(data);
         if(head == null ){
             head = newNode;
             return;
         }
         Node last = head;
         while (last.next !=null) {
             last = last.next;
         }
         last.next=newNode;
     }



     // Method To print Linked List
        public void printList(){
            System.out.println("LinkedList:");
            Node temp=head;

            while (temp != null){
                System.out.println(temp.data+" -> ");
                temp = temp.next;
            }
        }
}
