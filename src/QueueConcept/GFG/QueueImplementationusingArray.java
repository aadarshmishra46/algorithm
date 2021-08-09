package QueueConcept.GFG;
class Queue{
    int front,rear,size;
    int capacity;
    int arr[];
    public Queue(int capacity){
        this.capacity=capacity;
        front=this.size=0;
        rear=capacity-1;
        arr=new int[this.capacity];

    }
    //Queue is full when size becomes equal to capacity
    boolean isFull(Queue queue){
        return (queue.size==queue.capacity);
    }
    //queue is empty when size is zero
    boolean isEmpty(Queue queue){
        return (queue.size==0);
    }
    //method to add an element to the queue it change rear and size
    void enqueue(int item){
        //chech queue is full or not
        if (isFull(this))
        return;
        this.rear=(this.rear+1)%this.capacity;
        this.arr[this.rear]=item;
        this.size=this.size+1;
        System.out.println(item+" "+"Enqueued to queue");

    }
    int dequque(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        int item=this.arr[this.front];
        this.front=(this.front+1)%capacity;
        this.size=this.size-1;
        return item;
    }
    int front(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.arr[front];
    }
    int rear(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        return this.arr[rear];
    }



}
public class QueueImplementationusingArray {
    public static void main(String[] args) {
        Queue queue=new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequque()+" dequed form Queue");
        System.out.println("Front item is "+queue.front());
        System.out.println("Rear item is "+queue.rear());
        System.out.println(queue.front);
        System.out.println(queue.rear);
        System.out.println(queue.size);
    }
}

