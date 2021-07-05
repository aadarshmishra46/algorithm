package com.company.Array.DsaArena_1DArrays;

import java.util.Scanner;

/*

Given an array of N elements and an integer D. Your task is to rotate the array D times in a circular manner from the right to left direction. Consider the examples for better understanding:-
Try to do without creating another array
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions rotate() that takes the array, size of the array, and the integer d as a parameter.

Constraints:
1 <= T <= 25
2 <= N <= 10^4
1<=D<=10^5
1 <= A[i] <= 10^5
Output
For each test case, you just need to rotate the array by D times. The driver code will prin the rotated array in a new line.
Example
Sample Input:
2
8
4
1 2 3 4 5 6 7 8
10
3
1 2 3 4 5 6 7 8 9 10


Sample Output:
5 6 7 8 1 2 3 4
4 5 6 7 8 9 10 1 2 3
Explanation(might now be the optimal solution):
Testcase 1:
Follow the below steps:-
After the first rotation, the array becomes 2 3 4 5 6 7 8 1
After the second rotation, the array becomes 3 4 5 6 7 8 1 2
After the third rotation, the array becomes 4 5 6 7 8 1 2 3
After the fourth rotation, the array becomes 5 6 7 8 1 2 3 4
Hence the final result: 5 6 7 8 1 2 3 4
 */
public class ArrayRotation {
    //bruteforce algo time complexity O(n*d)
   /*
    public static void rotate(int arr[], int n, int d){

        for (int i = 0; i < d; i++) {
            int first=arr[0];
            int last=arr[arr.length-1];
            int temp=0;
            for (int j = arr.length-2; j >=0 ; j--) {
                temp=arr[j];//4
                arr[j]=last;//5
                last=temp;
            }
            arr[arr.length-1]=first;


        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    */
    //2. array rotation time complexity O(n) space O(n)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n= sc.nextInt();
            int d= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
           // rotate(arr,n,d);

        }
    }
}
