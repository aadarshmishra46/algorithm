package com.company.Array.DsaArena_1DArrays;

import java.util.Scanner;

public class ArrayInsertAtIndex {
    // Your code here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n=sc.nextInt();
            int element=sc.nextInt();
            int ind=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {//6 90 2   1 2 3 4 5

                if(ind==i)
                    arr[i]=element;
                else
                    arr[i]=sc.nextInt();//1 2

            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");

            }
        }
    }

}
