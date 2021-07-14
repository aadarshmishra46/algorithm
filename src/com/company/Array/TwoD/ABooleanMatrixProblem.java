package com.company.Array.TwoD;

import java.util.Scanner;

public class ABooleanMatrixProblem {
    public static void convertMat(int[][] arr,int m,int n){
        boolean check=false;
        for (int i = 0; i < m; i++) {
            check=false;
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1){
                    check=true;
                    break;
                }
            }
            if(check)
                for (int j = 0; j < n; j++)
                    System.out.print(1+" ");
            else
                for (int j = 0; j < n; j++)
                    System.out.print(0+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            convertMat(arr,m,n);
        }
    }
}
