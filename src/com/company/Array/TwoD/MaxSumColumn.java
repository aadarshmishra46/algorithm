package com.company.Array.TwoD;


import java.util.Scanner;

public class MaxSumColumn{
    public static void maxColumnSum(int[][] arr,int m,int n){
        long maxSum=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < m; j++) {
                sum +=arr[j][i];
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        maxColumnSum(arr,m,n);
    }
}
