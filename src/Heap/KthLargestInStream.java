package Heap;

import java.util.*;

public class KthLargestInStream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while (t-->0){
         int n=sc.nextInt();
         int k=sc.nextInt();
         int[] arr=new int[n];
         for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
         }
         kthlargestElementInStream(arr,n,k);
     }
      
    }

    private static void kthlargestElementInStream(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //min heap
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
           if(pq.size()>=k){
               int val=pq.poll();
               if(min<val){
                   min=val;
                   System.out.print(val+" ");
               }
               else
               {
                   System.out.print(min+" ");
               }
           }
           else
               System.out.print(-1+" ");
        }
        System.out.println();
    }
}
