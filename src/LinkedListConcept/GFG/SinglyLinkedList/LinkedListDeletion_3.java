package LinkedListConcept.GFG.SinglyLinkedList;

public class LinkedListDeletion_3 {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
        }
        // to add data front;
        public void push(int data){// list.push(10)
          Node temp=new Node(data); // data:null
          temp.next=head;
          head=temp;
        }
        public void deleteNode(int key){
           Node temp=head; // address-->head
            Node prev=null;// null
            if(temp!=null && temp.data==key ){
                head=temp.next;
                return;
            }
            while (temp!=null  && temp.data!=key){
                prev=temp;
                temp=temp.next;
            }
            if(temp==null){
                return;
            }
           prev.next=temp.next;

        }
        public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        }

    public static void main(String[] args) {
        LinkedListDeletion_3 list=new LinkedListDeletion_3();
        list.push(7);// 7 null
        list.push(1);// 1 7 null
        list.push(3);//3 1 7 null
        list.push(2);// 2 3 1 7 null
        list.print();
        System.out.println();
        list.deleteNode(3);
        list.print();
    }

}
