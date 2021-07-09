package MapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountPairsWithGivenSum {
    public static void countPairsWithGivenSum(int[] arr, int n, int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }

        }
        // 1 5 7 1
        // 1=2 5=1 7=1
        //System.out.println(hm);
        long twiceCount=0;
        for (int i = 0; i < n; i++) {
            if(hm.get(k-arr[i]) !=null){//
                twiceCount +=hm.get(k-arr[i]);//1
            }
            if(k-arr[i]==arr[i]){
                twiceCount--;
            }
        }
        System.out.println(twiceCount/2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        countPairsWithGivenSum(arr,n, k);
    }
}
