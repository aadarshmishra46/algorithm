package Heap;

import java.util.PriorityQueue;

public class HeapINPriorityQueue {
    public static void main(String[] args) {
        int[] arr={7,4,3,2,5,6,10};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            System.out.println(pq);// 7 4 3
          //  System.out.println( pq.poll());//7 4
        }
        while (pq.size()!=0){
            System.out.println(pq.poll());
        }
    }
}
