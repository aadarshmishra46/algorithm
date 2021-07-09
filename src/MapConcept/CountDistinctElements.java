package MapConcept;

import java.util.*;

public class CountDistinctElements {
    public static void countDistinctElements(int[] arr, int n, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < k; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.print(hm.size()+" ");//3
        for (int i = k; i <n ; i++) {
            if(hm.get(arr[i-k])==1){
                hm.remove(arr[i-k]);
            }
            else{
                hm.put(arr[i-k],hm.get(arr[i-k])-1);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            System.out.print(hm.size()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countDistinctElements(arr, n, k);
    }
}
