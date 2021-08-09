package LinkedListConcept.GFG.SinglyLinkedList;
public class SearchAnElementInLinkedList  {
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
    public boolean isContains(int data){
        Node temp=head;
        boolean bool=false;
        while (temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        SearchAnElementInLinkedList list=new SearchAnElementInLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.print();
        System.out.println( list.isContains(100));
    }

}
