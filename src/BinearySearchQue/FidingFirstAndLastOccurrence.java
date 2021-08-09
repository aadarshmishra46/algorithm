package BinearySearchQue;


import java.util.Scanner;

public class FidingFirstAndLastOccurrence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(firstOccurrences(arr,n,x));
        System.out.println(lastOccurrences(arr,n,x));
    }

    private static int lastOccurrences(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return res;
    }

    private static int firstOccurrences(int[] arr, int n,int x) {
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
             res=mid;
             high=mid-1;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return res;
    }


}
