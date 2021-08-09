package Recursion;

import java.util.Scanner;

public class FirstIndexOfOcurrenceOfGivenTargetInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstIndexOfTarget(arr, 0,x));
        System.out.println(firstIndexOfTarget1(arr,0,x));
    }
// this is best approch you are comapring in first position in it
    private static int firstIndexOfTarget1(int[] arr, int i, int x) {
        if(i==arr.length)
            return -1;
        if(arr[i]==x)
            return i;
        else
        {
            int minId=firstIndexOfTarget1(arr,i+1,x);
            return minId;
        }
    }

    //this is not good approch you are going deep in recursion you can detect the element in first occurrence also
    private static int firstIndexOfTarget(int[] arr, int i, int x) {
        if(i==arr.length)
            return -1;
        int firstInd=firstIndexOfTarget(arr,i+1,x);
        if(arr[i]==x){
            return i;
        }
        else{
            return firstInd;
        }
    }
}
