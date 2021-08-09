package LinkedListConcept.GFG.SinglyLinkedList;

public class GetNthNodeFromEnd {
    Node head;
    static  class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
        // push at front
        public void push(int data){
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
        }
        /* this method first count length then finnd length-index+1th data
        public void printNthFromEnd(int index) {
            Node temp = head;
            int len = 0;
            while (temp != null) {
                len++;
                temp = temp.next;
            }
            if(len<index)
                return;
            temp=head;
            for (int i = 1; i <len-index+1 ; i++) {
                temp=temp.next;
            }
            System.out.println(temp.data);

        }

         */
    //using two pointer approch
        public void printNthFromEnd(int index) {
            Node ref=head;
            Node main=head;
            int count=0;
           if(head!=null){
               while (count<index){
                   if(ref==null){
                       System.out.println("Out of bound index");
                       return;
                   }
                   ref=ref.next;
                   count++;
               }
           }
           if(ref==null){
               if(head!=null){
                   System.out.println(head.data);
               }
           }
           else
           {
               while (ref!=null){
                   main=main.next;
                   ref=ref.next;
               }
               System.out.println(main.data);
           }

        }

    public static void main(String[] args) {
        GetNthNodeFromEnd list=new GetNthNodeFromEnd();
        list.push(20);
        list.push(40);
        list.push(3);
        list.push(5);
        list.printNthFromEnd(2);
    }


}
