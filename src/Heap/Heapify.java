package Heap;

import java.util.ArrayList;
import java.util.Scanner;

public class Heapify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();// for inserting an element thats why n+1
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Before heapify: "+al);
        heapify(al);
        System.out.println("After heapify "+al);
    }
    private static void heapify(ArrayList<Integer> al) {
        int last=al.get(al.size()-1);
        int i= al.size()-1;
        while (i>0){

        }
    }
}
