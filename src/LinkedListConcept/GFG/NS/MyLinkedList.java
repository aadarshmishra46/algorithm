package LinkedListConcept.GFG.NS;

public class MyLinkedList<E> {
    Node head;//null
    private int size;
    public class Node {
        E data;
        Node next;
        public Node(E data) {    // [data null]
            this.data = data;
            next = null;
        }
    }
        public  boolean isEmpty(){
            if(head==null)
                return true;
            return  false;
        }
        //insert
        public  void insertAtFront(E data){
            Node new_node=new Node(data);//

           if(isEmpty()){
               head=new_node;//[data null]<----new_node<----head
               size++;
               return;
           }
           new_node.next=head;
            head=new_node;
            size++;
        }
       public void insertAtLast(E data){
        Node new_node=new Node(data); // data null;
           if(isEmpty()){
               head=new_node;//[data null]<----new_node<----head
               size++;
               return;
           }
           Node temp=head;
           while (temp.next!=null) {
               temp=temp.next;
           }
           // temp----> data1 null;
           temp.next=new_node;
           size++;
       }
        public void insertAtAfterGivenNode(E data,E key){// 20
             Node new_node=new Node(key);
             Node temp=head;
         while (temp.data!=data && temp.next!=null){
                 temp=temp.next;
         }
             if(temp.data==data){
                 if(temp.next==null){
                     temp.next=new_node;
                     size++;
                     return;
                 }
                 new_node.next=temp.next;
                temp.next=new_node;
                 size++;
                 return;
             }
                 System.out.println("Not Possible");
        }
        /*...................................Deletion............................................*/
        // delete at front
        public void deleteAtFront(){
            //check list is empty
            if(isEmpty()){
                System.out.println("Deletion is not possible");
                return;
            }
            // if list have only one element
            if(head.next==null){
                head=null;
                size--;
                return;
            }
            // if list have more than one element
            head=head.next;
            size--;
        }
    public void deleteAtLast(){
        //check list is empty or not
        if(isEmpty()){
            System.out.println("Deletion is not possible");
            return;
        }
        // if list have only one element
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        // if list have more than one element
        //5--->6--->7-->null    (6.next=null)  5--->6-->null
        Node temp=head;
        while (temp.next.next!=null){//temp=6   temp.next=7  temp.next.next=null
            temp=temp.next;//
        }
        temp.next=null;
        size--;

    }
    public void DeleteAGivenNode(E data){
        if(head.data==data){
            deleteAtFront();
            return;
        }
        Node temp=head;
        while (temp.next!=null && temp.next.data!=data) {//  null
            temp=temp.next;
        }
        //5--->6--->7-->8-->null    6.next.data 7
        if(temp.next==null && temp.data==data){
            deleteAtLast();
            return;
        }
        if(temp.next==null && temp.data!=data){
            System.out.println("Element not found");
            return;
        }
        temp.next=temp.next.next;
        size--;
    }
       public void print(){
        Node temp=head;
        if(isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
           System.out.println();
       }

    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
//        System.out.println(list.head);
//        System.out.println(list.isEmpty());
//        list.insertAtFront(10);
//        System.out.println(list.head.data);
//        list.insertAtFront(20);
//        System.out.println(list.head.next.data);
//        System.out.println(list.isEmpty());
//        System.out.println(list.isEmpty());
////        list.insertAtLast(10);// 10
////        list.insertAtLast(20);// 10 20
////        list.insertAtLast(30);// 10 20 30
////        list.insertAtFront(20);// 20 10 20 30
////        list.insertAtFront(50);// 50 20 10 20 30
////        list.insertAtLast(60);// 50 20 10 20 30 60
////        list.insertAtLast(70);
////        list.insertAtFront("SABA");
////        list.insertAtLast(10.5);
////        list.insertAtAfterGivenNode(50,80);
////        list.insertAtAfterGivenNode("SABA","Zeenat");
////       list.print();
////        System.out.println(list.size);
        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtFront(30);
        list.insertAtFront(40);
        list.insertAtFront(50);
        list.insertAtFront(60);
        list.print();
        list.DeleteAGivenNode(60);
        list.DeleteAGivenNode(10);
        list.DeleteAGivenNode(30);
        list.DeleteAGivenNode(90);
        list.print();//50 40 20-->null
        System.out.println(list.size);
    }
}
