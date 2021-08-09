package LinkedListConcept.GFG.NS;

public class CircularLinkedList {
    Node head;
    Node last;
    class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            next=null;
        }
    }

    // add at front

    public  void insertAtFront(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            last=head;
            return;
        }
        // 0 1 2 3
        new_node.next=head;
        head=new_node;
    }
    public  void insertionAtLast(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            last=head;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        last=new_node;
    }
    public void lastToHead(){
        // last nod.next=null;
        last.next=head;
    }
// last---->head
    public void print(){
        Node temp=head;
        while (temp.next!=head){//10 -20 -30- head

            System.out.print(temp.data+"-->");//10 20
            temp=temp.next;

        }
        System.out.println(temp.data+"-->"+temp.next.data+".......");

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
        list.insertAtFront(10);// 10
        list.insertAtFront(20);// 20 10
        list.insertAtFront(30);// 30 20 10
        list.insertionAtLast(40);// 30 20 10 40
        list.lastToHead();

       list.print();

    }
}
