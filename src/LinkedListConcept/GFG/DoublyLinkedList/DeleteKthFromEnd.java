package LinkedListConcept.GFG.DoublyLinkedList;

public class DeleteKthFromEnd {
    Node head;
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
        //push at front
        public void push(int data){
            Node new_node=new Node(data);// null data null
            new_node.next=head;
            new_node.prev=null;
            if(head!=null){
                head.prev=new_node;
            }
            head=new_node;
        }
        //delete kth node from end
       public void deleteKthFromEnd(int k){
        Node tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        if(k==1){
            if(tail.prev==null){
                head=null;
                return;
            }
            tail.prev.next=null;
            tail.prev=null;
            return;
        }
        Node temp=tail;
           for (int i = 0; i < k-1; i++) {
               temp=temp.prev;
           }
           if(temp.prev==null){
               head.next.prev=null;
               head=head.next;

               return;
           }
           else
           {
               temp.prev.next=temp.next;
               temp.next.prev=temp.prev;
               return ;
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
        DeleteKthFromEnd list=new DeleteKthFromEnd();
        list.push(40);
        list.push(30);
        list.push(20);
        list.push(10);

        list.print();
        System.out.println();
        list.deleteKthFromEnd(1);
        list.print();
    }


}
