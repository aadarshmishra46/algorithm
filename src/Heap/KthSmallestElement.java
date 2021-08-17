package Heap;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr={7,4,3,2,5,8,10,11,12};// 2 3 4 5 7 8 10 11 12 ans=4;
        int k=3;
       int kthSmallest= kthSmallest(arr,arr.length, k);
        System.out.println(kthSmallest);

    }

    private static int kthSmallest(int[] arr, int n, int k) {
        // now we create one max heap that size is only 3.
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
                pq.add(arr[i]);//7
         //   System.out.println("Queue"+pq);
                if(pq.size()>k){
                    pq.poll();
                }
         //   System.out.println("Queue"+pq);
        }
        return pq.peek();
    }
}
