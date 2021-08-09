package BinearySearchQue;

import java.util.Arrays;
import java.util.Scanner;

public class ChoosePoint {
// linear search
    /*
    private static int countPoint(int n, int d, int[] arr) {
        Arrays.sort(arr);//sort an arr
        int ways=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int mostDis=arr[k]-arr[i];
                    if(mostDis<=d){
                        ways++;
                    }
                }
            }
        }
        return ways;
    }

     */
    // binary search
private static int countPoint(int n, int d, int[] arr){
    Arrays.sort(arr);
    int ways=0;
    for (int i = 0; i < n; i++) {
        int indexGreater=upperBound(arr,0,n,arr[i]+d);//-3+2=-1

        int numberOfelement=indexGreater-(i+1);

        if(numberOfelement>=2){
            ways+=(numberOfelement*(numberOfelement-1)/2);
        }


    }
    return ways;
}

    private static int upperBound(int[] arr, int low, int high, int element) {//-1
        while(low<high){
            int middle=low+(high-low)/2;
            if(arr[middle]>element)
                high=middle;
            else
                low=middle+1;
        }
        return  low;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int ans=countPoint(n,d,arr);
        System.out.println(ans);
    }

}
