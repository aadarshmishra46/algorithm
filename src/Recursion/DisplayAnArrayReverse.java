package Recursion;

import java.util.Scanner;

public class DisplayAnArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
      //  displayAnArray(arr,n-1);// given length
        System.out.println();
        displayAnArray1(arr,0);// given index
    }

    private static void displayAnArray1(int[] arr, int i) {
        if(i== arr.length)
            return;
        displayAnArray1(arr,i+1);
        System.out.print(arr[i]+" ");
    }
}
