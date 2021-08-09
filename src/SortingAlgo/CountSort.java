package SortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    private static void countSort(int[] arr, int n) {
        int min= Arrays.stream(arr).min().getAsInt();
        int max= Arrays.stream(arr).max().getAsInt();
        int range=max-min+1;
        int count[] =new int[range];
        int[] output =new int[n];
        for (int i = 0; i < n; i++) {
            count[arr[i]-min]++;
        }
        for (int i = 1; i < count.length ; i++) {
            count[i] +=count[i-1];
        }
        for (int i = arr.length-1; i>=0; i--) {
            output[count[arr[i]-min]-1]=arr[i];
            count[arr[i]-min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    private static void printArr(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        countSort(arr,n);
        printArr(arr,n);
    }

}
