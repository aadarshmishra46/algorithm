package StackConcept.gfgStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaxRectangle {
    private static void maxRectangle(int[][] arr, int n, int m) {

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        maxRectangle(arr,n,m);
    }


}
