package LinkedListConcept;

public class MyLinkedListDemo1 {
    public static void main(String[] args) {

    }
}
class LinkedList{
    private int size;
    private Node start;
    public LinkedList(){
        size=0;
        start=null;
    }
    public boolean isEmpty(){
        if(start==null){
            return true;
        }
        else
            return false;
    }
    public int getSize(){
        return size;
    }
    public void print(){
        Node t;
        if(isEmpty()){
            System.out.println(start.getData());
        }
        else
        {
            t=start;
            for (int i = 0; i < size; i++) {
                System.out.print(" "+t.getData());
                t=t.getNext();
            }
        }
    }
    public void insertAtFirst(int val){
        Node n;
        n=new Node();
        n.setData(val);
        n.setNext(start);
        size++;
    }
    public void insertAtLast(int val){
        Node n,t;
        n=new Node();
        n.setData(val);
        t=start;
       if(t==null){
           start=n;
       }
       else {
           while (t.getNext() != null) {
               t = t.getNext();
           }
           t.setNext(n);
       }
       size++;
    }
    public void insertAtPos(int val,int pos){
        if(pos==1){
            insertAtFirst(val);
        }
        else if(pos==size+1){
            insertAtLast(val);
        }
        else if(pos>1 && pos<=size){
            Node n,t;
            n=new Node(val,null);
            t=start;
            for (int i = 1; i < pos-1; i++) {
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else{
            System.out.println("Insertion is not possible at position "+pos);
        }
    }
}

class Node{
    private int data;
    private Node next;
    public Node(){
        data=0;
        next=null;
    }
    public Node(int d,Node n){
        data=d;
        next=n;
    }
    public void setData(int d){
        data=d;
    }
    public void setNext(Node n){
        next=n;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
}
