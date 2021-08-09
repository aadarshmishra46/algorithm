package LinkedListConcept.GFG.SinglyLinkedList;

public class LinkedListDemo_Anup {
   Node head;
   static class Node{
        Node next;
        int data;
        public  Node(int data){
            this.data=data;
            next=null;
        }

    }
    public  void push(int data){
       Node new_node=new Node(data);//[20 null]---newnode  10 null
        System.out.println(new_node.hashCode());
      //  System.out.println(head.hashCode());
        if(head==null){
            head=new_node;
            return;
        }
       Node temp=head;// 10 null
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    public static void main(String[] args) {
        LinkedListDemo_Anup list=new LinkedListDemo_Anup();
        list.push(10);
        list.push(20);
        System.out.println(list.head.next.data);
    }
}
