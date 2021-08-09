package LinkedListConcept.GFG.SinglyLinkedList;

public class LinkedListIsPalindromeOrNot {
    Node head;
    Node slow_ptr;
    Node fast_ptr;
    Node second_half;
    class Node{
        char data;
        Node next;
        public Node(char data){
            this.data=data;
            next=null;
        }
    }
    //palindrome function
    boolean isPalindrome(Node head) {
        slow_ptr = head;
        fast_ptr = head;
        Node prev_of_slow_ptr = head;
        Node midNode = null;//to handle odd size list
        boolean res = true;
        while (fast_ptr != null && fast_ptr != null) {
            fast_ptr = fast_ptr.next.next;
            prev_of_slow_ptr = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
        if (fast_ptr != null) {
            midNode = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
        second_half = slow_ptr;
        prev_of_slow_ptr = null;
        //  reverse();
return  true;
    }
}
