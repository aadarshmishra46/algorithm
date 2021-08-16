package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Before heapSort :"+al);
        heapSort(al,n);
        System.out.println("After heapSort :"+al);
    }

    private static void heapSort(ArrayList<Integer> al, int n) {
        // build heap
        for (int i = n/2-1; i >=0 ; i--) {
            heapify(al,n,i);
        }
        //one by one extract form heap
        for (int i = n-1; i >0 ; i--) {
            Collections.swap(al,i,0);
            heapify(al,i,0);
        }
    }

    private static void heapify(ArrayList<Integer> al, int n, int i) {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && al.get(l)>al.get(largest))
            largest=l;
        if(r<n && al.get(r)>al.get(largest))
            largest=r;
        if(largest!=i){
            Collections.swap(al,i,largest);
            heapify(al,n,largest);
        }
    }
}
