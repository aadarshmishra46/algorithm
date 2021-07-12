package LinkedListConcept;

public class MyLinkedList <E>{
    Node<E> head;
    void add(E data){
        Node<E> toAdd=new Node<E>(data);
        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
    boolean isEmpty(){
        return head==null;
    }
     void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next=null;
        }
    }
}
