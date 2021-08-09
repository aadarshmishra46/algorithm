package LinkedListConcept.GFG.DoublyLinkedList;

public class IntroDLL {
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
        Node new_node=new Node(data); //null data null
        new_node.next=head;
        new_node.prev=null;
        if(head!=null){
            head.prev=new_node;
        }
        head=new_node;
    }
    //append at last
    public void append(int data){
        Node new_node=new Node(data);// null data null
        //trace to last head

        if(head==null){
            head=new Node(data);
            head=new_node;
            return;
        }
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
       // ptr datalast null
        last.next=new_node;
        new_node.prev=last;
        new_node.next=null;
    }
    //insert After
    public void insertAfter(Node prev_Node, int data){
        Node new_node=new Node(data);//null data null
        //b.next== cRefernce
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
//        if (prev_Node.next==null){
//            prev_Node.next=new_node;
//            new_node.prev=prev_Node;
//            new_node.next=null;
//            return;
//        }


        new_node.next=prev_Node.next;// new
        new_node.prev=prev_Node;
        prev_Node.next=new_node;
        if (new_node.next != null)// if you are not use this if then you can use comment if case
        new_node.next.prev=new_node;


    }
//isnertB before
    public  void insertBefore(Node ahead,int data){
        Node new_node=new Node(data);//null data null
        if(ahead.prev==null){
            ahead.prev=new_node;
            new_node.prev=null;
            new_node.next=ahead;
            head=new_node;
            return;
        }
        new_node.next=ahead;
        ahead.prev.next=new_node;
        new_node.prev=ahead.prev;
        ahead.prev=new_node;

    }
    //print the doubly linkedlist
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        IntroDLL list=new IntroDLL();
        list.append(10);//8 7 6 5 10
        list.append(12);//8 7 6 5 10 12
        list.append(13);//8 7 6 5 10 12 13
        list.insertBefore(list.head,11);
        //list.insertAfter(list.head.next.next,2 );
        //list.insertAfter(list.head.next.next,3);
        list.print();
    }
}
