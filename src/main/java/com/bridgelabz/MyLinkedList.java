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
        linkedList1.deleteNode(40);
        System.out.println("\n linkedlist after deleting node");
        linkedList1.printList();
        System.out.println("\n linkedlist after sorting in ascending order");
        linkedList1.sortList(); // calling method to sort elements
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
                if(n.data == data){
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

        // deleting a node given a key
            public void deleteNode(int key){
                Node temp = head, prev = null;
            // if head node itself is a key to be deleted
                if(temp != null && temp.data == key) {
                    head = temp.next;
                    return;
                }
                // using while loop to search for a key to be deleted
                while (temp != null &&temp.data != key) {
                    prev = temp;
                    temp = temp.next;
                }
                //if key is not present return
                if (temp == null)
                    return;
                // for deleting a node
                prev.next = temp.next;
            }

           //using bubble sort to sort linked list in ascending order
                public void sortList()
                {
                    //Node current will point to head
                    Node current = head, index = null;
                    int temp;

                    if (head == null){
                        return;
                    }
                    else{
                        while (current != null){
                            //Node index will point to node next to
                            // current
                            index = current.next;
                            while (index != null){
                                // if current node's  data is greater
                                // than index's node , swap the data
                                // between them
                                if(current.data > index.data){
                                    temp = current.data;
                                    current.data = index.data;
                                    index.data = temp;
                                }

                                index = index.next;
                            }
                            current = current.next;
                        }
                    }
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
