package Recursion;

import java.util.Scanner;

public class MaxElementAnArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxElementInArray(arr,0));
    }

    private static int maxElementInArray(int[] arr, int i) {
        if(arr.length-1==i)
            return  arr[i];
       int max1= maxElementInArray(arr,i+1);
       int max=arr[i];
       int res=0;
       if(max<max1)
           res=max1;
       else
           res = max;
       return res;

    }
}
