package com.company.Array.DsaArena_1DArrays;

import java.util.Scanner;

/*

N numbers are arranged in Circle. Find the Sum of all K contiguous Sub-arrays.
Input
The first line of the input contains an integer arrSize, length of the Array.
The next line contains arrSize integers which are elements of the Array.

User task: Since this is a functional problem you don't have to worry about the input. You just have to complete the function kCircleSum(arr, arrSize, k) which contains arr(array) and arrSize(size of array) and k as a parameter

Constraints
1<=arrSize<=100000
1<=arr[i]<=100000
1<=k<=arrSize
Output
You need to print N space-separated integers ith integer denoting Sum of sub-array of length k starting at index i.
Example
Sample Input
3 1
1 2 3

Sample Output
1 2 3

Explanation : k=1 so ans is 1, 2, and 3.

Sample Input
5 2
6 4 3 4 1

Sample Output
10 7 7 5 7
 */
public class KCircleSum {
    /*
    static void  kCircleSum(int arr[],int n,int k){
        for (int i = 0; i < n; i++) {//3
            int sum=0;
            for (int j = 0; j <=k-1; j++) {
                int ind=i+j;
               ind=ind%n;
               sum=sum+arr[ind];

            }
            System.out.print(sum+" ");

        }
    }

     */
    static void  kCircleSum(int arr[],int n,int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum +=arr[i];
        }
        System.out.print(sum+" ");//10
        for (int i = k; i <n+k-1 ; i++) {
            sum +=arr[i%n]-arr[(i-k)%n];
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        kCircleSum(arr,n,k);
    }
}
