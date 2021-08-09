package Heap;

import java.util.PriorityQueue;

public class KSortedArrray {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        int k=3;
        kSortedArray(arr,arr.length,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void kSortedArray(int[] arr, int length, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
               // System.out.println(i-k+" "+pq.peek());
                arr[i-k]=pq.poll();
            }
        }
        while (pq.size()>0){
          arr[length-pq.size()]=  pq.poll();
        }
    }
}
