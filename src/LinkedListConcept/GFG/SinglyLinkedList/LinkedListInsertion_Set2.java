package LinkedListConcept.GFG.SinglyLinkedList;
/*
1) At the front of the linked list
2) After a given node.
3) At the end of the linked list.
 */
public class LinkedListInsertion_Set2 {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    //push the data at front
    public void push(int data){
        Node temp=new Node(data);// temp[data:null]
        temp.next=head;
        head=temp;
    }
    //push at end
    public void InsertAfter(Node prev_node,int data){
        if(prev_node==null){
            System.out.println("The given previous node can not be null");
            return;
        }
        Node temp=new Node(data);//temp data:null
        temp.next=prev_node.next;
        prev_node.next=temp;
    }
    public void append(int data){
        Node temp=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        temp.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=temp;
        return;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListInsertion_Set2 list=new LinkedListInsertion_Set2();
        list.append(6);// 6:null
        list.push(7);//7 6:null
        list.push(1);//1->7->6->null
        list.append(4);//1->7->6->4->null
      list.InsertAfter(list.head.next,8);
        System.out.println("created Linked List is :");
        list.print();
    }
}
