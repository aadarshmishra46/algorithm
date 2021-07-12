package LinkedListConcept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();
       ll.add(2);
       ll.add(4);
       ll.add(5);
       ll.add(6);
        Scanner sc=new Scanner(System.in);//
        int n=sc.nextInt();
        System.out.print("You Linked list: "+ll);
        ll.remove(ll.size()-n-1);
        System.out.println();
        System.out.println("After removeing nth  the element form last linkedlist"+ll);

    }
}
