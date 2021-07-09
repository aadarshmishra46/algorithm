package MapConcept;

import java.util.Scanner;

public class MaxSubarraySum {
    public static long maxSubarraySum(int[] arr,int n,int k){
        int res=0;
        for (int i = 0; i < k; i++) {
            res +=arr[i];
        }
        int sum=res;//4
        for (int i = k; i < n; i++) {//-1 5 2 -3
            sum =sum+arr[i]-arr[i-k];//4+2+1
            res=Math.max(res,sum);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubarraySum(arr,n,k));
    }
}
