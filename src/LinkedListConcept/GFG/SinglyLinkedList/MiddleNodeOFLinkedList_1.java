package LinkedListConcept.GFG.SinglyLinkedList;

public class MiddleNodeOFLinkedList_1 {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    //push at last
    public void append(int data){
        Node temp=new Node(data);
        temp.next=null;
        Node end=head;
        if(head==null){
            head=new Node(data);
            return;
        }
        while (end.next!=null){
            end=end.next;
        }
        end.next=temp;
        return;
    }
    /*
    //finding by count the middle
    public void printMiddleNode(){
        //find size
        Node temp= head;
        int count=0;
        if(head==null){
            System.out.println("Empty List");
            return;
        }

        while (temp!=null){
            temp=temp.next;
            count++;
        }
        int ind=0;
        if(count==0){
            ind=count/2+1;
        }
        else {
            ind = count / 2;
        }
        Node res=head;
        for (int i = 0; i <ind ; i++) {
                res=res.next;
        }
        System.out.println(res.data);
    }

     */
    public void printMiddleNode(){
        Node slow=head;
        Node fast=head;
        if(head==null){
            System.out.println("Out of bound");
            return ;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
        MiddleNodeOFLinkedList_1 list=new MiddleNodeOFLinkedList_1();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.printMiddleNode();
    }
}
