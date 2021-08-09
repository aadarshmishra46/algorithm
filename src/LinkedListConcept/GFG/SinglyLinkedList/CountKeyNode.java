package LinkedListConcept.GFG.SinglyLinkedList;

public class CountKeyNode {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    //push at end
    public void append(int data){
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
        return;
    }
    //count occurunces
    public int countKey(int key){
        Node temp=head;
        int count=0;
        while (temp!=null){
            if(temp.data==key){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        CountKeyNode list=new CountKeyNode();
        list.append(12);
        list.append(12);
        list.append(13);
        list.append(12);
        System.out.println(list.countKey(12));
    }

}
