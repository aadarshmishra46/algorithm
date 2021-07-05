package com.company.Array.DsaArena_1DArrays;

import java.util.*;

public class MaxFrequncy {
    //time complexity O(n)
    public  static int maxFrequency(int[] arr,int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }

        }
        Iterator itr=hm.entrySet().iterator();
        int maxCount=0;
        int res=Integer.MIN_VALUE;
        while (itr.hasNext())
        {
            Map.Entry entry=(Map.Entry)itr.next();
            int count=(Integer)entry.getValue();
            int element=(Integer)entry.getKey();
            if(maxCount<=count && element>res)
            {
                maxCount=count;
                res=element;
            }
        }
       return  res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println(maxFrequency(arr,n));
    }
}
