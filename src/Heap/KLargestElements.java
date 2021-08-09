package Heap;

import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        int[] arr={20,4,3,2,5,8,10,11,12};// 2 3 4 5 7 8 10 11 12
        int k=3;
      kLargestElements(arr,arr.length,k);
    }

    private static void kLargestElements(int[] arr, int length, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while (pq.size()>0){
            System.out.println(pq.poll());
        }
    }
}
