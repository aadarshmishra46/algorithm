package LinkedListConcept.GFG.SinglyLinkedList;

public class LinkedListTraversal {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;// use data=data and see
            next=null;
        }
    }
    public  void print(){
       Node n=head;
       while (n!=null){
           System.out.print(n.data+" ");
           n=n.next;
       }
    }

    public static void main(String[] args) {
        LinkedListTraversal list=new LinkedListTraversal();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        list.head.next=second;
        second.next=third;
        list.print();
    }
}
