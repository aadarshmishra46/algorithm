package com.company.Array.TwoD;

import java.util.Scanner;

public class DigaonalSum {
    public static void digaonalSum(int[][] arr,int n){
        long primaryDigaonalSum=0;
        long secondaryDigaonalSum=0;
        for (int i = 0; i < n; i++) {
            primaryDigaonalSum +=arr[i][i];
            secondaryDigaonalSum +=arr[i][n-i-1];
        }
        System.out.println(primaryDigaonalSum +" "+secondaryDigaonalSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        digaonalSum(arr,n);
    }

}
