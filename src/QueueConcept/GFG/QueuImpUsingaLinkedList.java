package QueueConcept.GFG;

public class QueuImpUsingaLinkedList {
    Node front;
    Node rear;
    int size;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void enQueue(int data){
        Node new_node=new Node(data);// data null----front, quue
        if(front==null) {
            front = new_node;
            rear=new_node;
            size++;
            return;
        }

        rear.next=new_node;
        rear=new_node;

        size++;
    }
    public void deQueue(){
        if(front==null) {
            System.out.println("Queue is Empty");
            return;
        }
        front=front.next;
        size--;
    }
    public int front(){
        if(front==null) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }
    public int rear(){
        if(front==null) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }
    public void print(){
        Node temp=front;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        QueuImpUsingaLinkedList queue= new QueuImpUsingaLinkedList();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.print();

        System.out.println(queue.size);
        queue.enQueue(10);
        queue.print();

        System.out.println(queue.size);
    }

}
