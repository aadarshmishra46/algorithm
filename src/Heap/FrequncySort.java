package Heap;

import javafx.util.Pair;

import java.util.*;

/*
Print the elements of an array in the increasing frequency if 2 numbers have same frequency then print the one which came first.

Example:
Input : arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output : arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

 */
public class FrequncySort {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,2,2,4,4,4,5,5,6,6,7,7,8,8,9,9,9};// ans is 1 4 2 5 6 7 3
       frequencySort(arr);
    }
    private static void frequencySort(int[] arr) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if (o1.getKey() > o2.getKey()) {
                    return -1;
                } else if (o1.getKey() < o2.getKey())
                    return 1;
                else {
                    if(o1.getValue()>o2.getValue())
                        return 1;
                    else
                        return 0;
                }
            }
        });
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
       // System.out.println(hm);
        Iterator itr=hm.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry mapElements= (Map.Entry) itr.next();
            pq.add(new Pair(mapElements.getValue(),mapElements.getKey()));
        }
        while (pq.size()>0){
            System.out.print(pq.poll().getValue()+" ");
        }
    }
}


