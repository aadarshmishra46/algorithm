package TwoPointerApproch;

import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void  subArrayWithGivenSum(int[] arr,int n,int k) {
        int sum=arr[0];
        int i=0;
        int start=0;
        for ( i = 1; i <=n ; i++) {
            while (sum > k && start < i - 1) {
                sum = sum - arr[start];
                start++;
            }
            if (sum == k) {
                int p = i - 1;
                System.out.println(start + " " + p);
                return;
            }
            if (i < n)
                sum = sum + arr[i];
        }
        System.out.println("No");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        subArrayWithGivenSum(arr,n,k);
    }
}
