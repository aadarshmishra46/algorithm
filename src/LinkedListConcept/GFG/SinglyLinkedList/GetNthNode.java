package LinkedListConcept.GFG.SinglyLinkedList;

public class GetNthNode{
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    //push at front
    public void push(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
    }
    public int getNodeAt(int index){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(count==index){
                return temp.data;
            }
            count++;
            temp=temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        GetNthNode list=new GetNthNode();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list.getNodeAt(0));
    }
}
