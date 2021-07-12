public class MergeLinkedListDemo {
    Node head;// for first elemenet refernce

    public void add(Node n) {
        //for check head
        if (head == null) {
            head = n;
        } else {
            //using iteration i will add data to the list
            //store temp of head
            Node temp = head;
            while (temp.next != null) {/// for go up till end node and check wether the last elmenet address part refer null or not then break the loop
                temp = temp.next;
                temp.next = n;
            }
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null)
            System.out.print(temp.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MergeLinkedListDemo list1=new MergeLinkedListDemo();
        MergeLinkedListDemo list2=new MergeLinkedListDemo();

        list1.add(new Node(1));
        list2.add(new Node(1));
       // list1.head=new sort()
    }
}
 class Node{
    int data;//instance varibles
     Node next;

     public Node(int data) {
         this.data = data;
         next=null;

     }
 }
 //for sorting the list
//