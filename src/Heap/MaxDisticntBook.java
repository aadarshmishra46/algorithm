package Heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxDisticntBook {
    public static int maxDistinctBook(int[] arr, int n, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y) -> y - x);
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            pq.add(map.get(key));
        }
        while (k!=0){
            int f= pq.poll()-1;
            if(f!=0){
                pq.offer(f);
            }
            k--;
        }
        return pq.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(maxDistinctBook(arr,n,k));
        }
    }
}
