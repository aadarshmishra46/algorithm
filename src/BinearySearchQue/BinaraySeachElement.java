package BinearySearchQue;

import javafx.collections.ObservableIntegerArray;

import java.util.Scanner;

public class BinaraySeachElement {
    public static void binarySearchUsingIteration(int[] arr,int start, int end, int x){
        boolean check=false;
        while (start<=end){
            int mid=start +(end-start)/2;// 1 2 3 4 5
            if(arr[mid]==x){
                System.out.println(x+" present in array at index: "+mid);
                check=true;
                break;
            }
            else if(arr[mid]<x){// for reverse else if(arr[mid]<x)
                start=mid+1;
            }
            else{//arr[mid]>x
                end=mid-1;
            }

        }
        if(check==false)
            System.out.println("Number is not present in array");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();// search this element

        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        binarySearchUsingIteration(arr,0,n-1,x);
    }
}
