package BinearySearchQue;

import java.util.Arrays;
import java.util.Scanner;

public class CountPossibleTriangle {
    private static int countPossibleTriangle(int[] arr, int n) {
        Arrays.sort(arr);
        int count=0;
        for (int i = n-1; i>=1 ; i--) {
            int l=0,r=i-1;
            while (l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count +=r-l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int res=countPossibleTriangle(arr,n);
            System.out.println(res);
        }
    }


}
