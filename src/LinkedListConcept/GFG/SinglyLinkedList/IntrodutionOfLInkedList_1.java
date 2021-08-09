package LinkedListConcept.GFG.SinglyLinkedList;

public class IntrodutionOfLInkedList_1 {
    Node head;
    static class Node{
        Node next;
        int data;
        public  Node(int data ){
            this.data=data;
            next=null;
        }
    }

    public static void main(String[] args) {
        IntrodutionOfLInkedList_1 list=new IntrodutionOfLInkedList_1();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        list.head.next=second;
        second.next=third;

    }
}
