package com.company.Array.DsaArena_1DArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestSubarrayOf0sAnd1s {
    static void largestSubarray(String s,int n){
        ArrayList al=new ArrayList();
        String s1="";
        for (int i = 0; i < n; i++) {
            s1="";
            for (int j = i; j <n ; j++) {
                s1=s1+s.charAt(j);
                al.add(s1);
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        String s = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");
       System.out.println(s);
        largestSubarray(s,n);
    }
}
