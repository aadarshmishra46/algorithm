package BinearySearchQue;

import java.util.Scanner;

public class  SearchElementInCircularSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(SearchElement(arr,n,x));
    }

    private static int SearchElement(int[] arr,int n,int x) {
        int low=0;
        int high=n-1;
        while (low<=high){//          // you are searching 3  14   4
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<=arr[high]){ // 12 15 1 2 3  mid 1 high 5
                if(x>arr[mid] && x<=arr[high]){
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            else if(arr[low]<=arr[mid]){//
                if(x>=arr[low] && x<arr[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
