package LinkedListConcept.GFG.SinglyLinkedList;

public class FindLengthOfLinkedList {
    Node head;
static   class Node {
    int data;
  Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
        //data pushing at end
        public void append(int new_data)
        {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
            Node new_node = new Node(new_data);

        /* 4. If the Linked List is empty, then make the
              new node as head */
            if (head == null)
            {
                head = new Node(new_data);
                return;
            }

        /* 4. This new node is going to be the last node, so
              make next of it as null */
            new_node.next = null;

            /* 5. Else traverse till the last node */
            Node last = head;
            while (last.next != null)
                last = last.next;

            /* 6. Change the next of last node */
            last.next = new_node;
            return;
        }
        public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        }

        public int size(){
            Node temp = head;
            int count = 0;
            while (temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
    public static void main(String[] args) {
        FindLengthOfLinkedList list=new FindLengthOfLinkedList();

        list.print();
        System.out.println();
        System.out.println( list.size());


    }
}
