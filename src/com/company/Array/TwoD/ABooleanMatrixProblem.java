package com.company.Array.TwoD;

import java.util.Scanner;

public class ABooleanMatrixProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            boolean checkContain1=false;
            for (int i = 0; i < m; i++) {
                checkContain1=false;
                for (int j = 0; j < n; j++) {

                    arr[i][j] = sc.nextInt();
                    if(arr[i][j]==1){
                        checkContain1= true;
                        break;
                    }
                }
                if(checkContain1)
                    for (int j = 0; j < n; j++) {
                        System.out.print(1+" ");
                    }
                else
                    for (int j = 0; j < n; j++) {
                        System.out.print(0+" ");

                    }
                System.out.println();
                checkContain1= true;
            }
        }
    }
}
