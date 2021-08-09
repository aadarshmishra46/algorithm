package LinkedListConcept.GFG.DoublyLinkedList;

public class ReversingLL {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }
    //push at front
    public void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        new_node.prev=null;
        if(head!=null){
            head.prev=new_node;
        }
        head=new_node;
    }
    //reversing a linkedlist
    public void reverse(){
        Node temp=null;
        Node current=head;
        while (current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp !=null){
            head=temp.prev;
        }




    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }

    public static void main(String[] args) {
        ReversingLL list=new ReversingLL();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
    }
}
