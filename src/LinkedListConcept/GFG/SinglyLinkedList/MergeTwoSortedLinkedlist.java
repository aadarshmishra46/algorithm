package LinkedListConcept.GFG.SinglyLinkedList;

public class MergeTwoSortedLinkedlist {
 Node head;

    //insert at end
    public void insertAtEnd(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedlist list1=new MergeTwoSortedLinkedlist();
        list1.insertAtEnd(10);
        list1.insertAtEnd(20);
        list1.insertAtEnd(30);
        list1.print();
        System.out.println();
        MergeTwoSortedLinkedlist list2=new MergeTwoSortedLinkedlist();
        list2.insertAtEnd(5);
        list2.insertAtEnd(15);
        list2.insertAtEnd(25);
        list2.print();
        System.out.println();
     Merger m=new Merger();
     list1.head=m.merg(list1.head,list2.head);
     list1.print();

    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class Merger{
    public  Node merg(Node headA,Node headB){
       Node merge=new Node(0);
       Node temp=merge;
       while (true){
           if(headA==null){
               temp.next=headB;
               break;

           }
           if(headB==null){
               temp.next=headA;
               break;
           }
           if(headA.data <=headB.data){
               temp.next=headA;
               headA=headA.next;
           }
           else{
               temp.next=headB;
               headB=headB.next;
           }
           temp=temp.next;
       }
       return merge.next;
    }
}