package LinkedListConcept.GFG.NS;

public class CircularLinkedList {
    Node head;
    // add at front
   public void insertAtFront(int data){
       Node new_node=new  Node(data);
       if(head==null){
           head=new_node;
           return;
       }
       new_node.next=head;
       head=new_node;
   }
   public void lastFix(){
       Node temp=head;
       while (temp.next!=null)
           temp=temp.next;
       temp.next=head;
   }
   public void insertionAtLast(int data){
       Node new_node=new  Node(data);
       if(head==null){
           head=new_node;
           return;
       }
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=new_node;//
   }
    public void print(){
        Node temp=head;
        while (temp.next!=head){//10 -20 -30- head
            System.out.print(temp.data+"-->");//10 20
            temp=temp.next;
        }
        System.out.println(temp.data+"-->"+temp.next.data);

    }

    public static void main(String[] args) {
      CircularLinkedList list=new CircularLinkedList();
//        list.append(10);
//        list.append(20);
//        list.append(30);
//        System.out.println(list.head.data);//10
//        System.out.println(list.head.next.data);//20
//        System.out.println(list.head.next.next.data);//30
//        System.out.println(list.head.next.next.next.data);//10
        list.insertAtFront(10);// 10 head
        list.insertAtFront(20);
        list.insertAtFront(30);
        list.insertionAtLast(40);
        list.lastFix();
       list.print();

    }
}
class Node{
    int data;
    Node next;
    public  Node(int data){
        this.data=data;
        next=null;
    }
}