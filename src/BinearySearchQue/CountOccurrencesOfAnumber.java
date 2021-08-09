package BinearySearchQue;

import java.util.Scanner;

public class CountOccurrencesOfAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int x=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int l=countOccurrences(arr,n,x,true);
        int r=countOccurrences(arr,n,x,false);
        if(l==-1 || r==-1){
            System.out.println("Occurrences ="+0);
        }
        else
            System.out.println(r-l+1);
    }

    private static int countOccurrences(int[] arr, int n, int x,boolean first) {
        int l=0;
        int h=n-1;
        int res=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==x){
                res=mid;
                if(first)
                    h=mid-1;
                else
                    l=mid+1;
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return res;
    }
}
