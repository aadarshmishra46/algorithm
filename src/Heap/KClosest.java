package Heap;



import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {
    public static void main(String[] args) {
        int[] arr={6,6,5,3,2,8,10,9};//2 3 5 6 8 9 10 ==5 6 8
        int k=3;
        int x=6;// find k=3 closet number of x=6
        kClosest(arr,arr.length,k,x);
    }

    private static void kClosest(int[] arr, int length, int k,int x) {
      //  first method :
        //  PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<Pair<Integer,Integer>>((a,b) -> b.getKey() - a.getKey());
        // second method: to override compare method
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<Pair<Integer,Integer>>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if(o1.getKey()>o2.getKey()){
                    return -1;
                }
                else if(o1.getKey()<o2.getKey())
                    return 1;
                return 0;
            }
        });
        for (int i = 0; i < length; i++) {
            pq.add(new Pair<>(Math.abs(arr[i]-x),arr[i]));
            if(pq.size()>k){
                pq.poll();
            }
        }
        while (pq.size()>0){
            System.out.print(pq.poll().getValue()+" ");
        }
    }
}
