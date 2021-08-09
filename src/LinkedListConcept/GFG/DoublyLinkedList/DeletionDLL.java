package LinkedListConcept.GFG.DoublyLinkedList;

public class DeletionDLL {
    Node head;
    static  class Node{
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
        Node new_node =new Node(data);//null data null
        new_node.next=head;
        new_node.prev=null;
        if(head!=null)
            head.prev=new_node;
        head=new_node;
    }
    // deletion at front
    public void deleteFront(){
        //head null data ptr
        if(head==null){
            System.out.println("Empty list");
            return;
        }
         if(head.next==null){
             head=null;
             return;
         }
        head.next.prev=null;
        head=head.next;
    }
    public void deleteEnd(){
        Node end=head;
        if(head==null){
            System.out.println("Deletion Note possible Empty List");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        while (end.next!=null){
            end=end.next;
        }
        //end --ref  prev data null
        end.prev.next=null;
        end.prev=null;
    }
    public void deleteAtbetween(int x){
        if(x==1){//delete at front
            // head refernce--- null data next
            head.next.prev=null;
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<x-1;i++){
            temp=temp.next;
        }
        if(temp.next==null){// last

            temp.prev.next=null;
            temp.prev=null;
            return;
        }
        else
        {

            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            return;
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
        DeletionDLL list=new DeletionDLL();
        list.push(10);
        list.push(20);
        list.push(30);

        list.print();
        System.out.println();
       list.deleteAtbetween(2);
        list.print();
    }

}

