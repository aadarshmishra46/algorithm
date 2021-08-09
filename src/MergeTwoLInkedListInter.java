public class MergeTwoLInkedListInter {
Node head;
// first i will create for adding element
    public  void add(Node node){// add at last position
        if(head==null) {
            head = node;

        }
else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = node;
        }
        //print
    }
    public  void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoLInkedListInter ll1=new MergeTwoLInkedListInter();
        MergeTwoLInkedListInter ll2=new MergeTwoLInkedListInter();
        Merger merger=new Merger();

        ll1.add(new Node(10));
        ll1.add(new Node(20));
        ll1.add(new Node(30));
        ll2.add(new Node(1));
        ll2.add(new Node(15));
        ll2.add(new Node(40));
        ll2.add(new Node(50));


        ll1.print();
        ll2.print();
        ll1.head=merger.merge(ll1.head,ll2.head);
        ll1.print();

    }
}
class Merger{
    Node merge(Node headl1, Node headl2){
        // dummy node
        Node temp=new Node(0);
        Node end=temp;
        while (true){//n+m
            if(headl1==null)
            {
                end.next=headl2;
                break;
            }
            if(headl2==null)
            {
                end.next=headl1;
                break;
            }
            if(headl1.data<=headl2.data){
                end.next=headl1;
                headl1=headl1.next;
            }
            else
            {
                end.next=headl2;
                headl2=headl2.next;
            }
            end=end.next;
        }
        return temp.next;
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
