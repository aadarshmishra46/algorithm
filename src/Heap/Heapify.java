package Heap;

import java.util.ArrayList;
import java.util.Collections;
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
        for (int i = (n/2)-1; i>=0; i--) {
            heapify(al,al.size(),i);
        }

        System.out.println("After heapify "+al);
    }
    private static void heapify(ArrayList<Integer> al,int n, int i) {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && al.get(l)>al.get(largest)){
            largest=l;
        }
        if(r<n && al.get(r)>al.get(largest)){
            largest=r;
        }
        if(largest!=i){
            Collections.swap(al,i,largest);
            heapify(al,n,largest);
        }
    }
}
