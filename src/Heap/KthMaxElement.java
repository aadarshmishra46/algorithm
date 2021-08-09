package Heap;

import java.util.PriorityQueue;

public class KthMaxElement {
    public static void main(String[] args) {
        int[] arr={7,4,3,2,5,8,10,11,12};// 2 3 4 5 7 8 10 11 12 ans=10;
        int k=3;
        System.out.println( kthMaxElement(arr,arr.length,k));
    }

    private static int kthMaxElement(int[] arr, int length, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < length; i++) {
           pq.add(arr[i]);
            System.out.println("Queue"+pq);
            if(pq.size()>k){
                pq.poll();
            }
            System.out.println("Queue"+pq);
        }
        return pq.peek();
    }
}
