package com.company.Array.TwoD;

import java.util.Scanner;

public class GooodCells {
    public static void countGoodCells(int[][] arr,int m,int n){
     int count=0;
        for (int i = 1; i <m-1 ; i++) {
            for (int j = 1; j < n-1; j++) {
                if(arr[i+1][j]==1 && arr[i-1][j]==1 && arr[i][j+1]==1 && arr[i][j-1]==1){
                    count++;
                }

            }

        }
        System.out.println(count);
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
        countGoodCells(arr,m,n);
    }
}
