package LinkedListConcept.GFG.SinglyLinkedList;

import java.util.HashSet;

public class DetectLoopInLinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    //append at last
    public void push(int data){
        Node temp=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        temp.next=null;
        Node end=head;
        while (end.next!=null){
            end=end.next;
        }
        end.next=temp;
    }
    /*
    public boolean isLoop(){
        if(head==null){
            return false;
        }
        Node temp=head;
        while (temp.next!=null){
            if(temp.data==-1){
                return true;
            }

            temp.data=-1;


            temp=temp.next;
        }
        return false;
    }

     */
    //using hashSet
    public boolean isLoop() {
        HashSet<Node> hs=new HashSet<>();
        Node temp=head;
        while (temp!=null){
            if(hs.add(temp))
                return true;
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args){
        DetectLoopInLinkedList llist=new DetectLoopInLinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
llist.head.next.next.next= llist.head;
        System.out.println(llist.isLoop());
    }

}
