package Recursion;

import java.util.Scanner;

public class FirstOccurrenceInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      //  System.out.println(firstOccernceInAnArray(arr,0,arr[0]));
    }
/*
    private static int firstOccernceInAnArray(int[] arr, int i,int val) {
        if (i == arr.length)
            return -1;
        if (arr[i + 1] == val) {
            return val;
        } else {
            int first = firstOccernceInAnArray(arr, i + 1, arr[i+1]);
            return first;

        }
    }

 */
}
