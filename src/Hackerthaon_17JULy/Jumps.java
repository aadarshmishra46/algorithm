package Hackerthaon_17JULy;

import java.util.HashSet;
import java.util.Scanner;

public class Jumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        int ind=0;
        int value=arr[0];
        hs.add(value);// 3
        for (int i = 1; i < k; i++) {
            ind=value-1;//3
            value=arr[ind];
           if(!hs.add(arr[ind])){
               System.out.println(ind);
               break;
           }
        }
    }
}
