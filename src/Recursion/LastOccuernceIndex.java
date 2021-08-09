package Recursion;

import java.util.Scanner;

public class LastOccuernceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lastOccurrence(arr,0,x));
    }
    public static int lastOccurrence(int[] arr,int i,int x){
        if(arr.length==i)
            return -1;

        int lastInd=lastOccurrence(arr,i+1,x);
        if(lastInd==-1)
            if(arr[i]==x)
                return i;
            else
                return -1;
            else{
                return lastInd;
        }
    }
}
