package LinkedListConcept.GFG.NS;

public class MyLInkedLIstDeletion {
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
    public void add(int data){//
        Node temp=new Node(data);// data null<-----temp
        if(head==null){
            head=temp;
            return;
        }
        // 5 null
        temp.next=head;
        head=temp;
    }
    // delete at front
    public void deleteAtFront(){
        //check list is empty
        if(head==null){
            System.out.println("Deletion is not possible");
            return;
        }
        // if list have only one element
        if(head.next==null){
            head=null;
            return;
        }
        // if list have more than one element
        head=head.next;
    }
    public void deleteAtLast(){
        //check list is empty or not
        if(head==null){
            System.out.println("Deletion is not possible");
            return;
        }
        // if list have only one element
        if(head.next==null){
            head=null;
            return;
        }
        // if list have more than one element
        //5--->6--->7-->null    (6.next=null)  5--->6-->null
        Node temp=head;
        while (temp.next.next!=null){//temp=6   temp.next=7  temp.next.next=null
            temp=temp.next;//
        }
        temp.next=null;

    }
    public void DeleteAGivenNode(int data){
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
    }

    public  void print(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
       System.out.println("null");
    }
    public static void main(String[] args) {
        MyLInkedLIstDeletion list=new MyLInkedLIstDeletion();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.print();// 30 20  10
//        list.deleteAtFront();
//        list.deleteAtFront();
//        list.deleteAtFront();
//        list.print();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.print();//60 50 40 30 20 10
//        list.deleteAtLast();
//        list.print();//60 50 40 30 20
//        list.deleteAtLast();//60 50 40 30 20
//        list.print();//60 50 40 30
//        list.deleteAtLast(); //60 50 40 30
//        list.deleteAtLast();//60 50 40
//        list.print();// 60 50
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.print();
            list.DeleteAGivenNode(60);
            list.DeleteAGivenNode(10);
            list.DeleteAGivenNode(30);
            list.DeleteAGivenNode(90);
            list.print();//50 40 20-->null



    }

}
