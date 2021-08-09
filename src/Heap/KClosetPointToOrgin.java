package Heap;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosetPointToOrgin {
    public static void main(String[] args) {
        int[][] coordinates={{3,3},{5,-1},{-2,4}};
        int k=2;
        //orgin (0,0)
        kclosetPointToOrgin(coordinates,k);
    }

    private static void kclosetPointToOrgin(int[][] coordinates, int k) {
        PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> pq = new PriorityQueue<>(new Comparator<Pair<Integer, Pair<Integer, Integer>>>() {
            @Override
            public int compare(Pair<Integer, Pair<Integer, Integer>> o1, Pair<Integer, Pair<Integer, Integer>> o2) {
                if (o1.getKey() > o2.getKey()) {
                    return -1;
                } else if (o1.getKey() < o2.getKey()) {
                    return 1;
                } else
                    return 0;
            }
        });//max heap
        for (int i = 0; i < coordinates.length; i++) {
                int dis = (coordinates[i][0] * coordinates[i][0]) + (coordinates[i][1] * coordinates[i][1]);
                // System.out.println(dis);
                pq.add(new Pair<>(dis, new Pair<>(coordinates[i][0], coordinates[i][1])));
                if (pq.size() > k) {
                    pq.poll();
                }
        }
        while(pq.size()>0) {
            System.out.print(pq.peek().getValue().getKey() + "," + pq.peek().getValue().getValue());
            pq.poll();
           System.out.println();
        }
    }


}
