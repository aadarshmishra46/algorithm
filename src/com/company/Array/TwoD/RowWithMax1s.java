package com.company.Array.TwoD;

import java.util.Scanner;

public class RowWithMax1s {
    public static void rowWithMax1s(int[][] arr,int m,int n){
        int maxCount=0;
        int maxCountIndex1=0;
        for (int i = 0; i < m; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1){
                    count=n-j;
                    break;
                }
            }
            if(maxCount<count){
                maxCount=count;
                maxCountIndex1=i;
            }
        }
        System.out.println(maxCountIndex1);
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
        rowWithMax1s(arr,m,n);
    }
}
