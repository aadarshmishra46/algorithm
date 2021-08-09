package BinearySearchQue;

import javafx.collections.ObservableIntegerArray;

import java.util.Scanner;

public class BinaraySeachElement {
    public static int binarySearchUsingIteration(int[] arr,int start, int end, int x){
      // base condition
        if(start>end) {
            return -1;
        }

            int mid=start +(end-start)/2;// 1 2 3 4 5
            if(arr[mid]==x){
               return mid;
            }
            else if(arr[mid]<x){// for reverse else if(arr[mid]<x)
                //start=mid+1;
                binarySearchUsingIteration(arr,mid+1,end,x);
            }
            else{//arr[mid]>x
                binarySearchUsingIteration(arr,start,mid-1,x);
            }
            return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();// search this element

        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println( binarySearchUsingIteration(arr,0,n-1,x));
    }
}
