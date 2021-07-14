package CollectionConcept.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class SubArraySumWithNegativeAlso {
    public static String checkSum(int[] arr,int n,int k){
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            sum +=arr[i];
            if(hs.contains(k-sum)){
                System.out.println(i);

                return "Yes";

            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(checkSum(arr,n,k));
    }
}
