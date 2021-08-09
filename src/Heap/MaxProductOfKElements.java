package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxProductOfKElements {
    public static int maxProduct(int[] arr,int n,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int count=0;
        int ans=1;
        while (pq.isEmpty()==false && count<k){
            ans=ans*pq.element();
            pq.remove();
            count++;
        }
        return ans;
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
            System.out.println(maxProduct(arr,n, k));
        }
    }
}
