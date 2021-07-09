package BinearySearchQue;

import java.util.Scanner;

public class MinimumElementInSortedAndRotatedArray {
    public static int minimum(int arr[],int n)
    {
        int low=0;
        int high=n-1;
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;

            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0)
        {
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println(minimum(arr,n));
        }
    }
}
