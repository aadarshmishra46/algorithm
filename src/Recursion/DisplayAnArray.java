package Recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DisplayAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        displayAnArray(arr,n-1);// given length
        System.out.println();
        displayAnArray1(arr,0);// given index
    }
    private static void displayAnArray(int[] arr, int n) {
        if (n < 0)
            return;
        displayAnArray(arr, n - 1);
        System.out.print(arr[n] + " ");
    }
    private static void displayAnArray1(int[] arr, int i) {
        if(i==arr.length)
            return;
        System.out.print(arr[i]+" ");
        displayAnArray1(arr,i+1);
    }
}
