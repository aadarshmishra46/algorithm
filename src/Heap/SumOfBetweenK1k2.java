package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SumOfBetweenK1k2 {
    public static void main(String[] args) {
        //int[] arr={1,3,12,5,15,11};
        int[] arr= {20 ,8 ,22, 4, 12, 10, 14

        };//4 8 10 12 14 20 22
        int k1=3;
        int k2=6;
        //1 3 5 11 12 15 ans 11+12=23
        int min1=sumOfBetweenK1k2(arr,k1);
        System.out.println(min1);
        int min2=sumOfBetweenK1k2(arr,k2);
        System.out.println(min2);
        int res=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>min1 && arr[i]<min2){
                res=res+arr[i];
            }
        }
        System.out.println(res);

    }

    private static int sumOfBetweenK1k2(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());// max heap
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size()>k){
               int x= pq.poll();
            }
        }
        return pq.peek();
    }


}
