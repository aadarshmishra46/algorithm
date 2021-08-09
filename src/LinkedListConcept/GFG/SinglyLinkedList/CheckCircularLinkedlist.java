package LinkedListConcept.GFG.SinglyLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class CheckCircularLinkedlist {
    private static int countKSum(int n, int k, int[] arr) {
        int count=0;
        int low=1;
        int high= Arrays.stream(arr).max().getAsInt();
        while (low<high){
            int mid=low+(high-low)/2;
            if(getSum(arr,n,mid)<=k){
                high=mid;
            }
            else{

                low=mid+1;
            }
        }
        return high;
    }
    public static int getSum(int[] arr,int n,int x){

        int sum=0;
        for (int i = 0; i < n; i++) {
            double d=(double) arr[i]/x;
            sum+=(int)Math.ceil(d);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int ans=countKSum(n,k,arr);
        System.out.println(ans);
    }


}
