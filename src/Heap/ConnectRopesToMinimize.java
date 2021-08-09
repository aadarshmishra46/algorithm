package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ConnectRopesToMinimize {
    public static void main(String[] args) {
        int[] ropesLength={1,2,3,4,5};
        int minCost=connectRopesToMinimize(ropesLength);
       // System.out.println(minCost);
    }

    private static int connectRopesToMinimize(int[] ropesLength) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < ropesLength.length; i++) {
            pq.add(ropesLength[i]);//1 2 3 4 5
        }
        int res=0;
        while (pq.size()>1){
            int rope1=pq.poll();
            int rope2=pq.poll();
            res +=rope1+rope2;
      //      System.out.println(rope1+"+"+rope2+ "+"+(res-rope1-rope2)+"="+res);
            pq.add(rope1+rope2);
        }
        return res;
    }

}
