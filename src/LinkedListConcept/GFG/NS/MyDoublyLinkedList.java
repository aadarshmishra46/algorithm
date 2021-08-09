package LinkedListConcept.GFG.NS;

import java.util.EmptyStackException;

//
public class MyDoublyLinkedList {
Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        public  Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }
    public void insertAtFront(int data){
        Node new_node=new Node(data);// null data null
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;// null data head
        head.prev=new_node;
        head=new_node;
    }
    public void insertionAtLast(int data){
        Node new_node=new Node(data);// null data null
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }
    public void insertionBeforGivenIndex(int data,int index){//25 3
        Node temp=head;
        Node new_node=new Node(data);
        for (int i = 1; i <index-1; i++) {// 1  <2
            temp=temp.next;
        }
        if (index==1){
            insertAtFront(data);
            return;
        }
        if(temp.next==null){
            throw new IndexOutOfBoundsException();
           // System.out.println("index out of bound");
        }
        // temp.data=20
        temp.next.prev=new_node;
        new_node.next=temp.next;
        temp.next=new_node;
        new_node.prev=temp;


    }
    public void insertionAfterGivenIndex(int data,int index){//25 3
        Node temp=head;
        Node new_node=new Node(data);
        for (int i = 1; i <index; i++) {// 1  <2
            temp=temp.next;
        }
        //System.out.println(temp.data);
        if(temp.next==null){
            insertionAtLast(data);
            return;
        }
        // temp.data=20
        temp.next.prev=new_node;
        new_node.next=temp.next;
        temp.next=new_node;
        new_node.prev=temp;
    }
    public void removeAtFront(){
    if(head==null){
        throw new EmptyStackException();
    }
    if(head.next==null) {// in linkedlist only element
        head=null;
        return;
    }
    head=head.next;  // 5><10 head=head.next now head is 10;
    head.prev.next=null;// head.prev.next
    head.prev=null;
    }
    public void revmoveAtLast(){
        if(head==null){
            throw new EmptyStackException();
        }
        if(head.next==null) {// in linkedlist only element
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        // we are on last node
        temp=temp.prev;//now my temp 15
        temp.next.prev=null;
        temp.next=null;
    }
    public void removeAtBeforeGivenIndex(int index){

    }
    public void removeAtAfterGivenIndex(int index){

    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        MyDoublyLinkedList list=new MyDoublyLinkedList();//
        list.insertAtFront(10);//10
        list.insertAtFront(20);// 20 10
        list.insertAtFront(30);// 30 20 10
        list.insertAtFront(5);// 5 30 20 10
        list.insertionAtLast(40);// 5 30 20 10 40
        list.insertionAtLast(50);// 5 30 20 10 40 50
        list.insertionAtLast(30);//5 30 20 10 40 50 30
        list.insertAtFront(60);//60 5 30 20 10 40 50 30

        list.insertionAfterGivenIndex(100,7);
        list.print();
        System.out.println();
        list.revmoveAtLast();

        list.print();
    }

}