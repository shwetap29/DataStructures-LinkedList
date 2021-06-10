package com.bridgelabz;

public class MyLinkedList {

    public static void main(String[] args){
        LinkedList linkedList1= new LinkedList();
        linkedList1.append(56);
        linkedList1.append(70);
        linkedList1.insertAfter(linkedList1.head, 30);
        //linkedList1.pop();
        //linkedList1.popLast();
        linkedList1.searchElement(30); //calling method to search element
        linkedList1.insertAfter(linkedList1.head.next,40); // Calling Method To Insert After 40
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

     // Method To Insert Element 30 between 56 and 70
        public void insertAfter(Node prevNode, int data) {
            if (prevNode == null) {
                    System.out.println("previous node should not be null");
                    return;
         }
         Node newNode = new Node(data);
         newNode.next = prevNode.next;
         prevNode.next = newNode;

        }

        // Pop method to pop head
        public void pop(){
            if (head == null){
                 System.out.println("Should not be null");
                 return;
         }
            head = head.next;
     }
        // Method To delete Last Element
     public void popLast() {
            if (head == null)
                System.out.println("List is Empty");
                Node last = head;
                Node temp = null;
                while (last.next != null){
                        temp = last;
                        last = last.next;
                }
                temp.next = null;
                last.next = temp.next;
     }

        //Method To Search Element
        public void searchElement(int data)
        {
            Node n=head;
            int count=1;
            int flag=0;
            while (n != null)
            {
                if (n.data == data){
                        flag=1;
                        break;
                }
                count = count+1;
                n=n.next;
            }
            if (flag==1)
                System.out.println("Node with value "+data+" is found at position " +count);
            else
                System.out.println("Element is not present in the list");
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
