package MapConcept;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountDuplicate {
    public static void countDuplicate(int[] arr, int n){
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (int i = 0; i <n ; i++) {
            if(tm.containsKey(arr[i]))
            {
                tm.put(arr[i],tm.get(arr[i])+1);
            }
            else
            {
                tm.put(arr[i],1);
            }

        }
        //System.out.println(tm);
        for(Map.Entry e:tm.entrySet()){
            if((Integer)e.getValue()>1)
            {
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        countDuplicate(arr,n);
    }
}
