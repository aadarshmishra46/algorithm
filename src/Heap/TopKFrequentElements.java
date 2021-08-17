package Heap;

import javafx.util.Pair;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,2,2,4,4,4,5,5};// ans is 1, 2
        int k=3;

        topKFrequentsElements(arr,arr.length,k);
    }

    private static void topKFrequentsElements(int[] arr, int length, int k) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Pair::getKey));// min heap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        Iterator itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry mapElement = (Map.Entry) itr.next();
           // System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            pq.add(new Pair(mapElement.getValue(),mapElement.getKey()));
            if(pq.size()>k){
                pq.poll();
            }
        }
        while (pq.size()>0){
            System.out.println(pq.poll().getValue());
        }
    }
}
