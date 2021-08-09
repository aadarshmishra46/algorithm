package LinkedListConcept.GFG.SinglyLinkedList;

public class LengthOfDetectLoop {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    //append at front
    public void push(int data){
        Node temp=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        temp.next=null;
        Node end=head;
        while (end.next!=null){
            end=end.next;
        }
        end.next=temp;
    }
    public int lengthOfloop(){
        Node temp=head;
        Node last=null;
        int count=0;
        boolean bool=false;
        while (temp!=null){
            if(temp.data==-1){

                last=temp;
                bool=true;
                break;
            }
            System.out.println(temp.data);
            temp.data=-1;
            count++;
            temp=temp.next;


        }
        if(bool) {
            Node temp2 = head;
            int count2=0;
            while (temp2 != last) {
                count2++;
            }
            return count-count2;
        }
        return 0;
    }

    public static void main(String[] args) {
        LengthOfDetectLoop list=new LengthOfDetectLoop();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.head.next.next.next=list.head;
        System.out.println(list.lengthOfloop());
    }

}
