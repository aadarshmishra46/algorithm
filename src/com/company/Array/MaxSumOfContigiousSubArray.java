package com.company.Array;

import java.util.ArrayList;

public class MaxSumOfContigiousSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        int max=0;
        for (int i = 0; i < k; i++) {
            max +=arr[i];
        }
        System.out.println(max);
        int max1=0;
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 1; i < arr.length-3; i++) {
            for (int j = i; j < i+3; j++) {
                al.add(arr[i]);
                max1 +=al.get(arr[i]);
            }
            al.remove(arr[i]);
            if(max<max1){
                max=max1;
            }

        }

/*

        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i+1; j < arr.length; j++) {
               sum +=arr[j];
                if(sum>maxSum)
                {
                    maxSum=sum;
                }
            }
            
        }
        System.out.println(maxSum);

 */
    }
}
