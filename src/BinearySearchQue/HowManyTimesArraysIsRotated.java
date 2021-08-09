package BinearySearchQue;

import java.util.Scanner;

public class HowManyTimesArraysIsRotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(NumberOfRotation(arr,n));
    }
// time complexity linear search.....O(n)....
   /* private static int NumberOfRotation(int[] arr, int n) {
        int min=arr[0];
        int minInd=0;
        for (int i = 1; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
                minInd=i;
            }
        }
        return minInd;
    }

    */
    // using Binary Search... log(n).....
        private static int NumberOfRotation(int[] arr, int n) {
            int low=0;
            int high=n-1;
            while (low<=high){
                if (arr[low]<=arr[high])
                    return low;
                int mid=low+(high-low)/2;
                int next=(mid+1)%n;
                int prev=(mid+n-1)%n;
                if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                    return mid;
                }
                else if(arr[mid]<=arr[high]){
                    high=mid-1;
                }
                else if(arr[mid]>=arr[low]){
                    low=mid+1;
                }
                else
                {
                    return -1;// if wrong input
                }

            }
            return -1;

        }
}
