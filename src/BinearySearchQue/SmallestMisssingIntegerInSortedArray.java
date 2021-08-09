package BinearySearchQue;

import java.util.Scanner;

public class SmallestMisssingIntegerInSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(smallestMisssingIntegerInSortedArray(arr,n));
    }

    private static int smallestMisssingIntegerInSortedArray(int[] arr, int n) {//0 1 2 5 6 7 8
        int low=0;
        int high=n-1;
        int ind=0;

        while (low<=high){//0 1 2 6 9 11 15
            int mid=low+(high-low)/2;//mid=1
            if(arr[mid]==mid){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }



        }
return low;
    }

}
